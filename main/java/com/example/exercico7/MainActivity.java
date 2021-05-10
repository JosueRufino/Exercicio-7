package com.example.exercico7;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    EditText txt1, txt2, txt3;
    TextView txtR1, txtR2, txtR3;

    public void evento(View view){
        txt1 = findViewById(R.id.txt1);
        txt2 = findViewById(R.id.txt2);
        txt3 = findViewById(R.id.txt3);
        txtR1 = findViewById(R.id.txtR1);
        txtR2 = findViewById(R.id.txtR2);
        txtR3 = findViewById(R.id.txtR3);


        Double preco = Double.parseDouble(txt1.getText().toString());
        Double lucro = Double.parseDouble(txt2.getText().toString());
        Double imposto = Double.parseDouble(txt3.getText().toString());

        Double lucrof = (preco * lucro)/100;
        Double impostof = (preco * imposto)/100;
        Double prec = preco + lucrof + impostof;

        txtR1.setText("O valor conrrespondente ao lucro do distribuidor é : " +String.valueOf(lucrof)+ "Kzs");
        txtR2.setText("O valor conrrespondente aos impostos é :" +String.valueOf(impostof)+ "kzs");
        txtR3.setText("O preço final do veículo é : " +String.valueOf(prec)+ "Kzs");





    }

}