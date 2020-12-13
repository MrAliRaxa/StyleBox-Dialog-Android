package com.example.stylebox;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;

import androidx.appcompat.app.AlertDialog;

public class StyleBox {

    private Context context;

    public StyleBox(Context context) {
        this.context = context;
    }

    public void show(){
        AlertDialog alertDialog=new AlertDialog.Builder(context).setView(R.layout.dialog_layout).create();
        alertDialog.setTitle("Demo Lib");
        alertDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        alertDialog.show();
    }
}
