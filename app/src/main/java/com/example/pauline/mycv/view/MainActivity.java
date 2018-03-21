package com.example.pauline.mycv.view;

import android.content.Intent;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.pauline.mycv.FileHelper;
import com.example.pauline.mycv.R;
import com.example.pauline.mycv.model.CV;
import com.example.pauline.mycv.model.CVProfile;
import com.example.pauline.mycv.model.Objective;
import com.google.gson.Gson;

public class MainActivity extends AppCompatActivity {

    TextView job;
    TextView name;
    TextView telephone;
    TextView address;
    TextView mail;
    TextView website;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        job = findViewById(R.id.job);
        name = findViewById(R.id.name);
        telephone = findViewById(R.id.telephone);
        address = findViewById(R.id.address);
        mail = findViewById(R.id.mail);
        website = findViewById(R.id.website);

        String json = FileHelper.readFile("data.json", this);
        CVProfile cvProfile = parseWithGson(json);
        displayCvProfile(cvProfile);
    }

    protected CVProfile parseWithGson(String json) {
        Gson gson = new Gson();
        return gson.fromJson(json, CV.class).getCVProfile();
    }


    public void displayCvProfile(CVProfile cvProfile) {
        job.setText(cvProfile.getJob());
        name.setText(cvProfile.getName());
        telephone.setText(cvProfile.getTelephone());
        address.setText(cvProfile.getAddress());
        mail.setText(cvProfile.getMail());
        website.setText(cvProfile.getWebsite());
    }

    public void displayMenu(View view) {
        Intent intent = new Intent(this, CVMenuActivity.class);
        startActivity(intent);
    }
}
