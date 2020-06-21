package com.app.myretail.controller;

import com.app.myretail.contracts.ProductInfoRequest;
import com.app.myretail.contracts.ProductInfoResponse;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/products")
public interface ProductsController {
    @GetMapping("/{id}")
    ProductInfoResponse getProductInfo(@PathVariable Long id);

    @PutMapping("/{id}")
    void updateProductInfo(@PathVariable Long id, @RequestBody ProductInfoRequest productInfoRequest);
}
