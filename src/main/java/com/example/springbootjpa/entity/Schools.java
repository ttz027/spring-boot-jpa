package com.example.springbootjpa.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 *     @JsonIgnore该注解是忽略，表示在查询后不会映射该变量的值
 *      @JsonIgnoreProperties(value = {"schools"})该注解可以用来禁止循环关联
 */

@Entity
@Table(name="schools")
public class Schools  implements Serializable {

    private Integer id;
    private String name;
    private String address;
    private List<Teacher> teachers;

    @Id
    @Column(name="id")
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

    @Column(name="address",length = 255)
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }


    @JsonIgnoreProperties(value = {"schools"})  //忽略拿到的schools数据
    @OneToMany(mappedBy = "schools", cascade = CascadeType.ALL)
    public List<Teacher> getTeachers() {
        return teachers;
    }

    public void setTeachers(List<Teacher> teachers) {
        this.teachers = teachers;
    }
}
