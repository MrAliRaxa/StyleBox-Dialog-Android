package com.example.styleboxdialog;

import androidx.appcompat.app.AppCompatActivity;

import com.example.stylebox.StyleBox;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        StyleBox styleBox=new StyleBox(MainActivity.this);
        styleBox.show();

    }
}