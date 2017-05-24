package com.example.brian.foodsterredesign1;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.support.v4.app.Fragment;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by Brian on 23.04.2017.
 */

public class LoginFragment extends Fragment implements View.OnClickListener {

    private Button loginButton;
    private EditText editEmail;
    private EditText editPassword;
    private TextView textViewSignUp;

    View myView;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        myView = inflater.inflate(R.layout.login_layout, container, false);

        editEmail = (EditText) myView.findViewById(R.id.editEmail);
        editPassword = (EditText) myView.findViewById(R.id.editPassword);
        textViewSignUp = (TextView) myView.findViewById(R.id.textViewSignUp);
        loginButton = (Button) myView.findViewById(R.id.buttonLogin);

        loginButton.setOnClickListener(this);

        return myView;
    }

    @Override
    public void onClick(View v) {

    }
}
