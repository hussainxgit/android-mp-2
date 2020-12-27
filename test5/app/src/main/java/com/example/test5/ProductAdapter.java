package com.example.test5;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class ProductAdapter extends RecyclerView.Adapter {
    List<Product> productArray;
    Context context;

    public ProductAdapter(ArrayList<Product> productArray, Context context) {
        this.productArray = productArray;
        this.context = context;
    }

    @NonNull
    // Create new views (invoked by the layout manager)
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType) {
        // Create a new view, which defines the UI of the list item
        View view = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.products_list_item, viewGroup, false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, final int position) {
        ViewHolder.getProductName().setText(productArray.get(position).getProductName());
//        ViewHolder.getProductDescription().setText(productArray.get(position).getProductDescription());
    }

    @Override
    public int getItemCount() {
        return productArray.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder{
        public static TextView productName;
        public static ImageView productImage;
        public static TextView productDescription;
        private View view;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            view = itemView;
            productName = view.findViewById(R.id.productName);
//            productDescription = view.findViewById(R.id.productDescription);
            productImage = view.findViewById(R.id.productImage);
        }

        public static TextView getProductName() {
            return productName;
        }

        public static TextView getProductDescription() {
            return productDescription;
        }

        public static ImageView getProductImage() {
            return productImage;
        }
    }

}
