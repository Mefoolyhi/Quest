package com.samsung.itschool.quest;

/**
 * Created by User on 24.12.2017.
 */

public class Situation {
    Situation[] direction;
    String text;
    int dK,dA,dR;
    public Situation ( String text, int variants, int dk,int da,int dr) {
        this.text=text;
        dK=dk;
        dA=da;
        dR=dr;
        direction=new Situation[variants];
    }
}

