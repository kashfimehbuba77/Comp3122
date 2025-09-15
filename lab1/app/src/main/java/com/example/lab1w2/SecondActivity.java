package com.example.lab1w2;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_second);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        Button www = findViewById(R.id.btn_www);
        www.setOnClickListener(v->{
            Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.georgebrown.ca/"));
            startActivity(i);
        });

        Button call = findViewById(R.id.btnCall);
        call.setOnClickListener(v->{
            Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("tel: 416-764-3424"));
            startActivity(i);
        });

        Button map = findViewById(R.id.btnMap);
        map.setOnClickListener(v->{
            Intent i = new Intent(Intent.ACTION_VIEW,
                    Uri.parse("geo:43.6711247, -79.4141207?z=21"));
            startActivity(i);
        });

        Button back = findViewById(R.id.btnBack);
        back.setOnClickListener(v->{
            // terminate current activity and go back to previous one
            finish();
        });

    }
}