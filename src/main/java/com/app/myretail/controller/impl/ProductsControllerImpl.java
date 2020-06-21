package com.app.myretail.controller.impl;

import com.app.myretail.contracts.ProductInfoRequest;
import com.app.myretail.contracts.ProductInfoResponse;
import com.app.myretail.controller.ProductsController;
import com.app.myretail.service.ProductsService;
import org.springframework.web.bind.annotation.RestController;
import com.app.myretail.exception.ProductNotFoundException;
import lombok.SneakyThrows;
import org.springframework.web.bind.annotation.ExceptionHandler;

@RestController(value = "Products")
public class ProductsControllerImpl implements ProductsController {
    final ProductsService productsService;

    public ProductsControllerImpl(ProductsService productsService) {
        this.productsService = productsService;
    }

    @Override
    public ProductInfoResponse getProductInfo(Long id) {
        return productsService.getProductInfo(String.valueOf(id));
    }

    @Override
    public void updateProductInfo(Long id, ProductInfoRequest productInfoRequest) {
        productsService.updateProductInfo(
                productInfoRequest.setProductId(id)
        );
    }
}
