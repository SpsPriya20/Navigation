package com.priya.navigation.fragments;

import android.content.DialogInterface;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AlertDialog;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import com.priya.navigation.R;

public class WelcomeFragment extends Fragment {
    private Button button1, button2;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
       View view = inflater.inflate(R.layout.welcome_fragment,container,false);
       button1=view.findViewById(R.id.LoginBt);
       button2=view.findViewById(R.id.signupBt);

       button1.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               FragmentTransaction transaction=getActivity().getSupportFragmentManager().beginTransaction();
               transaction.add(R.id.fragment_container,new LoginFragment());
               transaction.addToBackStack("LOGIN");
               transaction.commit();
           }
       });

       button2.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {

               FragmentTransaction transaction=getActivity().getSupportFragmentManager().beginTransaction();
               transaction.add(R.id.fragment_container,new RegisterFragment());
               transaction.addToBackStack("REGISTER");
               transaction.commit();

           }
       });


        return view ;
    }
}
