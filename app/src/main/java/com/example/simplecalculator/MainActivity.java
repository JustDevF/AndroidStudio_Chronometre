package com.example.simplecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //création des variables pour gérer les views

        //récupèration des id stockés dans des variables
        final EditText firstNumber = findViewById(R.id.number1);
        final EditText secondNumber = findViewById(R.id.number2);
        final RadioGroup operators = findViewById(R.id.operators);
        final RadioButton add = findViewById(R.id.add);
        final RadioButton substract = findViewById(R.id.substract);
        final Button equals = findViewById(R.id.equals);
        final TextView result = findViewById(R.id.result);

        //Création de listener sur le button equals
        equals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                //récupération de nombre en entier, convertir la chaîne de caractère en entier et stocker les dans des variables int
                final int firstNumberValue = Integer.parseInt(firstNumber.getText().toString());
                final int secondNumberValue = Integer.parseInt(secondNumber.getText().toString());

                //récupération de l'id de l'opérateur  séléctionné par l'utilisateur depuis le RadioGroup
                final int operatorButtonId = operators.getCheckedRadioButtonId();

                //création de la var pour stocker le résultat
                Integer answer;

                //La condition pour calculer les deux nombres saisi par l'utilisateur
                if (operatorButtonId == add.getId()) {
                    //addition
                    answer = firstNumberValue + secondNumberValue;
                } else {
                    //subtraction
                    answer = firstNumberValue - secondNumberValue;
                }

                result.setText(answer.toString());
            }
        });


    }
}