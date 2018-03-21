package com.example.pauline.mycv.view;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.pauline.mycv.FileHelper;
import com.example.pauline.mycv.R;
import com.example.pauline.mycv.model.CV;
import com.example.pauline.mycv.model.CVProfile;
import com.google.gson.Gson;

public class CVMenuActivity extends AppCompatActivity {

    public static final String FRAGMENT_TO_OPEN = "fragment_to_open";

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

    public void displayObjective(View view) {
        Intent intent = new Intent(this, CategoriesActivity.class);
        intent.putExtra(FRAGMENT_TO_OPEN, ObjectiveFragment.FRAGMENT_TAG);
        startActivity(intent);
    }

    public void displayExperience(View view) {
        Intent intent = new Intent(this, CategoriesActivity.class);
        intent.putExtra(FRAGMENT_TO_OPEN, ExperienceFragment.FRAGMENT_TAG);
        startActivity(intent);
    }

    public void displayEducation(View view) {
        Intent intent = new Intent(this, CategoriesActivity.class);
        intent.putExtra(FRAGMENT_TO_OPEN, EducationFragment.FRAGMENT_TAG);
        startActivity(intent);
    }

    public void displaySkills(View view) {
        Intent intent = new Intent(this, CategoriesActivity.class);
        intent.putExtra(FRAGMENT_TO_OPEN, SkillsFragment.FRAGMENT_TAG);
        startActivity(intent);
    }

    public void displayLanguages(View view) {
        Intent intent = new Intent(this, CategoriesActivity.class);
        intent.putExtra(FRAGMENT_TO_OPEN, LanguagesFragment.FRAGMENT_TAG);
        startActivity(intent);
    }

    public void displayHobbies(View view) {
        Intent intent = new Intent(this, CategoriesActivity.class);
        intent.putExtra(FRAGMENT_TO_OPEN, HobbiesFragment.FRAGMENT_TAG);
        startActivity(intent);
    }
}
