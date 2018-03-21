package com.example.pauline.mycv.model;

import com.example.pauline.mycv.view.EducationFragment;

public class CV
{
    private CVProfile CVProfile;
    private Objective Objective;
    private Experience[] Experience;
    private Education[] Education;
    private String[] Skills;
    private String[] Languages;
    private String[] Hobbies;

    public CVProfile getCVProfile() {
        return this.CVProfile; }

    public Objective getObjective() {
        return this.Objective;
    }

    public Experience[] getExperience ()
    {
        return Experience;
    }

    public void setExperience (Experience[] Experience)
    {
        this.Experience = Experience;
    }

    public Education[] getEducation() {
        return Education;
    }

    public void setEducation(Education[] Education) {
        this.Education = Education;
    }

    public void setCVProfile(CVProfile CVProfile) { this.CVProfile = CVProfile; }

    public String[] getSkills ()
    {
        return Skills;
    }

    public void setSkills (String[] Skills)
    {
        this.Skills = Skills;
    }

    public String[] getLanguages ()
    {
        return Languages;
    }

    public void setLanguages (String[] Languages)
    {
        this.Languages = Languages;
    }

    public String[] getHobbies ()
    {
        return Hobbies;
    }

    public void setHobbies (String[] Hobbies)
    {
        this.Hobbies = Hobbies;
    }
}
