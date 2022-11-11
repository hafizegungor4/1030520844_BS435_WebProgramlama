package org.webp;


import org.hibernate.validator.constraints.Range;

import javax.persistence.*;
import javax.validation.constraints.*;
import java.util.ArrayList;
import java.util.List;


@Table(name = "Customers")
@Entity
public class Customers {

    @GeneratedValue
    @Id
    private Long id;

    @OneToMany(mappedBy = "CustomerID")
    private List<OrderDetails> customerID = new ArrayList<>();

    @NotNull
    private String name;

    @NotNull
    private String surname;

    @NotNull
    private String birthdate;

    @NotBlank
    private Long phoneNumber;


    //Constructor
    public Customers() { }

    //Getter and Setter

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<OrderDetails> getCustomerID() {
        return customerID;
    }

    public void setCustomerID(List<OrderDetails> customerID) {
        this.customerID = customerID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(String birthdate) {
        this.birthdate = birthdate;
    }

    public Long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(Long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
