package org.webp;


import javax.persistence.*;


/*
    "MovieDetails" isimi bir tablo bulunmamaktadir o yuzden hangi tablo maplenecek
    belirtmek gerekmektedir
 */
@Table(name = "Customers")
@Entity
public class Customers {

    //@GeneratedValue ise biz her seferinde yeni bir kayıt eklediğimizde manual olarak 'id' vermemize
    // gerek kalmıyor auto olarak kendi her kayıt için 'id' oluşturuyor.

    @Id @GeneratedValue
    private Long id;

    private String customerName;

    private String customerSurname;

    private Long TC;

    private char gender;

    private long birthDate;

    private long telNr1;

    private long telNr2;

    private int cityId;

    private int districtId;

// Constructor method
    public Customers(){}

// Getter and Setter Method
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerSurname() {
        return customerSurname;
    }

    public void setCustomerSurname(String customerSurname) {
        this.customerSurname = customerSurname;
    }

    public Long getTC() {
        return TC;
    }

    public void setTC(Long TC) {
        this.TC = TC;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public long getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(long birthDate) {
        this.birthDate = birthDate;
    }

    public long getTelNr1() {
        return telNr1;
    }

    public void setTelNr1(long telNr1) {
        this.telNr1 = telNr1;
    }

    public long getTelNr2() {
        return telNr2;
    }

    public void setTelNr2(long telNr2) {
        this.telNr2 = telNr2;
    }

    public int getCityId() {
        return cityId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }
}
