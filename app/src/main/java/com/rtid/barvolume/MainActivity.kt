package com.rtid.barvolume

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var masukanPanjang : EditText
    private lateinit var masukanLebar   : EditText
    private lateinit var masukanTinggi  : EditText
    private lateinit var buttonHitung      : Button
    private lateinit var textHasil       : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        masukanPanjang  = findViewById(R.id.edtPanjang)
        masukanLebar    = findViewById(R.id.edtLebar)
        masukanTinggi   = findViewById(R.id.edtTinggi)
        buttonHitung    = findViewById(R.id.btnHitung)
        textHasil       = findViewById(R.id.txtHasil)

        buttonHitung.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        if (v?.id == R.id.btnHitung){
            val editPanjnag = masukanPanjang.text.toString().trim()
            val editLebar   = masukanLebar.text.toString().trim()
            val editTinggi  = masukanTinggi.text.toString().trim()

            val volume = editLebar.toDouble()*editPanjnag.toDouble()*editTinggi.toDouble()
            textHasil.text = volume.toString()
        }
    }
}