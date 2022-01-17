package com.example.smarsalanshaheit;

import android.app.FragmentManager;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

public class MainActivity extends AppCompatActivity {

FrameLayout frameLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        
        frameLayout= findViewById(R.id.frame);
        
        
    }
    
    
    public void loadfragment(Fragment fragment){

        FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.frame,fragment);
        transaction.commit();


    }

    public void aSPclick(View view) {

        loadfragment(new AspCourse());
    }

    public void csharpclick(View view) {
        loadfragment(new CSharp());

    }

    public void javaTaskclick(View view) {
        loadfragment(new JavaTask());
    }

    public void jAVAclick(View view) {

        loadfragment(new JavaCourse());
    }

    public void androidclick(View view) {
        loadfragment(new AndroidCourse());
    }

    public void sqlclick(View view) {

        loadfragment(new SqlCourse());

    }

    public void libclick(View view) {
        loadfragment(new Library());
    }

    public void resclick(View view) {
        loadfragment(new Restaurant());
    }

    public void webclick(View view) {

        loadfragment(new WebsiteCourse());
    }

    public void foodclick(View view) {
        loadfragment(new Foodie());

    }

    public void posclick(View view) {
        loadfragment(new PointOfSale());
    }





}