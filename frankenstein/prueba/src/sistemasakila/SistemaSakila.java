/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemasakila;

import POJO.Actor;
import POJO.FilmActor;
import POJO.Payment;
import java.util.Iterator;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author Jadpa17
 */
public class SistemaSakila {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
           Configuration  conf = new Configuration().configure();
           
        SessionFactory factor = conf.buildSessionFactory();
        Session s = factor.openSession();
        
        Criteria c;
      
        
       Query q=s.createQuery("select p.customer.firstName, p.paymentDate, p.amount from Payment p group by customer.firstName");
       
       List l=q.list();
       Iterator it=l.iterator();
       
       while(it.hasNext()){
           Object[] obj=(Object[]) it.next();
           System.out.println(" - " +obj[0] + " - " +obj[1] + " - " + obj[2]);
       }
       
       //select p.customer_id, count(p.amount) from customer c inner join payment p on c.customer_id=p.customer_id
       
         //c = s.createCriteria(Actor.class).add(Restrictions.between("actorId", 10, 20));
      //   c = s.createCriteria(Actor.class).add(Restrictions.eq("actorId", 10));
        //  c = s.createCriteria(Actor.class).addOrder(Order.asc("actorId")).add(Restrictions.like("firstName", "W%"));

             
        
    }
    
}
