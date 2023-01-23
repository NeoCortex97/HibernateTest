package com.solupharm.models;

import javax.persistence.*;

import org.hibernate.annotations.GenericGenerator;

import java.io.Serializable;

@Entity
@Table(name="Userbase")
public class User  implements Serializable {
    @GenericGenerator(name="gen", strategy="increment")
    @Id
    @GeneratedValue(generator="gen")
    @Column(name="ID")
    private Integer id;
    @Column(name = "first_name")
    private String firstName;
    @Column(name = "last_name")
    private String lastName;
    @Column(name = "roles")
    private int role;
    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getRole() {
        return role;
    }

    public void setRole(int role) {
        this.role = role;
    }
}
