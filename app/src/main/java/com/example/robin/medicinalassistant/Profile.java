package com.example.robin.medicinalassistant;

public class Profile {
    int id;
    String name;
    String doctor;
    String hospital;
    String medicines;
    String recommended;
    String forbidden;

    public Profile (){

    }
    public Profile(int id,String name,String doctor,String hospital,String medicines,String recommended,String forbidden)
    {
        this.id = id;
        this.name = name;
        this.doctor = doctor;
        this.hospital = hospital;
        this.medicines = medicines;
        this.recommended = recommended;
        this.forbidden = forbidden;
    }

    public int getId ()
    {
        return id;
    }
    public void setId()
    {
        this.id = id;
    }
    public String  getName ()
    {
        return name;
    }
    public void setName()
    {
        this.name = name;
    }
    public String getDoctor ()
    {
        return doctor;
    }
    public void setDoctor()
    {
        this.doctor = doctor;
    }
    public String getHospital ()
    {
        return hospital;
    }
    public void setHospital()
    {
        this.hospital = hospital;
    }
    public String getMedicines ()
    {
        return medicines;
    }
    public void setMedicines()
    {
        this.medicines = medicines;
    }
    public String getRecommended ()
    {
        return recommended;
    }
    public void setRecommended()
    {
        this.recommended = recommended;
    }
    public String getForbidden ()
    {
        return forbidden;
    }
    public void setForbidden()
    {
        this.forbidden = forbidden;
    }
}

