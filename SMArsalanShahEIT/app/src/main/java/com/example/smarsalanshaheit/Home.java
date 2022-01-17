package com.example.smarsalanshaheit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.firebase.auth.FirebaseAuth;

public class Home extends AppCompatActivity {
    FirebaseAuth auth;
    Button button ,button1;
    EditText editText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        auth = FirebaseAuth.getInstance();

        button1 = findViewById(R.id.button5);
        editText = findViewById(R.id.name);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url= editText.getText().toString();

                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://"+url));
                startActivity(intent);

            }
        });


    }


    public void rec(View view) {
        Intent intent =new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    public void login(View view) {

        auth.signOut();
        Intent intent =new Intent(Home.this, Login.class);
        startActivity(intent);


    }
}