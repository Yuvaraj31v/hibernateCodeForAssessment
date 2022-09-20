package com.ideas2it.entity;

import javax.persistence.MappedSuperclass;
import java.time.LocalDate;

/**            
 * <p>
 * Employee class is a entity in which acts as a parent for trainer and trainee  
 * </p>
 *
 * @author Yuvaraj
 *
 * @version 1
 *
 * @since 2022-08-29
 */
@MappedSuperclass
public class Employee {

    Employee() {
	
    }
    private String employeeId;

    private String employeeFirstName;

    private String employeeLastName;

    private long employeePhoneNumber;

    private LocalDate employeeDateOfBirth;

    private LocalDate employeeDateOfJoin;

    private String employeeEmailId;

    private int isActive = 1; 

    public void setEmployeeId(String id) {
	this.employeeId = id;
    }   

    public String getEmployeeId() {
	return employeeId;
    }

    public void setEmployeeFirstName(String firstName) {
	this.employeeFirstName = firstName;
    }

    public String getEmployeeFirstName() {
	return employeeFirstName;
    }

    public void setEmployeeLastName(String lastName) {
	this.employeeLastName = lastName;
    }

    public String getEmployeeLastName() {
	return employeeLastName;
    }

    public void setEmployeePhoneNumber(long phoneNumber) {
	this.employeePhoneNumber = phoneNumber;
    }

    public long getEmployeePhoneNumber() {
	return employeePhoneNumber;
    }

    public void setEmployeeDateOfBirth(LocalDate dateOfBirth) {
	this.employeeDateOfBirth = dateOfBirth;
    }

    public LocalDate getEmployeeDateOfBirth() {
	return  employeeDateOfBirth ;
    }

    public void setEmployeeDateOfJoin(LocalDate dateOfJoin) {
	this.employeeDateOfJoin = dateOfJoin;
    }

     public LocalDate getEmployeeDateOfJoin() {
	return  employeeDateOfJoin;
    }

    public void setEmployeeEmailId(String emailId) {
	this.employeeEmailId = emailId;
    }

    public String getEmployeeEmailId() {
	return  employeeEmailId;
    }

    public void setIsActive(int value) {
	this.isActive = value;
    }
}