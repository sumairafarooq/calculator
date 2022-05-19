package com.example.calci;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

//this is new comment
public class MainActivity extends AppCompatActivity {

    Button buttonx ,buttonlg,buttonln,buttonbr,buttonbr2,buttonsqrt,buttonac,buttonc,buttonper,buttondiv,buttonfact,button7,
            button8,button9,button4,buttonmult,button1x,button5,button6,buttonsub,buttonpie,button1,button2,button3,buttonadd,buttonx2,
            buttone,button0,buttondec,buttonres;
    TextView texteq,textvalue;
    float mValueOne, mValueTwo;
    boolean Addition, Subtract, Multiplication,Division,Percent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonx =(Button)findViewById(R.id.button1);
        buttonlg =(Button)findViewById(R.id.button2);
        buttonln =(Button)findViewById(R.id.button3);
        buttonbr =(Button)findViewById(R.id.button4);
        buttonbr2 =(Button)findViewById(R.id.button5);
        buttonsqrt =(Button)findViewById(R.id.button6);
        buttonac =(Button)findViewById(R.id.button7);
        buttonc =(Button)findViewById(R.id.button8);
        buttonper =(Button)findViewById(R.id.button9);
        buttondiv =(Button)findViewById(R.id.button10);
        buttonfact =(Button)findViewById(R.id.button11);
        button7 =(Button)findViewById(R.id.button12);
        button8 =(Button)findViewById(R.id.button13);
        button9 =(Button)findViewById(R.id.button14);
        buttonmult =(Button)findViewById(R.id.button15);
        button1x =(Button)findViewById(R.id.button16);
        button4 =(Button)findViewById(R.id.button17);
        button5 =(Button)findViewById(R.id.button18);
        button6 =(Button)findViewById(R.id.button19);
        buttonsub =(Button)findViewById(R.id.button20);
        buttonpie =(Button)findViewById(R.id.button21);
        button1 =(Button)findViewById(R.id.button22);
        button2 =(Button)findViewById(R.id.button23);
        button3 =(Button)findViewById(R.id.button24);
        buttonadd =(Button)findViewById(R.id.button25);
        buttonx2 =(Button)findViewById(R.id.button26);
        buttone =(Button)findViewById(R.id.button27);
        button0 =(Button)findViewById(R.id.button28);
        buttondec =(Button)findViewById(R.id.button29);
        buttonres =(Button)findViewById(R.id.button30);
        texteq = (TextView)findViewById(R.id.eq);
        textvalue =(TextView)findViewById(R.id.value);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                texteq.setText(texteq.getText() + "1");
                textvalue.setText(textvalue.getText()+"1");
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                texteq.setText(texteq.getText() + "2");
                textvalue.setText(textvalue.getText()+"2");
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                texteq.setText(texteq.getText() + "3");
                textvalue.setText(textvalue.getText()+"3");
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                texteq.setText(texteq.getText() + "4");
                textvalue.setText(textvalue.getText()+"4");
            }
        });
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                texteq.setText(texteq.getText() + "5");
                textvalue.setText(textvalue.getText()+"5");
            }
        });
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                texteq.setText(texteq.getText() + "6");
                textvalue.setText(textvalue.getText()+"6");
            }
        });
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                texteq.setText(texteq.getText() + "7");
                textvalue.setText(textvalue.getText()+"7");
            }
        });
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                texteq.setText(texteq.getText() + "8");
                textvalue.setText(textvalue.getText()+"8");
            }
        });
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                texteq.setText(texteq.getText() + "9");
                textvalue.setText(textvalue.getText()+"9");
            }
        });
        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                texteq.setText(texteq.getText() + "0");
                textvalue.setText(textvalue.getText()+"0");
            }
        });
        buttondec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                texteq.setText(texteq.getText() + ".");
                textvalue.setText(textvalue.getText()+".");
            }
        });
        buttonac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                texteq.setText(" ");
                textvalue.setText(" ");
            }
        });
        buttonsub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (textvalue == null) {
                    texteq.setText("");
                }
                else {
                    mValueOne = Float.parseFloat(textvalue.getText() + "");
                    Subtract = true;
                    texteq.setText(texteq.getText() + "-");
                    textvalue.setText("");
                }
            }
        });
        buttonmult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (textvalue == null) {
                    texteq.setText("");
                }
                else {
                    mValueOne = Float.parseFloat(textvalue.getText() + "");
                    Multiplication = true;
                    texteq.setText(texteq.getText() + "*");
                    textvalue.setText("");
                }
            }
        });
        buttonper.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (textvalue == null) {
                    texteq.setText("");
                }
                else {
                    mValueOne = Float.parseFloat(textvalue.getText() + "");
                    Percent = true;
                    texteq.setText(texteq.getText() + "%");
                    textvalue.setText("");
                }
            }
        });
        buttondiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (textvalue == null) {
                    texteq.setText("");
                }
                else {
                    mValueOne = Float.parseFloat(textvalue.getText() + "");
                    Division = true;
                    texteq.setText(texteq.getText() + "/");
                    textvalue.setText("");
                }
            }
        });
        buttonadd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (textvalue == null) {
                    texteq.setText("");
                }
                else {
                    mValueOne = Float.parseFloat(textvalue.getText() + "");
                    Addition = true;
                    texteq.setText(texteq.getText() + "+");
                    textvalue.setText("");
                }
            }
        });
        buttonres.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mValueTwo = Float.parseFloat(textvalue.getText() + "");

                if (Addition == true) {
                    textvalue.setText(mValueOne + mValueTwo + "");
                    Addition = false;

                }

                if (Subtract == true) {
                    textvalue.setText(mValueOne - mValueTwo + "");
                    Subtract = false;
                }

                if (Multiplication == true) {
                    textvalue.setText(mValueOne * mValueTwo + "");
                    Multiplication = false;
                }

                if (Division == true) {
                    textvalue.setText(mValueOne / mValueTwo + "");
                    Division = false;
                }
                if (Percent == true) {
                    textvalue.setText(mValueOne / mValueTwo * 100 + "");
                    Percent = false;
                }
            }
        });




    }
}
