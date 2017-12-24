package com.samsung.itschool.quest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
        private Story story;
        private TextView tv_main;
        private LinearLayout ll;
        private TextView tv_head;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv_main = findViewById(R.id.tv_main);
        ll = findViewById(R.id.ll);
        tv_head = findViewById(R.id.tv_head);

        LetStart();

    }

    private int choice;
    protected void LetStart(){
        story = new Story();
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT,ViewGroup.LayoutParams.WRAP_CONTENT);
        Characteer hero = new Characteer();
                do{
                    hero.A += story.current_situation.dA;
                    hero.K += story.current_situation.dK;
                    hero.P += story.current_situation.dR;
                    tv_head.setText("Активы: " + hero.A + "Репутация: " +hero.P + "Карьера: " + hero.K);
                    tv_main.setText(story.current_situation.text);
                    for (int i = 1; i <= story.current_situation.direction.length; i++){
                        Button btn = new Button(this);
                        btn.setText(i);
                        ll.addView(btn,layoutParams);
                        btn.setWidth(1);
                        btn.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Button btn = (Button)v;
                                choice = Integer.parseInt(btn.getText().toString());
                            }
                        });
                    }

                    story.go(choice);
                }while (!story.isEnd());
        tv_head.setText("Ещё раз?");
        Button btnYes = new Button(this);
        btnYes.setText("Да");
        ll.addView(btnYes,layoutParams);
        Button btnNo = new Button(this);
        btnYes.setText("Нет");
        btnNo.setWidth(1);
        btnYes.setWidth(1);
        ll.addView(btnNo,layoutParams);
        btnNo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();

            }
        });
        btnYes.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        LetStart();

                    }
                }
        );
    }
}
