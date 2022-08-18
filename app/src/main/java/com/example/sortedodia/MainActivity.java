package com.example.sortedodia;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private TextView  textViewTitle;
    private Button buttonAction;
    private ArrayList<String> randomPhrases = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        randomPhrases.add("Comprar pizza para o professor");
        randomPhrases.add("Chamar o professor para o churras");
        randomPhrases.add("Chamar o professor para andar de cart");

        textViewTitle = findViewById(R.id.text_title);
        buttonAction = findViewById(R.id.button_action);

        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int position = new Random().nextInt(randomPhrases.size());
                textViewTitle.setText(randomPhrases.get(position));
            }
        };

        buttonAction.setOnClickListener(listener);
    }
}