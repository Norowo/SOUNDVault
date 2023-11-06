package com.example.soundvault;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    protected void onResume() {
        super.onResume();

        Intent intent = new Intent(this, MainActivity2.class);
        Button botonInicio = (Button) findViewById(R.id.button);

        botonInicio.setOnClickListener(e -> {
            startActivity(intent);
        });
    }
}