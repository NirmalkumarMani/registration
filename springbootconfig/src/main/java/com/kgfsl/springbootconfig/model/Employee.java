package com.example.registration.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class Employee
{
 @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;
    private String firstname;
    private String lastname;
    private String phonenumber;
    private String email;
    private String duration;
    private String title;
    private String company;
    public Employee()
    {

    }
    public Employee(Integer id, String firstname,String lastname,String phonenumber,String email,String duration,String title,String company) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.phonenumber=phonenumber;
        this.email=email;
        this.duration=duration;
        this.title=title;
        this.company=company;
    }
    
public void setId(Integer id) {
        this.id = id;
    }
    public Integer getId() {
        return id;
    }
    public String getFirstname() {
        return firstname;
    }
    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }
      public String getLastname() {
        return lastname;
    }
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
    public String getPhonenumber() {
        return phonenumber;
    }
    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }
       public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email =email;
    }
      public String getDuration() {
        return duration;
    }
    public void setDuration(String duration) {
        this.duration=duration;
    }
public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title=title;
    }
public String getCompany() {
        return company;
    }
    public void setCompany(String company) {
        this.company=company;
    }
//    @Override
//  public String toString() {
//          return id + firstname + lastname + phonenumber + email + duration + title + company;
//  }
}