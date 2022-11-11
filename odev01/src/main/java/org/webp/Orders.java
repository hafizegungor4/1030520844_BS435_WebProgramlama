package org.webp;


import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.Range;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;


@Table(name = "Urun")
@Entity
public class Orders {

    @Id
    private Long id;

    @Length(min=2, max = 128)
    @NotNull
    private String customername;

    @Range(min = 0, max = 150)
    @NotBlank
    @NotNull
    private String customerSurname;


    @NotBlank
    private Float price;

    @OneToMany(mappedBy = "ordersID")
    public List<OrderDetails>  ordersID = new ArrayList<>();

    //Constructor
    public Orders() {
    }

    //Getter and Setter
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCustomername() {
        return customername;
    }

    public void setCustomername(String customername) {
        this.customername = customername;
    }

    public String getCustomerSurname() {
        return customerSurname;
    }

    public void setCustomerSurname(String customerSurname) {
        this.customerSurname = customerSurname;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public List<OrderDetails> getOrdersID() {
        return ordersID;
    }

    public void setOrdersID(List<OrderDetails> ordersID) {
        this.ordersID = ordersID;
    }
}