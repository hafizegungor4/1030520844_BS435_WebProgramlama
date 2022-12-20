package org.webp.EJBClass;

import org.hibernate.Hibernate;
import org.webp.OrderDetails;
import org.webp.Orders;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;


@Stateless
public class OrdersEJB {


        @PersistenceContext
        private EntityManager em;


    public Long create(int n){

        Orders order = new Orders();
        for(int i=0; i<n; i++){
            order.getOrdersID().add(new OrderDetails());
        }

        em.persist(order);

        return order.getId();
    }

    public Orders getLazy(long id){

        return em.find(Orders.class, id);
    }

    public Orders getInitialized(long id){

        Orders order = em.find(Orders.class, id);
        if(order == null){
            return null;
        }

        order.getOrdersID().size();

        return order;
    }


    public Orders getInitializedWithHibernate(long id){

        Orders order = em.find(Orders.class, id);
        if(order == null){
            return null;
        }

        Hibernate.initialize(order.getOrdersID());

        return order;
    }



}
