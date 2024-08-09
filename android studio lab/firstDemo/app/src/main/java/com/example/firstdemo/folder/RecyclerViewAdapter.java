package com.example.firstdemo.folder;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.example.firstdemo.R;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder> {

    private Activity context;
    private int[] image;
    private String[] name;
    private String[] address;

    public RecyclerViewAdapter(Activity context, String[] name, String[] address, int[] image) {
        this.name = name;
        this.address = address;
        this.image = image;
        this.context = context;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(context);
        View listItem = layoutInflater.inflate(R.layout.recyclerview_items, parent, false);
        return new ViewHolder(listItem);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.txtName.setText(name[position]);
        holder.txtAddress.setText(address[position]);
        holder.imageView.setImageResource(image[position]);
    }

    @Override
    public int getItemCount() {
        return name.length;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        TextView txtName, txtAddress;
        ImageView imageView;

        public ViewHolder(View itemView) {
            super(itemView);
            txtName = itemView.findViewById(R.id.txtName);
            txtAddress = itemView.findViewById(R.id.txtAddress);
            imageView = itemView.findViewById(R.id.image);
        }
    }
}
