package com.example.teste05;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private EditText numeroEditText;
    private Button calcularButton;
    private TextView tabuadaTextView;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        numeroEditText = findViewById(R.id.numeroEditText);
        calcularButton = findViewById(R.id.calcularButton);
        tabuadaTextView = findViewById(R.id.tabuadaTextView);

        calcularButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Obter o número inserido pelo usuário
                int num = Integer.parseInt(numeroEditText.getText().toString());

                // Calcular a tabuada
                String tabuada = "";
                for (int i = 1; i <= 10; i++) {
                    tabuada += num + " x " + i + " = " + (num*i) + "\n";
                }

                // Exibir a tabuada na TextView
                tabuadaTextView.setText(tabuada);
            }
        });
    }
}