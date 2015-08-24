package com.micetechnologies.app.entity;

import javax.persistence.*;
import java.time.LocalDate;

/**
 * Created by jgonzalezd on 8/23/15.
 */
@Entity
public class Profile {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String name;
    private LocalDate birthday;
    private String profession;
    private String job;
    private byte gender;

    @Column(name="gender_of_interest", nullable = false)
    private byte genderOfInterest;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public byte getGender() {
        return gender;
    }

    public void setGender(byte gender) {
        this.gender = gender;
    }

    public byte getGenderOfInterest() {
        //TODO: set default the opposite gender
        return genderOfInterest;
    }

    public void setGenderOfInterest(byte genderOfInterest) {
        this.genderOfInterest = genderOfInterest;
    }

}
