package com.example.android.qhacks;

/**
 * Created byr1 vrukshavakees on 2017-02-04.
 */

public class Patient extends User {
    private String description;
    public Patient (String name, String age,String phoneNumber, String country, String province, String description) {
        this.name = name;
        this.age = age;
        this.phoneNumber = phoneNumber;
        this.country = country;
        this.province = province;
        this.description = description;
        isDoctor = false;
    }

    public String getDescription(){
        return description;
    }
    public boolean search(String search){
        if (description.contains(search) || search.equals(phoneNumber) || search.equals(country) || search.equals(name) || search.equals(province) || search.equals(age) || search.equals(email))
            return true;
        return false;
       // }
       // return false;
    }
}
