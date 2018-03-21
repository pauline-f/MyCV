package com.example.pauline.mycv.view;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import com.example.pauline.mycv.R;

public class CategoriesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_categories);

        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        String fragmentToOpen = getIntent().getStringExtra(CVMenuActivity.FRAGMENT_TO_OPEN);

        if (ObjectiveFragment.FRAGMENT_TAG.equals(fragmentToOpen)) {
            ObjectiveFragment fragment = ObjectiveFragment.newInstance();
            fragmentTransaction.add(R.id.fragment_container, fragment);
            fragmentTransaction.commit();
        }

        if  (ExperienceFragment.FRAGMENT_TAG.equals(fragmentToOpen)) {
            ExperienceFragment fragmentExperience = ExperienceFragment.newInstance();
            fragmentTransaction.add(R.id.fragment_container, fragmentExperience);
            fragmentTransaction.commit();
        }

        if  (EducationFragment.FRAGMENT_TAG.equals(fragmentToOpen)) {
            EducationFragment fragmentEducation = EducationFragment.newInstance();
            fragmentTransaction.add(R.id.fragment_container, fragmentEducation);
            fragmentTransaction.commit();
        }

        if  (SkillsFragment.FRAGMENT_TAG.equals(fragmentToOpen)) {
            SkillsFragment fragmentSkills = SkillsFragment.newInstance();
            fragmentTransaction.add(R.id.fragment_container, fragmentSkills);
            fragmentTransaction.commit();
        }

        if  (LanguagesFragment.FRAGMENT_TAG.equals(fragmentToOpen)) {
            LanguagesFragment fragmentLanguages = LanguagesFragment.newInstance();
            fragmentTransaction.add(R.id.fragment_container, fragmentLanguages);
            fragmentTransaction.commit();
        }

        if  (HobbiesFragment.FRAGMENT_TAG.equals(fragmentToOpen)) {
            HobbiesFragment fragmentHobbies = HobbiesFragment.newInstance();
            fragmentTransaction.add(R.id.fragment_container, fragmentHobbies);
            fragmentTransaction.commit();
        }

    }


}
