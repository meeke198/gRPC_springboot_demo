package com.b4u.grpc.product.repository;

import com.b4u.grpc.product.domain.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Integer> {
}
