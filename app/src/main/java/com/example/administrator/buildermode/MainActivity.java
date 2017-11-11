package com.example.administrator.buildermode;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Person.Builder builder = new Person.Builder();
        Person person = builder.age(18)
                .name("WZQ")
                .sex("男")
                .build();
        Log.e("111", "person=" + person.toString());
    }
}
