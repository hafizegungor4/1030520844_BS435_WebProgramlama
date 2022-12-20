package org.webp.EJBClass;


import org.webp.Customers;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.validation.constraints.NotNull;

@Stateless
public class CustomersEJB {


    @PersistenceContext
    private EntityManager em;

    public CustomersEJB(){}


    public void registerNewCustomer(@NotNull Long id, @NotNull String name, @NotNull String surname){
        if(isRegistered(id)){
            return;
        }
        Customers customer = new Customers();
        customer.setCustomerID(id);
        customer.setName(name);
        customer.setSurname(surname);
        em.persist(customer);
    }


    public boolean isRegistered(@NotNull Long id){
        Customers customer = em.find(Customers.class, id);
        return customer != null;
    }
}
