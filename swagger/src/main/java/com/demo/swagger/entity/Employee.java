package com.demo.swagger.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.persistence.*;
import java.time.LocalDate;

@ApiModel(value = "Employee Api model documentation", description = "Model")
@Entity
public class Employee {

    @ApiModelProperty(value = "Unique id field of user object")
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id", nullable = false)
    private Long id;
    @ApiModelProperty(value = "Username id field of user object")
    private String userName;
    @ApiModelProperty(value = "firstName id field of user object")
    private String firstName;
    @ApiModelProperty(value = "lastName id field of user object")
    private String lastName;
    @ApiModelProperty(value = "emailAddress id field of user object")
    private String emailAddress;
    @ApiModelProperty(value = "Date id field of user object")
    private LocalDate date;

    public Employee() {
    }

    public Employee(Long id, String userName, String firstName, String lastName, String emailAddress, LocalDate date) {
        this.id = id;
        this.userName = userName;
        this.firstName = firstName;
        this.lastName = lastName;
        this.emailAddress = emailAddress;
        this.date = date;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
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

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }


}
