package com.example.lab1w2;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

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

        Button b = findViewById(R.id.btnNext);
        b.setOnClickListener(v->{
            Log.d("BTN", "onCreate: button was used");
            Toast.makeText(MainActivity.this, "This is a toast", Toast.LENGTH_LONG).show();

            Intent i = new Intent(MainActivity.this, SecondActivity.class);
            startActivity(i);
        });

        TextView t = findViewById(R.id.txtStudentId);
        //t.setText("This is text set in class");

    }
}