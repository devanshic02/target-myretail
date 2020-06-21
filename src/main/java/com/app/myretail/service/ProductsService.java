package com.app.myretail.service;

import com.app.myretail.client.ProductSpecsClient;
import com.app.myretail.client.model.ProductSpecsResponse;
import com.app.myretail.contracts.ProductInfoRequest;
import com.app.myretail.contracts.ProductInfoResponse;
import com.app.myretail.contracts.ProductPricing;
import com.app.myretail.entity.ProductsEntity;
import com.app.myretail.resource.ProductsResource;
import lombok.Data;
import lombok.experimental.Accessors;
import org.springframework.stereotype.Service;

import java.util.Optional;

import static com.app.myretail.mapper.ProductsEntityMapper.generateProductsEntityFroProductsInfoRequest;

@Service
@Accessors(fluent = true)
public @Data class ProductsService {
    final ProductsResource productsResource;
    final ProductSpecsClient productSpecsClient;

    public ProductsService(ProductsResource productsResource, ProductSpecsClient productSpecsClient) {
        this.productsResource = productsResource;
        this.productSpecsClient = productSpecsClient;
    }

    public ProductInfoResponse getProductInfo(String id) {
        ProductInfoResponse productInfoResponse = new ProductInfoResponse();
        Optional<ProductsEntity> productsEntity = productsResource.getProductInfo(id);
        ProductSpecsResponse productSpecsResponse = productSpecsClient.getProductSpecs(id);

        productInfoResponse
                .id(Long.valueOf(id))
                .name(productSpecsResponse
                        .getProductSpecification()
                        .getProductItem()
                        .getProductDescription()
                        .getTitle()
                );

        productsEntity.ifPresent(value -> productInfoResponse
                .currentPrice(
                        new ProductPricing()
                                .currencyCode(value.getCurrencyCode())
                                .value(value.getCurrencyVal()
                                )
                )
        );

        return productInfoResponse;
    }

    public void updateProductInfo(ProductInfoRequest productInfoRequest) {
        productsResource.updateProductInfo(
                generateProductsEntityFroProductsInfoRequest(productInfoRequest)
        );
    }
}
