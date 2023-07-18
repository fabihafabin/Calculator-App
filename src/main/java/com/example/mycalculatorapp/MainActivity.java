package com.example.mycalculatorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.view.View.OnClickListener;
public class MainActivity extends AppCompatActivity {

     private EditText display1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        display1=findViewById(R.id.editText1);
        display1.setShowSoftInputOnFocus(false);

        display1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (getString(R.string.display1).equals(display1.getText().toString()))
                    display1.setText("");
            }
        });
    }
    private void updateText(String strToAdd){
        String oldStr=display1.getText().toString();
        int cursorPos=display1.getSelectionStart();
        String leftStr=oldStr.substring(0, cursorPos);
        String rightStr=oldStr.substring(cursorPos);
        if (getString(R.string.display1).equals(display1.getText().toString())){
            display1.setText(strToAdd);
            display1.setSelection(cursorPos + 1);
        }
        else {
            display1.setText(String.format("%s%s%s", leftStr, strToAdd, rightStr));
            display1.setSelection(cursorPos + 1);
        }
    }
    public void zeroBTN(View view){
        updateText("0");

    }
    public void oneBTN(View view){
        updateText("1");

    }
    public void twoBTN(View view){
        updateText("2");

    }
    public void threeBTN(View view){
        updateText("3");

    }
    public void fourBTN(View view){
        updateText("4");

    }
    public void fiveBTN(View view){
        updateText("5");

    }
    public void sixBTN(View view){
        updateText("6");

    }
    public void sevenBTN(View view){
        updateText("7");

    }
    public void eightBTN(View view){
        updateText("8");

    }
    public void nineBTN(View view){
        updateText("9");

    }
    public void addBTN(View view){
        updateText("+");

    }
    public void subBTN(View view){
        updateText("-");

    }
    public void mulBTN(View view){
        updateText("x");

    }
    public void divBTN(View view){
        updateText("/");

    }
    public void pointBTN(View view){
        updateText(".");

    }
    public void clearBTN(View view){
       display1.setText("");


    }
    public void deleteBTN(View view){
        int cursorPos=display1.getSelectionStart();
        int textLen=display1.getText().length();

        if (cursorPos!=0 && textLen!=0 ){
            SpannableStringBuilder selection=(SpannableStringBuilder) display1.getText();
            selection.replace(cursorPos - 1, cursorPos, "");
            display1.setText(selection);
            display1.setSelection(cursorPos - 1);
        }

    }






}