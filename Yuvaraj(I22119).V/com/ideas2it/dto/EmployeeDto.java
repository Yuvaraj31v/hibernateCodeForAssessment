package com.ideas2it.dto;

import java.time.LocalDate;
import java.time.Period;

/**            
 * <p>
 * EmployeeDto class is a dto which act as a tranfer between contoller and service  
 * </p>
 *
 * @author Yuvaraj
 *
 * @version 1
 *
 * @since 2022-08-29
 */
public class EmployeeDto {

    private String employeeFirstName;
    private String employeeLastName;
    private long employeePhoneNumber;
    private String employeeId;
    private LocalDate employeeDateOfBirth;
    private LocalDate employeeDateOfJoin;
    private String employeeEmailId;

    public EmployeeDto() {

    }

    public EmployeeDto(String employeeId, String employeeFirstName, String employeeLastName, long employeePhoneNumber, LocalDate employeeDateOfBirth,
                       LocalDate employeeDateOfJoin, String employeeEmailId) {

        this.employeeFirstName = employeeFirstName;
        this.employeeLastName = employeeLastName;
        this.employeePhoneNumber = employeePhoneNumber;
        this.employeeId = employeeId;
        this.employeeDateOfBirth = employeeDateOfBirth;
        this.employeeDateOfJoin = employeeDateOfJoin;
        this.employeeEmailId = employeeEmailId;
    }

    public String getEmployeeFirstName() {
        return employeeFirstName;
    }

    public String getEmployeeLastName() {
        return employeeLastName;
    }

    public long getEmployeePhoneNumber() {
        return employeePhoneNumber;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public LocalDate getEmployeeDateOfBirth() {
        return employeeDateOfBirth;
    }

    public LocalDate getEmployeeDateOfJoin() {
        return employeeDateOfJoin;
    }

    public String getEmployeeEmailId() {
        return employeeEmailId;
    }

    public int getAgeFromDateOfBirth() {
        LocalDate currentDate = LocalDate.now();
        int employeeAge = Period.between(employeeDateOfBirth, currentDate).getYears();
        return employeeAge;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("ID :").append(getEmployeeId()).append("\nName :").append(getEmployeeFirstName())
                .append("\nEmail ID ").append(getEmployeeEmailId()).append("\nAge :")
                .append(getAgeFromDateOfBirth()).append("\nPhone Number :").append(getEmployeePhoneNumber());

        return stringBuilder.toString();
    }
}