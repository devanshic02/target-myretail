package com.app.myretail.entity;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAttribute;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBHashKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTable;

@DynamoDBTable(tableName = "MYRETAIL_PRODUCTS")
public class ProductsEntity {
    private String productId;
    private Float currencyVal;
    private String currencyCode;

    @DynamoDBHashKey(attributeName = "PRODUCT_ID")
    public String getProductId() {
        return this.productId;
    }

    public ProductsEntity setProductId(String productId) {
        this.productId = productId;
        return this;
    }

    @DynamoDBAttribute(attributeName = "CURRENCY_VAL")
    public Float getCurrencyVal() {
        return currencyVal;
    }

    public ProductsEntity setCurrencyVal(Float currencyVal) {
        this.currencyVal = currencyVal;
        return this;
    }

    @DynamoDBAttribute(attributeName = "CURRENCY_CODE")
    public String getCurrencyCode() {
        return currencyCode;
    }

    public ProductsEntity setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
        return this;
    }
}
