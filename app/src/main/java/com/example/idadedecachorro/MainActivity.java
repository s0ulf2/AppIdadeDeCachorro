package com.example.idadedecachorro;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
        private EditText caixaDeTexto;
        private Button botaoResultado;
        private TextView resultadoIdade;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        caixaDeTexto = findViewById(R.id.ID_ENTRADA);
        botaoResultado = findViewById(R.id.ID_BUTTON);
        resultadoIdade = findViewById(R.id.ID_RESULTADO);

        botaoResultado.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //converte tipo Edittext para String .getText().toString

                String textoDigitado = caixaDeTexto.getText().toString();

                if (textoDigitado.isEmpty()){
                    resultadoIdade.setText("Fail");
                }
                else {
                    //converte string para int  class Integer
                    int valorDigitado = Integer.parseInt(textoDigitado);
                    int total = valorDigitado * 7;
                    resultadoIdade.setText("A idade do seu cão é : "+ total + "anos.");

                }
                }

        });
    }
}
