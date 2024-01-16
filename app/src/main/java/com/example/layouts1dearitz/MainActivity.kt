package com.example.layouts1dearitz

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.frame_layout)

        val botonSuperior : Button = findViewById(R.id.btnArriba)
        val botonCentro : Button = findViewById(R.id.btnCentro)
        val botonInferior : Button = findViewById(R.id.btnAbajo)

        botonSuperior.setOnClickListener{//Clicando el de arriba se puede cambiar de layouts
            setContentView(R.layout.linear_layaout)
        }

    }
}