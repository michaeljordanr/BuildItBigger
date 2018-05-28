package com.michaeljordanr.jokeactivity;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class JokeFragment extends Fragment {

    private String jokeString;
    private TextView jokeTextView;

    public JokeFragment() {
        // Required empty public constructor
    }

    public static JokeFragment newInstance(String jokeParam) {
        JokeFragment fragment = new JokeFragment();
        Bundle args = new Bundle();
        args.putString(JokeActivity.JOKE_PARAM, jokeParam);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            jokeString = getArguments().getString(JokeActivity.JOKE_PARAM);
        }


    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_joke, container, false);
        jokeTextView = view.findViewById(R.id.tv_joke);
        jokeTextView.setText(jokeString);

        return view;
    }



}
