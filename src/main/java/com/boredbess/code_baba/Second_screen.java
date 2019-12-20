package com.boredbess.code_baba;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Second_screen extends AppCompatActivity {

    Button cppButton, cButton, javaButton, pythonButton, htmlButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_screen);
        cppButton = (Button) findViewById(R.id.cppButton);
        javaButton = (Button) findViewById(R.id.javaButton);
        pythonButton = (Button) findViewById(R.id.pythonButton);
        cButton = (Button) findViewById(R.id.cButton);
        htmlButton = (Button) findViewById(R.id.htmlButton);
    }

    public void onClick(View v) {

        if (v.getId() == R.id.cppButton) {
            Intent intent = new Intent(Second_screen.this, cppScreen.class);
            startActivity(intent);

        } else if (v.getId() == R.id.javaButton) {
            Intent intent = new Intent(Second_screen.this, javaScreen.class);
            startActivity(intent);

        }  else if (v.getId() == R.id.pythonButton) {
            Intent intent = new Intent(Second_screen.this, pythonScreen.class);
            startActivity(intent);

        }  else if (v.getId() == R.id.cButton) {
            Intent intent = new Intent(Second_screen.this, cScreen.class);
            startActivity(intent);

        } else if (v.getId() == R.id.htmlButton) {
            Intent intent = new Intent(Second_screen.this, htmlScreen.class);
            startActivity(intent);
        }
    }
}
