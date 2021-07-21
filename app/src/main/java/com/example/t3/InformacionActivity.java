package com.example.t3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class InformacionActivity extends AppCompatActivity implements View.OnClickListener{

    EditText jtxtNombre, jtxtDni, jtxtCorreo, jtxtCelular;
    Button jbtnIngresar, jbtnSalir;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_informacion);

        jtxtNombre = findViewById(R.id.txtNombre);
        jtxtDni = findViewById(R.id.txtDni);
        jtxtCorreo = findViewById(R.id.txtCorreo);
        jtxtCelular = findViewById(R.id.txtCelular);
        jbtnIngresar = findViewById(R.id.btnIngresar);
        jbtnSalir = findViewById(R.id.btnSalir);

        jbtnIngresar.setOnClickListener(this);
        jbtnSalir.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId())
        {
            case R.id.btnIngresar:
                validarUsuario();
                break;

            case R.id.btnSalir:
                salirApp();
                break;
        }
    }

    private void validarUsuario() {
        String snombre =jtxtNombre.getText().toString().trim();
        String sdni = jtxtDni.getText().toString().trim();
        String scorreo = jtxtCorreo.getText().toString().trim();
        String scelular = jtxtCelular.getText().toString().trim();

        if(snombre.isEmpty() || sdni.isEmpty() || scorreo.isEmpty() || scelular.isEmpty())
        {
            Toast.makeText(getApplicationContext(), "Rellene el campo", Toast.LENGTH_SHORT).show();
            jtxtNombre.requestFocus();
            return;
        }

        else
        {
            Intent iMenu = new Intent(getApplicationContext(), MenuActivity.class);
            iMenu.putExtra("nombre",snombre);
            iMenu.putExtra("dni", sdni);
            iMenu.putExtra("correo", scorreo);
            iMenu.putExtra("celular", scelular);
            startActivity(iMenu);
            finish();
        }
    }

    private void salirApp() {
        System.exit(0);
    }

}