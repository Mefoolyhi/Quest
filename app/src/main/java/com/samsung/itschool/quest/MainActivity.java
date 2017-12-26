package com.samsung.itschool.quest;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    private Story story;
    private TextView tv_main;
    private TextView tv_head;
    private Button btn1, btn2, btn3;
    private Characteer hero;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv_main = findViewById(R.id.tv_main);
        tv_head = findViewById(R.id.tv_head);
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);


        story = new Story();
        hero = new Characteer();
        tv_head.setText("Активы: " + hero.A + "\nРепутация: " + hero.P + "\nКарьера: " + hero.K);
        tv_main.setText(story.current_situation.text);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                story.go(1, story, btn3, hero, tv_head, tv_main);
                if (tv_head.getText().toString().equals("The end")){
                    btn1.setEnabled(false);
                    btn2.setEnabled(false);
                    Again();

                }
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                story.go(2,story, btn3, hero, tv_head, tv_main);
                if (tv_head.getText().toString().equals("The end")){
                    btn1.setEnabled(false);
                    btn2.setEnabled(false);
                    Again();

                }
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                story.go(3,story, btn3, hero, tv_head, tv_main);
            }
        });

    }
    private void Again(){
        Button btn = new Button(this);
        LinearLayout ll = findViewById(R.id.ll);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT);
        btn.setLayoutParams(layoutParams);
        btn.setText("Ещё раз");
        ll.addView(btn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                story = new Story();
                hero = new Characteer();
                tv_head.setText("Активы: " + hero.A + "\nРепутация: " + hero.P + "\nКарьера: " + hero.K);
                tv_main.setText(story.current_situation.text);
                btn3.setVisibility(View.VISIBLE);
                btn1.setEnabled(true);
                btn2.setEnabled(true);
                Button btn = (Button) v;
                btn.setVisibility(View.GONE);
            }
        });
    }


}