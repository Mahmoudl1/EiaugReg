package com.example.eiaugreg;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import android.Manifest;
import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.nfc.Tag;
import android.os.Bundle;
import android.os.Handler;
import android.util.JsonReader;
import android.util.JsonToken;
import android.util.Log;
import android.util.Patterns;
import android.view.View;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.EditText;
import android.text.Html;
import android.widget.Toast;
import android.webkit.JsResult;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

import java.net.*;
import java.io.*;
import java.util.*;
import java.util.zip.GZIPInputStream;

public class MainActivity extends AppCompatActivity {
    EditText etName, etEmai, etPhen, etPlace, etAC, etGU, etFI;
    Button btnSub;
    WebView webView1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etName = findViewById(R.id.etName);
        etEmai = findViewById(R.id.etEmail);
        etPhen = findViewById(R.id.etPhone);
        etPlace = findViewById(R.id.etPlaceow);
        etAC = findViewById(R.id.etAcadmic);
        etGU = findViewById(R.id.etGrad);
        etFI = findViewById(R.id.etFieldoi);
        btnSub = findViewById(R.id.btnSub);
        webView1 = findViewById(R.id.webview1);

        ActivityCompat.requestPermissions(this, new String[]{Manifest.permission.INTERNET}, PackageManager.PERMISSION_GRANTED);
    }

    public void sub(View view) {

        validateAcc();

       // webView1.loadUrl("http://51.210.20.68/eiaug/App.php?FullName="+etName.getText()+"&PhoneNo="+ etPhen.getText()+"&Email="+etEmai.getText()+"&WorkPlace="+etPlace.getText()+"&Degree="+etAC.getText()+"&grad="+etGU.getText()+"&interest="+etFI.getText());



    }


    private Boolean validateAcc() {
        String name = etName.getText().toString();
        String email = etEmai.getText().toString();
        String number = etPhen.getText().toString();
        String place = etPlace.getText().toString();
        String field = etFI.getText().toString();
        String acadmic = etAC.getText().toString();
        String graduation = etGU.getText().toString();

        if (name.length() < 12) {
            etName.requestFocus();
            etName.setError("At least 12 Character");
            return false;
        } else if (email.length() == 0) {
            etEmai.requestFocus();
            etEmai.setError("Empty Email");
            return false;
        } else if (!Patterns.EMAIL_ADDRESS.matcher(email).matches()) {
            etEmai.requestFocus();
            etEmai.setError("Invalid Email");
            return false;
        } else if (number.length() < 11 || number.length() >= 12) {
            etPhen.requestFocus();
            etPhen.setError("Put Number with 11 digits");
            return false;
//        }else if (Patterns.PHONE.matcher(number).matches()){
//            etPhen.requestFocus();
//            etPhen.setError("Invalid Number");
//            return false;
        } else if (place.length() < 3) {
            etPlace.requestFocus();
            etPlace.setError("Empty Place");
            return false;
        } else if (acadmic.length() < 3) {
            etAC.requestFocus();
            etAC.setError("Empty Academic Degree");
            return false;
        } else if (graduation.length() < 3) {
            etGU.requestFocus();
            etGU.setError("Empty University");
            return false;
        } else if (field.length() < 3) {
            etFI.requestFocus();
            etFI.setError("Empty Field");
            return false;
        } else {
            Intent i = new Intent(MainActivity.this, MainActivity2.class);
            startActivity(i);
            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {
                    etName.getText().clear();
                    etEmai.getText().clear();
                    etAC.getText().clear();
                    etFI.getText().clear();
                    etGU.getText().clear();
                    etPlace.getText().clear();
                    etPhen.getText().clear();
                }
            }, 5000);

            return true;
        }


    }


}
