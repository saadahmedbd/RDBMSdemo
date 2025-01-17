package com.saad.RDMSdemo.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class student {
    @Id

    private long studentId;
    private String about;
    private String name;

//    create student foreign key  student_id in laptop class
//    when we use mapped by that's means only laptop class have Student foreign key that name is student_id(join-column=student_id)
//    if I not use mapped by in student class then student table have student foreign key and laptop table will have laptop foreign key
//    but we want only laptop class have student foreign key
//    when we are use onebyone annotation in two class then create two foreign key in individual class
    @OneToOne(mappedBy = "Student" ,cascade = CascadeType.ALL)
    private Laptop laptop;

//    onetomany relation means one student have many address
//    it's having mapped by of under the address class foreign key student
//    one to many is many to one that why we are address class add annotation many to one
    @OneToMany(mappedBy = "Student", cascade = CascadeType.ALL)
    private List<address> addresses=new ArrayList<>();

    public long getStudentId() {
        return studentId;
    }

    public void setStudentId(long studentId) {
        this.studentId = studentId;
    }

    public String getAbout() {
        return about;
    }

    public void setAbout(String about) {
        this.about = about;
    }

    public Laptop getLaptop() {
        return laptop;
    }

    public void setLaptop(Laptop laptop) {
        this.laptop = laptop;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<address> getAddresses() {
        return addresses;
    }

    public void setAddresses(List<address> addresses) {
        this.addresses = addresses;
    }
}
