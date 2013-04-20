/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Hibernate;

import org.hibernate.Session;

/**
 *
 * @author Eusebius
 */
public class festivalHelper {
    
    Session session = null;
    
    public festivalHelper(){
        this.session = hibernateUtil.getSessionFactory().getCurrentSession();
    }
    
}
