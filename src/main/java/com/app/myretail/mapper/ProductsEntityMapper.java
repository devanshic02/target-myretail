package com.app.myretail.mapper;

import com.app.myretail.contracts.ProductInfoRequest;
import com.app.myretail.contracts.ProductPricing;
import com.app.myretail.entity.ProductsEntity;

public class ProductsEntityMapper {
    public static ProductsEntity generateProductsEntityFroProductsInfoRequest(ProductInfoRequest productInfoRequest) {
        ProductPricing currentPrice = productInfoRequest.getCurrentPrice();

        return new ProductsEntity()
                .setProductId(String.valueOf(productInfoRequest.getProductId()))
                .setCurrencyCode(currentPrice.currencyCode())
                .setCurrencyVal(currentPrice.value());
    }
}
