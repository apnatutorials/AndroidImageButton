package com.apnatutorials.androidimagebutton;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageButton ibtnSimpleImageButton = (ImageButton) findViewById(R.id.ibtnSimpleImageButton);
        ibtnSimpleImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "You clicked second button", Toast.LENGTH_SHORT).show();
            }
        });

        ImageButton ibtnDefault = (ImageButton) findViewById(R.id.ibtnDefault);
        ibtnDefault.setOnClickListener(this);

        ImageButton ibtnColorPrimary = (ImageButton) findViewById(R.id.ibtnColorPrimary);
        ibtnColorPrimary.setOnClickListener(new ButtonClickHandler(this));
    }

    public void handleIbtnHomeClick(View view) {
        Toast.makeText(MainActivity.this, "You clicked first button", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onClick(View view) {
        Toast.makeText(MainActivity.this, "You clicked third button", Toast.LENGTH_SHORT).show();
    }
}
