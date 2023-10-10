package com.b4u.grpc.product.service;

import com.b4u.grpc.lib.product.*;
import com.b4u.grpc.product.domain.Product;
import com.b4u.grpc.product.repository.ProductRepository;
import com.google.protobuf.Empty;
import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;



@GrpcService
public class ProductService extends ProductServiceGrpc.ProductServiceImplBase {

    @Autowired
    private ProductRepository productRepository;

    @Override
    public void createProduct(CreateProductRequest request, StreamObserver<CreateProductResponse> responseObserver) {
        Product product = new Product(request.getName(), request.getPrice(), request.getQuantity(), request.getDescription());
        Product newProduct = productRepository.save(product);
        CreateProductResponse createProductResponse = CreateProductResponse.newBuilder()
                .setProductId(newProduct.getId())
                .build();
        responseObserver.onNext(createProductResponse);
        responseObserver.onCompleted();
    }

    @Override
    public void getProduct(GetProductRequest request, StreamObserver<ProductResponse> responseObserver) {
        Integer productId = request.getProductId();
        Product product = productRepository.getById(productId);
        ProductResponse productResponse = ProductResponse.newBuilder()
            .setProductId(productId)
            .setName(product.getName())
            .setPrice(product.getPrice())
            .setQuantity(product.getQuantity())
            .setDescription(product.getDescription())
            .build();
        responseObserver.onNext(productResponse);
        responseObserver.onCompleted();
    }

    @Override
    public void getListProduct(Empty request, StreamObserver<Products> responseObserver) {
        List<Product> productList = productRepository.findAll();
        List<ProductResponse> productResponseList = new ArrayList<>();
        productList.stream()
                .map(product -> ProductResponse.newBuilder()
                        .setProductId(product.getId())
                        .setName(product.getName())
                        .setPrice(product.getPrice())
                        .setQuantity(product.getQuantity())
                        .setDescription(product.getDescription())
                        .build())
                .toList();
        Products products = Products.newBuilder()
                .addAllProduct(productResponseList)
//                .addAllProduct(productList)
                .build();

        // Send the Products message as a response
        responseObserver.onNext(products);
        responseObserver.onCompleted();
    }
}
