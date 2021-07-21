package com.example.t3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class MenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        String snombre = this.getIntent().getStringExtra("nombre");
        Toast.makeText(getApplicationContext(), "Bienvenido: "+snombre, Toast.LENGTH_LONG).show();

    }
}