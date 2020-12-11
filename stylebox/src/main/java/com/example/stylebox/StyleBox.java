package com.example.stylebox;

import android.content.Context;
import android.widget.Toast;

public class StyleBox {

    private Context context;

    public StyleBox(Context context) {
        this.context = context;
    }

    public void ToastMe(String msg){
        Toast.makeText(context, msg, Toast.LENGTH_SHORT).show();
    }
}
