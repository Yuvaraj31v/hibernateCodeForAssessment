package com.ideas2it.entity;

import java.time.LocalDate;
import javax.persistence.Column;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.NamedQuery;
import javax.persistence.NamedQueries;
import javax.persistence.Table;
import java.util.List;

/**            
 * <p>
 * Trainee class is a entity in which extends Employee and a table is created in database with its attributes 
 * </p>
 *
 * @author Yuvaraj
 *
 * @version 1
 *
 * @since 2022-08-29
 */
@NamedQueries(  
    {  
        @NamedQuery(  
        name  = "findTrainee",  
        query = "from Trainee e where e.isActive =:isActive"  
        ) , 

        @NamedQuery(  
        name  = "findTraineeById",  
        query = "from Trainee e where e.isActive =:isActive AND e.employeeId = :employeeId"  
        )  
    }  
)
  
@Entity
@Table (name ="Trainees")
public class Trainee extends Employee {
    @Id   
    @GeneratedValue	    
    private int id;    
   
    @ManyToMany(cascade = CascadeType.ALL,fetch = FetchType.EAGER) 
    private List<Trainer> trainers;

    public List<Trainer> getTrainer(){
	return trainers;
    }
                                    
    public void setTrainer(List<Trainer> trainer) {
	this.trainers = trainer;
    }
	
}