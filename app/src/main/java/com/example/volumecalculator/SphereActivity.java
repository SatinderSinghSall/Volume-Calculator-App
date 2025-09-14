package com.example.volumecalculator;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class SphereActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_sphere);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        EditText editText_UserInput = findViewById(R.id.editText_UserInput);
        Button button_CalculateResult = findViewById(R.id.button_CalculateResult);
        TextView textView_Result = findViewById(R.id.textView_Result);

        button_CalculateResult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String radius = editText_UserInput.getText().toString().trim();
                int radius_int = Integer.parseInt(radius);
                double volume = (4 / 3) * 3.14159 * radius_int * radius_int * radius_int;
                textView_Result.setText("Volume: " + volume + "m^3");
            }
        });
    }
}
