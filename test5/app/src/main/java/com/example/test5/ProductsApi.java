package com.example.test5;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface ProductsApi {

    @GET("/products")
    Call<ArrayList<Product>> getProducts();

    @GET("/product")
    Call<Product> getProduct();

}
