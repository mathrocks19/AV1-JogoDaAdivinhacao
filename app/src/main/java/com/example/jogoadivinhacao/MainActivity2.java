package com.example.jogoadivinhacao;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

<<<<<<< HEAD
import android.widget.ImageView;

=======
>>>>>>> 9714e8c96778c19417c44a02f7333260abe22def
public class MainActivity2 extends AppCompatActivity {
    private TextView textViewNome;
    private EditText editTextNumero;
    private Button buttonVerificar;
    private TextView textViewResultado;
<<<<<<< HEAD
    private ImageView imageViewResultado;
=======
>>>>>>> 9714e8c96778c19417c44a02f7333260abe22def

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activitymain2);

        textViewNome = findViewById(R.id.textViewNome);
        editTextNumero = findViewById(R.id.editTextNumero);
        buttonVerificar = findViewById(R.id.buttonVerificar);
        textViewResultado = findViewById(R.id.textViewResultado);
<<<<<<< HEAD
        imageViewResultado = findViewById(R.id.imageViewResultado);
        Button buttonVoltar = findViewById(R.id.buttonVoltar);
=======
>>>>>>> 9714e8c96778c19417c44a02f7333260abe22def

        String nome = getIntent().getStringExtra("NOME_USUARIO");
        textViewNome.setText("Bem-vindo, " + nome + "!");

<<<<<<< HEAD
        // Define a imagem de adivinhação inicialmente
        imageViewResultado.setImageResource(R.drawable.adivinhaimage);

=======
>>>>>>> 9714e8c96778c19417c44a02f7333260abe22def
        buttonVerificar.setOnClickListener(v -> {
            String numeroStr = editTextNumero.getText().toString();
            if ("33".equals(numeroStr)) {
                textViewResultado.setText("Você acertou!");
<<<<<<< HEAD
                imageViewResultado.setImageResource(R.drawable.quemacertouvoce);
            } else {
                textViewResultado.setText("Tente novamente.");
                imageViewResultado.setImageResource(R.drawable.tentenovamentedeus);
            }
        });

        buttonVoltar.setOnClickListener(v -> {
            finish(); // Retorna à MainActivity
        });
    }
}

=======
            } else {
                textViewResultado.setText("Tente novamente.");
            }
        });
    }
}
>>>>>>> 9714e8c96778c19417c44a02f7333260abe22def
