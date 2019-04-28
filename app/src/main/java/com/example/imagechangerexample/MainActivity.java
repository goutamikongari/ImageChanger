package com.example.imagechangerexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView img;
    Button btn;
    public boolean swap=true;
    int[] imgs={R.drawable.t10,R.drawable.t11};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        img=(ImageView)findViewById(R.id.img);
        btn=(Button)findViewById(R.id.btn);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(swap) {
                    img.setImageDrawable(getResources().getDrawable(imgs[0]));
                    //img.setImageDrawable(getResources().getDrawable(imgs[1]));
                    swap=false;
                }
                else {
                    swap=true;
                    img.setImageDrawable(getResources().getDrawable(imgs[1]));

                }
            }

        });
    }

    
}
