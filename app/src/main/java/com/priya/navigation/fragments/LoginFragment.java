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
import android.widget.RelativeLayout;
import android.widget.Toast;

import com.priya.navigation.NavigationActivity;
import com.priya.navigation.R;

public class LoginFragment extends Fragment {
    private EditText name,email,password;
    private Button login;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.login_fragment, container, false);

        name=view.findViewById(R.id.NameEt);
        email=view.findViewById(R.id.emailEt);
        password=view.findViewById(R.id.passwordEt);

        login=view.findViewById(R.id.loginBt);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String emailAddress = email.getText().toString();
                String pass = password.getText().toString();

                if (!emailAddress.endsWith("@gmail.com")) {
                    Toast.makeText(getActivity(), "Invalid email", Toast.LENGTH_SHORT).show();
                } else if (pass.length() < 6) {
                    Toast.makeText(getActivity(), "Invalid password", Toast.LENGTH_SHORT).show();
                } else {
                    AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
                    builder.setTitle("Alert Dialog");
                    builder.setMessage("Sucessfully Login");
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












