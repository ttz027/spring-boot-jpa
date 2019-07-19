package com.example.springbootjpa.entity;



import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlTransient;
import java.io.Serializable;


@Entity
@Table(name = "teacher")
public class Teacher implements Serializable {
    private Integer id;
    private String name;
    private Integer age;
    private String address;
    private String job;
//    private Integer schoolsId;
    private Schools schools;


//    @Column(name="schools_id",insertable = false,updatable = false)
//    public Integer getSchoolsId() {
//        return schoolsId;
//    }
//
//    public void setSchoolsId(Integer schoolsId) {
//        this.schoolsId = schoolsId;
//    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
    @Column(name="name",length = 50)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Column(name="age")
    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Column(name="address",length = 125)
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Column(name="job",length = 20)
    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    @JsonIgnoreProperties(value = {"teachers"})  //忽略拿到的teachers数据
    @ManyToOne
    @JoinColumn(name = "schools_id")
    public Schools getSchools() {
        return schools;
    }

    public void setSchools(Schools schools) {
        this.schools = schools;
    }
}
