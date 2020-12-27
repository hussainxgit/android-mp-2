package com.example.test5;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";
    private static final String baseUrl = "http://10.0.2.2:5000/";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final TextView productName = findViewById(R.id.productName);
        final TextView productPrice = findViewById(R.id.productPrice);
        final TextView productDescription = findViewById(R.id.productPrice);

        Retrofit.Builder builder = new Retrofit.Builder()
                .baseUrl(baseUrl)
                .addConverterFactory(GsonConverterFactory.create());

        Retrofit retrofit = builder.build();

        ProductsApi client = retrofit.create(ProductsApi.class);
        Call<Product> call = client.getProduct();

        call.enqueue(new Callback<Product>() {
            @Override
            public void onResponse(Call<Product> call, Response<Product> response) {
                Product product = response.body();
                productName.setText(product.getProductName()+"");
                productPrice.setText(product.getProductPrice()+" KWD");
                productDescription.setText(product.getProductDescription()+"");
            }

            @Override
            public void onFailure(Call<Product> call, Throwable t) {
                Log.e(TAG, t.getMessage().toString());
                Toast.makeText(MainActivity.this, "Error", Toast.LENGTH_SHORT).show();
            }
        });
    }
}