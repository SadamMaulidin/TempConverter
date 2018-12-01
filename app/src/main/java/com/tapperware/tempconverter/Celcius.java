package com.tapperware.tempconverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.TextView;

public class Celcius extends AppCompatActivity {
    EditText fromReamur,fromKelvin,fromFahrenheit;
    TextView txtHasilKelvin, txtHasilReamur,txtHasilFahrenheit;
    Button btnReamur,btnKelvin,btnfahrenheit;
    Double hasil,reamur,fahrenheit,kelvin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_celcius);

        fromFahrenheit = findViewById(R.id.from_fahrenheit);
        fromKelvin = findViewById(R.id.from_kelvin);
        fromReamur = findViewById(R.id.from_reamur);
        txtHasilKelvin = findViewById(R.id.txtHasilKelvin);
        txtHasilReamur = findViewById(R.id.txtHasilReamur);
        txtHasilFahrenheit = findViewById(R.id.txtHasilFahrenheit);
        btnfahrenheit = findViewById(R.id.btnConvertFahrenheit);
        btnKelvin = findViewById(R.id.btnConvertkelvin);
        btnReamur = findViewById(R.id.btnConvertReamur);

        btnReamur.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String isiReamur = fromReamur.getText().toString();


                Double reamur = Double.valueOf(isiReamur);
                conversiDariReamur(reamur);


            }
        });

        btnKelvin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String isiKelvin = fromKelvin.getText().toString();

                Double kelvin = Double.valueOf(isiKelvin);
                conversiDariKelvin(kelvin);


            }
        });

        btnfahrenheit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String isiFahrenheit = fromFahrenheit.getText().toString();

                Double fahrenheit = Double.valueOf(isiFahrenheit);
                conversiDariFahrenheit(fahrenheit);
            }
        });
    }

    private void conversiDariReamur (Double reamur){
        Double hasilR = (5 * reamur) / 4;
        txtHasilReamur.setText(String.valueOf(hasilR));

    }
    private void conversiDariKelvin (Double kelvin){
        Double hasilK = kelvin - 273;
        txtHasilKelvin.setText(String.valueOf(hasilK));

    }
    private void conversiDariFahrenheit (Double fahrenheit){
        hasil = (5  * (fahrenheit - 32)) / 9;
        txtHasilFahrenheit.setText(String.valueOf(hasil));

    }
}

