package com.example.volumecalculator;

public class Shape {
    int ShapeImage;
    String ShapeText;

    public Shape(int shapeImage, String shapeText) {
        ShapeImage = shapeImage;
        ShapeText = shapeText;
    }

    public int getShapeImage() {
        return ShapeImage;
    }

    public void setShapeImage(int shapeImage) {
        ShapeImage = shapeImage;
    }

    public String getShapeText() {
        return ShapeText;
    }

    public void setShapeText(String shapeText) {
        ShapeText = shapeText;
    }
}
