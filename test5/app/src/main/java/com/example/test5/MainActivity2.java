package com.example.test5;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.net.URL;
import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity2 extends AppCompatActivity {
    private static final String TAG = "MainActivity";
    private static final String baseUrl = "http://10.0.2.2:5000/";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

//        Retrofit.Builder builder = new Retrofit.Builder()
//                .baseUrl(baseUrl)
//                .addConverterFactory(GsonConverterFactory.create());
//        Retrofit retrofit = builder.build();
//        ProductsApi client = retrofit.create(ProductsApi.class);
//
//        Call<ArrayList<Product>> call = client.getProducts();
//        call.enqueue(new Callback<ArrayList<Product>>() {
//            @Override
//            public void onResponse(Call<ArrayList<Product>> call, Response<ArrayList<Product>> response) {
//                ArrayList<Product> productsList = response.body();
//
//                // Fake Data
//                Product prdct1 = new Product(1, "Spider plant", "img", "Hello world", 1.5);
//                Product prdct2 = new Product(2, "Yousif", "img", "Hello world", 2.5);
//                ArrayList<Product> productsLocal = new ArrayList<>();
//                productsLocal.add(prdct1);
//                productsLocal.add(prdct2);
//
//                // Lookup the recyclerview in activity layout
//                RecyclerView productsListView = (RecyclerView) findViewById(R.id.rv);
//
//                // Attach the adapter to the recyclerview to populate items
//                productsListView.setHasFixedSize(true);
//                // Set layout manager to position the items
//                productsListView.setLayoutManager(new GridLayoutManager(MainActivity2.this, 2));
//                // That's all! :(
//                ProductAdapter pa = new ProductAdapter(productsLocal, MainActivity2.this);
//                productsListView.setAdapter(pa);
//            }
//            @Override
//            public void onFailure(Call<ArrayList<Product>> call, Throwable t) {
//                Log.e(TAG, t.getMessage().toString());
//                Toast.makeText(MainActivity2.this, "Error", Toast.LENGTH_SHORT).show();
//            }
//        });

        // Fake Data
        Product prdct1 = new Product(1, "Spider plant", "img", "Hello world", 1.5);
        Product prdct2 = new Product(2, "Yousif", "img", "Hello world", 2.5);
        ArrayList<Product> productsLocal = new ArrayList<>();
        productsLocal.add(prdct1);
        productsLocal.add(prdct2);

        // Lookup the recyclerview in activity layout
        RecyclerView productsListView = (RecyclerView) findViewById(R.id.rv);

        // Attach the adapter to the recyclerview to populate items
        productsListView.setHasFixedSize(true);
        // Set layout manager to position the items
        productsListView.setLayoutManager(new GridLayoutManager(MainActivity2.this, 2));
        // That's all! :(
        ProductAdapter pa = new ProductAdapter(productsLocal, MainActivity2.this);
        productsListView.setAdapter(pa);

    }
}