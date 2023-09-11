package com.example.individual_6;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.navigation.Navigation;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.individual_6.databinding.ItemBinding;

import java.util.List;

public class Adapter extends RecyclerView.Adapter  <Adapter.ViewHolder> {
    private List<Image> images;


    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        ItemBinding binding = ItemBinding.inflate(LayoutInflater.from(parent.getContext()),parent,false);
        return new ViewHolder(binding);
    }


    public void onBindViewHolder(@NonNull Adapter.ViewHolder holder, int position) {
        Image item = images.get(position);
        holder.showData(item);
    }


    public int getItemCount() {
        return images.size();
    }
    public void setData(List<Image> images) {
        this.images = images;
    }


    public class ViewHolder extends RecyclerView.ViewHolder {
        private  ItemBinding itemBinding;
        public ViewHolder(@NonNull ItemBinding binding) {
            super(binding.getRoot());
            itemBinding = binding;
        }
        public void showData( Image image) {
            itemBinding.textView.setText(image.getName());


            Glide.with(itemBinding.getRoot()).load(image.getImageUrl()).into(itemBinding.imageView2);
            itemBinding.Constraint.setOnClickListener(v->{
                Bundle bundle = new Bundle();
                bundle.putString("nombre",image.getName());
                bundle.putString("url",image.getImageUrl());
                Navigation.findNavController(itemBinding.getRoot()).navigate(R.id.action_firstFragment_to_secondFragment,bundle);
            });
        }


    }

}
