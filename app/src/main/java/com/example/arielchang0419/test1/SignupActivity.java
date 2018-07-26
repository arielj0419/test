package com.example.arielchang0419.test1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SignupActivity extends AppCompatActivity {



 private Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.signup );

        //getWindow().setBackgroundDrawableResource(R.drawable.wallpaper);

       button = (Button) findViewById( R.id.cancel );
        button.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openWeatherActivity();
            }
        } );

    }
    public void openWeatherActivity(){
        Intent intent = new Intent( this,WeatherActivity.class );
        startActivity( intent );
    }
}
