package com.example.volumecalculator;

import android.content.Intent;
import android.os.Bundle;
import android.widget.AdapterView;
import android.widget.GridView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        GridView gridView = findViewById(R.id.gridView);
        ArrayList<Shape> shapeArrayList = new ArrayList<>();

        Shape sphere = new Shape(R.drawable.sphere, "Sphere");
        Shape cylinder = new Shape(R.drawable.cylinder, "Cylinder");
        Shape cube = new Shape(R.drawable.cube, "Cube");
        Shape prism = new Shape(R.drawable.prism, "Prism");

        shapeArrayList.add(sphere);
        shapeArrayList.add(cylinder);
        shapeArrayList.add(cube);
        shapeArrayList.add(prism);

        MyCustomAdapter adapter = new MyCustomAdapter(shapeArrayList, MainActivity.this);

        gridView.setAdapter(adapter);
        gridView.setNumColumns(2);

        // Handle item clicks
        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, android.view.View view, int position, long id) {
                Shape clickedShape = shapeArrayList.get(position);
                if (clickedShape.getShapeText().equals("Sphere")) {
                    Intent intent = new Intent(MainActivity.this, SphereActivity.class);
                    startActivity(intent);
                }

                // You can add more if-else conditions for Cylinder, Cube, Prism later
            }
        });
    }
}
