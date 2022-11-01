package com.example.myintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import com.example.myintent.json.TestJson;

public class Activity2 extends AppCompatActivity
{
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        String aux = null;
        TestJson testJson = null;
        Object object = null;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
        textView = findViewById(R.id.textViewId);
        Intent intent = getIntent();
        if( intent != null)
        {
            aux = intent.getStringExtra("hola" );
            if( aux != null && aux.length()> 0 )
            {
                textView.setText(aux);
            }
            if( intent.getExtras() != null ) {
                object = intent.getExtras().get("testJson");
                if (object != null) {
                    if (object instanceof TestJson) {
                        testJson = (TestJson) object;
                        textView.setText(testJson.getName() + " edad=" + testJson.getEdad());
                    }
                }
            }
        }
    }



}