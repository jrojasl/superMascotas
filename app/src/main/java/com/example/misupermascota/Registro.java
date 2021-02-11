package com.example.misupermascota;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import clases.Mascota;

public class Registro extends AppCompatActivity {

    private EditText etNombreM;
    private RadioButton rdTipo1, rdTipo2;
    private String tipo1 = "perro", tipo2 = "gato";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);
        casteo();
    }

    public void casteo(){
       etNombreM = (EditText) findViewById(R.id.etNombreMascota);
       rdTipo1 = (RadioButton) findViewById(R.id.rdTipo1);
       rdTipo2 = (RadioButton) findViewById(R.id.rdTipo2);
    }

    public void total_pago(View view){
        String nombre = etNombreM.getText().toString();
        if(nombre.isEmpty()){
            Toast.makeText(this, "Ingrese el nombre de la mascota", Toast.LENGTH_LONG).show();
            return;
        }

        String tipo_m ;
        if(rdTipo1.isChecked()) tipo_m = tipo1;
        else if(rdTipo2.isChecked()) tipo_m = tipo2;
        else {
            Toast.makeText(this, "Seleccione el tipo de mascota", Toast.LENGTH_LONG).show();
            return;
        }


        Mascota mascota = new Mascota(nombre, tipo_m);
        double pago = mascota.pago();

        Intent resultado_pago = new Intent(this, Pago.class);
        resultado_pago.putExtra("pago", pago);
        resultado_pago.putExtra("nombre", mascota.getNombre());
        resultado_pago.putExtra("tipo", mascota.getTipo());
        startActivity(resultado_pago);

    }


}