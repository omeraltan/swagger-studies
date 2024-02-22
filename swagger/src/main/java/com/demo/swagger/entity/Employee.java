package com.demo.swagger.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;

@ApiModel(value = "Employee Api model documentation", description = "Model")
@Entity
public class Employee {

    @ApiModelProperty(value = "Unique id field of user object")
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id", nullable = false)
    private Long id;
    @NotNull(message = "User Name cannot be null")
    @Min(value = 5, message = "First Name should not be less than 5")
    @Max(value = 15, message = "First Name should not be greater than 15")
    @ApiModelProperty(value = "Username id field of user object", required = true, position = 0)
    private String userName;
    @NotNull(message = "First Name cannot be null")
    @ApiModelProperty(value = "firstName id field of user object", required = true, position = 1)
    private String firstName;
    @NotNull(message = "Last Name cannot be null")
    @ApiModelProperty(value = "lastName id field of user object", required = true, position = 2)
    private String lastName;
    @NotNull(message = "Email cannot be null")
    @Email(regexp = ".*@.*\\..*", message = "Email should be valid")
    @ApiModelProperty(value = "emailAddress id field of user object", required = true, position = 3)
    private String emailAddress;
    @NotNull(message = "Date cannot be null")
    @ApiModelProperty(value = "Date id field of user object", required = true, position = 4)
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
