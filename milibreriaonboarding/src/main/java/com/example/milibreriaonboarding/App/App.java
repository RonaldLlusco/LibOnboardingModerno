package com.example.milibreriaonboarding.App;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.milibreriaonboarding.R;


public class App extends AppCompatActivity {

    private TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_app);
        initilizeComponent();
    }
    private void initilizeComponent()
    {
      tv = findViewById(R.id.ed);
      String username =getIntent().getStringExtra("USERNAME");
      String msg ="bienvenido: "+ username;
      tv.setText(msg);
    }
}
