package com.tanmay.challengetext;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText editFirstName, editLastName, editEmail;
    TextView textView, textView2, textView3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editFirstName = findViewById(R.id.editPersonFirstName);
        editLastName = findViewById(R.id.editPersonLastName);
        editEmail = findViewById(R.id.editTextEmailAddress);

    }

    public void onClick(View view){
        textView.setText(editFirstName.getText().toString());
        textView2.setText(editLastName.getText().toString());
        textView3.setText(editEmail.getText().toString());
    }
}