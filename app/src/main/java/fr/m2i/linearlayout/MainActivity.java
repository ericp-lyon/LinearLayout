package fr.m2i.linearlayout;

import android.app.Activity;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    //declaration variable pour faire refe à l atexet box et du mm type
    private EditText etPseudo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //j'initialsie pour faire reference au id en question (R est la classe auto qui détient tous les id
        etPseudo =  findViewById(R.id.etPseudo);
        SharedPreferences prefs = getPreferences(MODE_PRIVATE);
        etPseudo.setText(prefs.getString("login", "?"));
    }

    public void annuler(View v){


    }


    public void Ok(View v){
        SharedPreferences prefs = getPreferences(MODE_PRIVATE);
        prefs.edit().putString("login", etPseudo.getText().toString()).apply();

    }


}
