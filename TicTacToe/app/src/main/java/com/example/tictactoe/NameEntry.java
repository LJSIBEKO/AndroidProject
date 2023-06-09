package com.example.tictactoe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class NameEntry extends AppCompatActivity {



    EditText player1;
    EditText player2;
    Button startGame;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_name_entry);

        player1=findViewById(R.id.player1);
        player2=findViewById(R.id.player2);

        startGame=findViewById(R.id.start);



        startGame.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {



                if(TextUtils.isEmpty(player1.getText())){
                    player1.setError("Name Required!!!");
                }else if(TextUtils.isEmpty(player2.getText())){
                    player2.setError("Name Required!!!");
                }else{
                    Intent myIntent=new Intent(NameEntry.this,Game.class);
                    myIntent.putExtra("player1",player1.getText().toString());
                    myIntent.putExtra("player2",player2.getText().toString());

                    startActivity(myIntent);
                }
            }
        });


    }
}