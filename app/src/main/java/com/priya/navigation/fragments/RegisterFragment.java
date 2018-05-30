package com.priya.navigation.fragments;

import android.content.DialogInterface;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.app.AlertDialog;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.priya.navigation.NavigationActivity;
import com.priya.navigation.R;

public class RegisterFragment extends Fragment {
    private EditText fname,lname,emailid,pass;
    private Button Signup;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
       View view=inflater.inflate(R.layout.register_fragment,container,false);

        fname=view.findViewById(R.id.firstnameEt);
        lname=view.findViewById(R.id.lastnameEt);
        emailid=view.findViewById(R.id.emailEt);
        pass=view.findViewById(R.id.passwordEt);

        Signup=view.findViewById(R.id.signupBt);

        Signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String emailAddress =emailid.getText().toString();
                String pass1= pass.getText().toString();
                String frstname=fname.getText().toString();
                String lastname=lname.getText().toString();



                if (frstname.length()<3) {
                    Toast.makeText(getActivity(), "Invalid first name", Toast.LENGTH_SHORT).show();
                }else if(lastname.length()<3) {
                    Toast.makeText(getActivity(), "Invalid last name", Toast.LENGTH_SHORT).show();
                }else if(!emailAddress.endsWith("@gmail.com")){
                    Toast.makeText(getActivity(),"Invalid Email id",Toast.LENGTH_SHORT).show();
                }else if(pass1.length()<6){
                    Toast.makeText(getActivity(),"Invalid password",Toast.LENGTH_SHORT).show();
                }else{
                    AlertDialog.Builder builder=new AlertDialog.Builder(getActivity());
                    builder.setTitle("Alert Dialog");
                    builder.setMessage("Sucessfully sighnup");
                    builder.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {

                        }
                    });
                    builder.show();
                }
            }
        });




        return view;
    }
}
