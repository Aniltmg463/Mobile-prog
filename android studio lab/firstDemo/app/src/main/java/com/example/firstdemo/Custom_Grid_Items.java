package com.example.firstdemo;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class Custom_Grid_Items extends BaseAdapter {
    private Activity context;
    private String[] title;
    private String[] description;
    private int[] image;

    public Custom_Grid_Items(Activity context, String[] title, String[] description, int[] image) {
        this.context = context;
        this.title = title;
        this.description = description;
        this.image = image;
    }

    @Override
    public int getCount() {
        return title.length;
    }

    @Override
    public Object getItem(int position) {
        return title[position];
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder;

        if (convertView == null) {
            LayoutInflater inflater = context.getLayoutInflater();
            convertView = inflater.inflate(R.layout.activity_custom_grid_items, parent, false); // Changed to correct item layout

            holder = new ViewHolder();
            holder.txtTitle = convertView.findViewById(R.id.title);
            holder.imageView = convertView.findViewById(R.id.image);
            holder.txtDescription = convertView.findViewById(R.id.description);

            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }

        holder.txtTitle.setText(title[position]);
        holder.imageView.setImageResource(image[position]);
        holder.txtDescription.setText(description[position]);

        return convertView;
    }

    static class ViewHolder {
        TextView txtTitle;
        ImageView imageView;
        TextView txtDescription;
    }
}
