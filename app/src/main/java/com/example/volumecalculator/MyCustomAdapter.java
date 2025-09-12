package com.example.volumecalculator;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.google.android.material.imageview.ShapeableImageView;

import java.util.ArrayList;

public class MyCustomAdapter extends ArrayAdapter<Shape> {
    private ArrayList<Shape> shapesArrayList;
    Context context;

    public MyCustomAdapter(ArrayList<Shape> shapesArrayList, Context context) {
        super(context, R.layout.grid_item_layout, shapesArrayList);
        this.shapesArrayList = shapesArrayList;
        this.context = context;
    }

    private static class MyViewHolder {
        TextView shapeName;
        ShapeableImageView shapeImage;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        Shape shape = getItem(position);
        MyViewHolder myViewHolder;
        if (convertView == null) {
            myViewHolder = new MyViewHolder();
            LayoutInflater inflater = LayoutInflater.from(getContext());
            convertView = inflater.inflate(R.layout.grid_item_layout, parent, false);
            myViewHolder.shapeName = (TextView) convertView.findViewById(R.id.textView);
            myViewHolder.shapeImage = (ShapeableImageView) convertView.findViewById(R.id.imageView);
            convertView.setTag(myViewHolder);
        } else {
            myViewHolder = (MyViewHolder) convertView.getTag();
        }

        myViewHolder.shapeName.setText(shape.getShapeText());
        myViewHolder.shapeImage.setImageResource(shape.getShapeImage());

        return convertView;
    }
}
