package com.michaeljordanr.jokeactivity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class JokeActivity extends AppCompatActivity {

    public static String JOKE_PARAM = "joke-param";

    private String jokeFromLib = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_joke);

        if(getIntent().getStringExtra(JokeActivity.JOKE_PARAM) != null){
            jokeFromLib = getIntent().getStringExtra(JokeActivity.JOKE_PARAM);
        }

        getSupportFragmentManager()
                .beginTransaction().add(
                R.id.joke_fragment,
                JokeFragment.newInstance(jokeFromLib))
                .commit();
    }
}
