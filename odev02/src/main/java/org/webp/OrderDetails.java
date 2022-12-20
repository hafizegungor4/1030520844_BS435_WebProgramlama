package org.webp;


import org.hibernate.validator.constraints.Range;

import javax.persistence.*;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;


@Table(name = "OrderDetails")
@Entity
public class OrderDetails {

    @Id
    @GeneratedValue
    private Long id;

    @ManyToOne
    private Orders ordersID;

    @ManyToOne
    private Customers CustomerID;


    @NotNull
    private Long quantity;

}

