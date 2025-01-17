package com.saad.RDMSdemo.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Laptop {

    @Id
    private long laptopId;
    private String model;
    private  String  band;


    @OneToOne
    @JoinColumn(name = "student_id")
    private student Student;

    public long getLaptopId() {
        return laptopId;
    }

    public void setLaptopId(long laptopId) {
        this.laptopId = laptopId;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getBand() {
        return band;
    }

    public void setBand(String band) {
        this.band = band;
    }

    public student getStudent() {
        return Student;
    }

    public void setStudent(student student) {
        Student = student;
    }
}
