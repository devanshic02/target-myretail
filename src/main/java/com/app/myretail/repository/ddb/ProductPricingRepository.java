package com.app.myretail.repository.ddb;

import com.app.myretail.entity.ProductsEntity;
import org.socialsignin.spring.data.dynamodb.repository.EnableScan;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

@EnableScan
public interface ProductPricingRepository extends CrudRepository<ProductsEntity, String> {
    Optional<ProductsEntity> findProductsEntityByProductId(String productId);
}
