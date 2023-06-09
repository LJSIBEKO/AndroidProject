package com.example.tictactoe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Game extends AppCompatActivity {

    TextView player1name;
    TextView player2name;
    int player1Score=0;
    TextView textView4;
    int player2Score=0;
    TextView textView6;


    Button btn00;
    Button btn01;
    Button btn02;

    Button btn10;
    Button btn11;
    Button btn12;

    Button btn20;
    Button btn21;
    Button btn22;

    Button clearBtn;

    int countAction=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

        Intent myIntent=getIntent();
        player1name=findViewById(R.id.textView3);
        player2name=findViewById(R.id.textView5);

        player1name.setText(myIntent.getExtras().get("player1").toString()+" - X");
        player2name.setText(myIntent.getExtras().get("player2").toString()+" - 0");

        textView4=findViewById(R.id.textView4);
        textView6=findViewById(R.id.textView6);

        btn00=findViewById(R.id.btn10);
        btn01=findViewById(R.id.btn11);
        btn02=findViewById(R.id.btn12);

        btn10=findViewById(R.id.btn20);
        btn11=findViewById(R.id.btn21);
        btn12=findViewById(R.id.btn22);

        btn20=findViewById(R.id.btn30);
        btn21=findViewById(R.id.btn31);
        btn22=findViewById(R.id.btn32);
        clearBtn=findViewById(R.id.clear);


        btn00.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                pressedButton(btn00,xo(countAction));
                countAction++;
                wonORnot(btn00.getText().toString(),countAction);

            }
        });

        btn01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pressedButton(btn01,xo(countAction));
                countAction++;
                wonORnot(btn01.getText().toString(),countAction);
            }
        });

        btn02.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                pressedButton(btn02,xo(countAction));
                countAction++;
                wonORnot(btn02.getText().toString(),countAction);
            }
        });

        btn10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                pressedButton(btn10,xo(countAction));
                countAction++;
                wonORnot(btn10.getText().toString(),countAction);
            }
        });

        btn11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                pressedButton(btn11,xo(countAction));
                countAction++;
                wonORnot(btn11.getText().toString(),countAction);
            }
        });

        btn12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pressedButton(btn12,xo(countAction));
                countAction++;
                wonORnot(btn12.getText().toString(),countAction);
            }
        });

        btn20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                pressedButton(btn20,xo(countAction));
                countAction++;
                wonORnot(btn20.getText().toString(),countAction);
            }
        });

        btn21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                pressedButton(btn21,xo(countAction));
                countAction++;
                wonORnot(btn21.getText().toString(),countAction);
            }
        });

        btn22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                pressedButton(btn22,xo(countAction));
                countAction++;
                wonORnot(btn22.getText().toString(),countAction);
            }
        });

        clearBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                clearAll();

            }
        });


    }
    public void pressedButton(Button btn,String text)
    {
        btn.setText(text);
        btn.setEnabled(false);
        btn.setBackgroundColor(Color.parseColor("Grey"));
        btn.setTextColor(Color.parseColor("black"));
    }
    public String xo(int num){

        String xoro="";
        if(num%2==0){
            xoro="X";
        }else{
            xoro="O";
        }

        return xoro;
    }


    public void wonORnot(String player,int num){







        if(
                (btn00.getText().equals(player)&&btn01.getText().equals(player)&&btn02.getText().equals(player))
        ){
            wonColors(btn00,btn01,btn02,player);
            disableAll(btn10,btn11,btn12,btn20,btn21,btn22);
            countUserWon(player);
        }else if((btn10.getText().equals(player)&&btn11.getText().equals(player)&&btn12.getText().equals(player))){
            wonColors(btn10,btn11,btn12,player);
            disableAll(btn00,btn01,btn02,btn20,btn21,btn22);
            countUserWon(player);
        } else if (btn20.getText().equals(player)&&btn21.getText().equals(player)&&btn22.getText().equals(player)) {
            wonColors(btn20,btn21,btn22,player);
            disableAll(btn00,btn01,btn02,btn10,btn11,btn12);
            countUserWon(player);
        } else if (btn00.getText().equals(player)&&btn10.getText().equals(player)&&btn20.getText().equals(player)) {
            wonColors(btn00,btn10,btn20,player);
            disableAll(btn01,btn02,btn11,btn21,btn22,btn12);
            countUserWon(player);
        } else if (btn01.getText().equals(player)&&btn11.getText().equals(player)&&btn21.getText().equals(player)) {
            wonColors(btn01,btn11,btn21,player);

            disableAll(btn00,btn02,btn10,btn12,btn20,btn22);
            countUserWon(player);
        }else if(btn02.getText().equals(player)&&btn12.getText().equals(player)&&btn22.getText().equals(player)){
            wonColors(btn02,btn12,btn22,player);
            disableAll(btn00,btn01,btn10,btn11,btn20,btn21);
            countUserWon(player);
        } else if (btn00.getText().equals(player)&&btn11.getText().equals(player)&&btn22.getText().equals(player)) {
            wonColors(btn00,btn11,btn22,player);
            disableAll(btn01,btn02,btn10,btn12,btn20,btn21);
            countUserWon(player);
        } else if (btn02.getText().equals(player)&&btn11.getText().equals(player)&&btn20.getText().equals(player)) {
            wonColors(btn02,btn11,btn20,player);
            disableAll(btn00,btn01,btn10,btn12,btn21,btn22);
            countUserWon(player);

        } else if (num==9) {
            Toast.makeText(this,"DRAW ",Toast.LENGTH_LONG).show();
            clearAll();
        }


    }

    public void clearAll(){
        btn00.setText("");
        btn00.setEnabled(true);
        btn00.setBackgroundColor(Color.parseColor("#FF6200EE"));


        btn01.setText("");
        btn01.setEnabled(true);
        btn01.setBackgroundColor(Color.parseColor("#FF6200EE"));


        btn02.setText("");
        btn02.setEnabled(true);
        btn02.setBackgroundColor(Color.parseColor("#FF6200EE"));

        btn10.setText("");
        btn10.setEnabled(true);
        btn10.setBackgroundColor(Color.parseColor("#FF6200EE"));

        btn11.setText("");
        btn11.setEnabled(true);
        btn11.setBackgroundColor(Color.parseColor("#FF6200EE"));


        btn12.setText("");
        btn12.setEnabled(true);
        btn12.setBackgroundColor(Color.parseColor("#FF6200EE"));

        btn20.setText("");
        btn20.setEnabled(true);
        btn20.setBackgroundColor(Color.parseColor("#FF6200EE"));

        btn21.setText("");
        btn21.setEnabled(true);
        btn21.setBackgroundColor(Color.parseColor("#FF6200EE"));

        btn22.setText("");
        btn22.setEnabled(true);
        btn22.setBackgroundColor(Color.parseColor("#FF6200EE"));

        countAction=0;
    }
    public void wonColors(Button btn1,Button btn2,Button btn3,String player){
        btn1.setBackgroundColor(Color.parseColor("#ffff00"));
        btn1.setTextColor(Color.parseColor("black"));

        btn2.setBackgroundColor(Color.parseColor("#ffff00"));
        btn2.setTextColor(Color.parseColor("black"));

        btn3.setBackgroundColor(Color.parseColor("#ffff00"));
        btn3.setTextColor(Color.parseColor("black"));
        Toast.makeText(this, "Player "+player+" won ", Toast.LENGTH_SHORT).show();
    }
    public void disableAll(Button btn1,Button btn2,Button btn3,Button btn4,Button btn5,Button btn6){
        btn1.setEnabled(false);
        btn2.setEnabled(false);
        btn3.setEnabled(false);
        btn4.setEnabled(false);
        btn5.setEnabled(false);
        btn6.setEnabled(false);
    }
    public void countUserWon(String player){
        if(player.equalsIgnoreCase("X")){
            player1Score++;
            textView4.setText(player1Score+"");

        }else{
            player2Score++;
            textView6.setText(player2Score+"");
        }
    }
}