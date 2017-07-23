package com.example.pradeep.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText screen;
    private float numberbefor;
    private String operation;
    private ButtonClickListeaner btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        screen=(EditText)findViewById(R.id.result);
        screen.setEnabled(false);
        btn=new ButtonClickListeaner();
        int idslist[]={R.id.clear,R.id.sub,R.id.add,R.id.mul,R.id.div,R.id.show,R.id.one,R.id.two,R.id.three,R.id.four,R.id.five,R.id.six,R.id.seven,R.id.eight,R.id.nine,R.id.zero,R.id.dot}
        for(int id:idslist)
        {
            View v=findViewById(id);
            v.setOnClickListener(btn);
        }
    }
    publick void math(String str){
        numberbefor= Float.parseFloat(screen.toString());
        operation= str;
        screen.set text(0);
    }
    public void
}
