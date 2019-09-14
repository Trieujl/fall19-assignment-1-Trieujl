package com.example.simplesecurityapp;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.view.View;
import android.os.Bundle;
import android.widget.Button;;import java.util.ArrayList;

public class Main2Activity extends AppCompatActivity implements View.OnClickListener{
    String passwordID = "1234";
    ArrayList<Button> buttonClicker = new ArrayList<Button>();

    private Button button;
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        button = (Button) findViewById(R.id.button);

    }

    @Override
    public void onClick(View view) {
        if(buttonClicker.size() < 4){
            buttonClicker.add((Button)view);
        }

    }
    public void clickSubmit(View view){
        String enterPassword ="";
        for(int i =0; i<buttonClicker.size(); i++){
            enterPassword = enterPassword + buttonClicker.get(i).getText().toString();
        }
        if(enterPassword.equals(passwordID)){
            enterPassword = "";
            Intent intent = new Intent(this,Main3Activity.class);
            startActivity(intent);
        }
        else{
            enterPassword = "";
            Intent intent = new Intent(this, MainActivity.class);
            startActivity(intent);

        }
    }
}