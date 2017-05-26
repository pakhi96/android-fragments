package com.example.pakhi.bottom_navbar;


import android.app.FragmentTransaction;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;

import static android.R.attr.fragment;


/**
 * A simple {@link Fragment} subclass.
 */
public class frag2 extends Fragment {
    EditText song;


    public static final String ARG_PAGE = "ARG_PAGE";

    private int mPage;

    public static frag2 newInstance(int page) {
        Bundle args = new Bundle();
        args.putInt(ARG_PAGE, page);
        frag2 fragment = new frag2();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mPage = getArguments().getInt(ARG_PAGE);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_frag2, container, false);

        return view;
    }
    public  void Add(View view)
    {
        song=(EditText) getActivity().findViewById(R.id.editText);
        String s=song.getText().toString();
        android.support.v4.app.Fragment frag=new android.support.v4.app.Fragment();
        Bundle b=new Bundle();
        b.putString("key",s); // use as per your need
        frag.setArguments(b);

    }



}
