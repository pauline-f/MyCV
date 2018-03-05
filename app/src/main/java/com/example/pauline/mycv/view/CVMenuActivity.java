package com.example.pauline.mycv.view;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.pauline.mycv.FileHelper;
import com.example.pauline.mycv.R;
import com.example.pauline.mycv.model.CV;
import com.example.pauline.mycv.model.CVProfile;
import com.google.gson.Gson;

public class CVMenuActivity extends AppCompatActivity {

    TextView job;
    TextView name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cvmenu);

        job = findViewById(R.id.job);
        name = findViewById(R.id.name);

        String json = FileHelper.readFile("data.json", this);
        CVProfile cvProfile = parseWithGson(json);
        displayNameJob(cvProfile);
    }

    protected CVProfile parseWithGson(String json) {
        Gson gson = new Gson();
        return gson.fromJson(json, CV.class).getCVProfile();
    }

    public void displayNameJob(CVProfile cvProfile) {
        job.setText(cvProfile.getJob());
        name.setText(cvProfile.getName());
    }

    public void displayObjective() {

    }
}
