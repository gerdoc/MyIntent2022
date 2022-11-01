package com.example.myintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.myintent.json.TestJson;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity implements View.OnClickListener
{
    private Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById( R.id.buttonId );
        button.setOnClickListener(this);
    }
    @Override
    public void onClick(View v)
    {
        Intent intent = new Intent( getBaseContext() , Activity2.class );
        TestJson testJson = new TestJson();
        testJson.setEdad( (int)(Math.random()*100));
        testJson.setFechaHora(Calendar.getInstance().getTime());
        testJson.setMateria( String.format("Materia %d" , (int)(Math.random()*10)));
        testJson.setName(String.format("Nombre %d" , (int)(Math.random()*7777)));
        testJson.setPromedio((float)(Math.random()*10));
        intent.putExtra( "hola" , String.format("Hola mundo %d" , (int)(Math.random()*1000) ) );
        intent.putExtra( "testJson" , testJson );
        startActivity( intent );
    }









}