package com.example.gzhang.stockscreener;

import android.app.Activity;

import android.content.Intent;
import android.graphics.BitmapFactory;
import android.os.AsyncTask;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.CheckBox;


import com.amazonaws.ClientConfiguration;
import com.amazonaws.auth.CognitoCachingCredentialsProvider;
import com.amazonaws.regions.Region;
import com.amazonaws.regions.Regions;
import com.amazonaws.services.dynamodbv2.*;
import com.amazonaws.mobileconnectors.dynamodbv2.dynamodbmapper.*;

import org.w3c.dom.Text;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;
import java.lang.String;


/**
 * Created by leon_ on 2017-06-29.
 */

    public class LogInActivity extends Activity{

        TextView loginText;

        Button loginButton,
                createAccountButton;

        EditText usernameText,
                passwordText;

        CheckBox rememberBox;

        String username,
                password;

        Profile profile;


        @Override
        protected void onCreate(Bundle savedInstanceState)
            {super.onCreate(savedInstanceState);
            setContentView(R.layout.login_layout);


        loginText = (TextView)findViewById(R.id.loginText);

        loginButton = (Button) findViewById(R.id.loginButton);
        createAccountButton = (Button) findViewById(R.id.createAccountButton);

        usernameText = (EditText)findViewById(R.id.usernameText);
        passwordText = (EditText)findViewById(R.id.passwordText);

        rememberBox = (CheckBox) findViewById(R.id.rememberBox);

    }

    protected void onLoginClick (View view){

        username = usernameText.getText().toString();

        password = passwordText.getText().toString();

        //String passwordDatabase = profile.getPassword();

        String passwordDatabase = "hi";

        try {

            if (password.equals(passwordDatabase)) {

                Toast.makeText(getApplicationContext(), "Login Successful", Toast.LENGTH_LONG).show();

                finish();

            } else {

                Toast.makeText(getApplicationContext(), "Username or Password Incorrect", Toast.LENGTH_LONG).show();

            }
        }finally{
        }
    }

    public void onCreateAccountClick (View view){

            Intent intent = new Intent (this, CreateAccountActivity.class);
            startActivity (intent);

    }

    /*
    onLoginClick

    get the fields of userNameEditText and passwordEditText

    check if userName already exists in database...if returns null, then create new entry, else create a message that says this is already taken

    set userName as hashkey, set password as attribute

    redirect to main activity
    -> set isEnabled for the login button to be false

     */
}