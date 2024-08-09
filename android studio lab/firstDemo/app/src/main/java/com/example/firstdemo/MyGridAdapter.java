package com.example.firstdemo;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class MyGridAdapter extends ArrayAdapter<String> {
    private final Context context;
    private final String[] title;
    private final String[] description;
    private final int[] image;

    public MyGridAdapter(Context context, String[] title, String[] description, int[] image) {
        super(context, R.layout.activity_my_grid_adapter, title);
        this.context = context;
        this.title = title;
        this.description = description;
        this.image = image;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowView = inflater.inflate(R.layout.activity_my_grid_adapter, parent, false);

        // Wire widgets
        TextView txtTitle = rowView.findViewById(R.id.title);
        ImageView imageView = rowView.findViewById(R.id.image);
        TextView txtDescription = rowView.findViewById(R.id.description);

        txtTitle.setText(title[position]);
        imageView.setImageResource(image[position]);
        txtDescription.setText(description[position]);

        return rowView;
    }
}
