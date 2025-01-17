package com.saad.RDMSdemo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class address {
    @Id
    private long street_id;
    private String area_name;
    private String city;
    private String country;


    @ManyToOne
    @JoinColumn(name = "student_id")
    private student Student;

    public long getStreet_id() {
        return street_id;
    }

    public void setStreet_id(long street_id) {
        this.street_id = street_id;
    }

    public String getArea_name() {
        return area_name;
    }

    public void setArea_name(String area_name) {
        this.area_name = area_name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public student getStudent() {
        return Student;
    }

    public void setStudent(student student) {
        Student = student;
    }
}
