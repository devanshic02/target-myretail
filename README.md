myRetail is a rapidly growing company with HQ in Richmond, 
VA and over 200 stores across the east coast. 
target-myRetail wants to make its internal data available to any number of client devices,
from myRetail.com to native mobile apps. 

The goal for this exercise is to create an end-to- end Proof-of- Concept for a products API,
which will aggregate product data from multiple sources and return it as JSON to the caller. 
The goal is to create a RESTful service that can retrieve product and price details by ID.

Requirement
===========
Example product IDs: 13860428, 54456119, 13264003, 12954218) 
•	Example response: {"id":13860428,"name":"The Big Lebowski (Blu-ray) (Widescreen)","current_price":{"value": 13.49,"currency_code":"USD"}}
•	Perform HTTP GET to retrieve the product name from an external API. (For this exercise the data will come from redsky.target.com)  
•	Example: http://redsky.target.com/v2/pdp/tcin/13860428?excludes=taxonomy,price,promotion,bulk_ship,rating_and_review_reviews,rating_and_review_statistics,question_answer_statistics

Note:
====
1. The project is developed using SpringBoot
2. Project uses Swagger API for testing the API's
3. It uses DynamoDb to store pricing data

Steps To execute:
=================
1. Run "mvn clean install" in the parent folder
2. Run "java -jar /Users/dchoudhary1/.m2/repository/com/app/myretail/0.0.1-SNAPSHOT/myretail-0.0.1-SNAPSHOT.jar" 
(Replace the path with your folder structure"
3. Make sure no application is running on port 8080
4. Hit the URL " http://localhost:8080/swagger-ui.html#/products-controller-impl/ " and test APIs

Operations supported:
===================
1 http://localhost:8080/v2/api-docs/products-controller-impl/products/{id}
•	Responds to an HTTP GET request at /products/{id} and delivers product data as JSON (where {id} will be a number. 

2 http://localhost:8080/v2/api-docs/products-controller-impl/products/{id}
•	 Accepts an HTTP PUT request at the same path (/products/{id}), containing a JSON request body similar to the GET response,
and updates the product’s price in the data store. 
