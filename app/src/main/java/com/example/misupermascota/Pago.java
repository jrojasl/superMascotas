package com.example.misupermascota;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Pago extends AppCompatActivity {


    private TextView tvResultadoPago;
    private TextView tvResultadoTipo;
    private TextView tvResultadoNombre;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pago);

        impresionPantalla();
    }

    private void impresionPantalla(){
        Bundle recoge_datos = getIntent().getExtras();
        double pago = recoge_datos.getDouble("pago");
        String nombre = recoge_datos.getString("nombre");
        String tipo = recoge_datos.getString("tipo");

        casteo();

        tvResultadoNombre.setText(nombre);
        tvResultadoTipo.setText(tipo);
        tvResultadoPago.setText("Total a pagar: "+pago);
    }

    public void casteo(){

        tvResultadoNombre =(TextView) findViewById(R.id.tvResultadoNombre);
        tvResultadoTipo =(TextView) findViewById(R.id.tvResultadoTipo);
        tvResultadoPago =(TextView) findViewById(R.id.tvResultadoPago);

    }

    public void terminar(View view){
        startActivity(new Intent(this, MainActivity.class));
    }
}