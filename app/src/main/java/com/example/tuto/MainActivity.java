package com.example.tuto;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("MainActivity", "Hello World");

    }

    public void ouioui(View view) {
        Toast toast = Toast.makeText(this, R.string.message,
                Toast.LENGTH_SHORT);
        toast.show();
    }
}
