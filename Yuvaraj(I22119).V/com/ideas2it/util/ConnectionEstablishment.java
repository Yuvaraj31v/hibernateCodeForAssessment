package com.ideas2it.util;


import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.ideas2it.entity.Employee;
import com.ideas2it.entity.Trainee;
import com.ideas2it.entity.Trainer;
import com.ideas2it.dao.IEmployeeDao;


/**            
 * <p>
 * ConnectionEstablishment is a singleton class which returns the opened session to Dao  
 * </p>
 *
 * @author Yuvaraj
 *
 * @version 1
 *
 * @since 2022-08-29
 */
public class ConnectionEstablishment{
      
    private static Session session = null;
    private static ConnectionEstablishment  connectionEstablishment = null;
  
    private ConnectionEstablishment() {
	try {    
	    Configuration configuration = new Configuration();
            configuration.configure("hibernate.cfg.xml");
            configuration.addAnnotatedClass(Trainer.class);
	    configuration.addAnnotatedClass(Trainee.class);
	
            ServiceRegistry srvcReg = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties()).build();
            SessionFactory sessionFactory = configuration.buildSessionFactory(srvcReg);
	    session  = sessionFactory.openSession();
	}
	catch(Exception e ) {
	    e.printStackTrace();
	}
    }
	
   /**
    *
    *used to return the opened session
    *@return {@link session}
    */ 
    public static Session getConnection() {

	if ( session == null ) {
	    connectionEstablishment  = new  ConnectionEstablishment(); 
	}

	if (!session.isOpen()) {
            connectionEstablishment  = new  ConnectionEstablishment(); 
	}
	
	return session;
	
    }
}

  