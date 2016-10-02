package com.apnatutorials.androidimagebutton;

import android.content.Context;
import android.view.View;

import android.widget.Toast;

public class ButtonClickHandler implements View.OnClickListener {
    Context ctx;

    public ButtonClickHandler(Context context) {
        this.ctx = context;
    }

    @Override
    public void onClick(View view) {

        Toast.makeText(ctx, "You clicked fourth button "  , Toast.LENGTH_SHORT).show();
    }
}