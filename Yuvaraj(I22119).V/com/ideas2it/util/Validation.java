package com.ideas2it.util;

import java.time.LocalDate;
import java.time.Period;

public class Validation {

    /**
     * used to validate users phoneNumber
     * @param {@link String} phoneNumber
     * @return {@link boolean} whether phoneNumber is valid or not 
     */
    public static boolean validatePhoneNumber(String phoneNumber) {
        String pattern = "^\\d{10}$";
        return phoneNumber.matches(pattern);
    }

    /**
     * used to calculate experience from employeeDateOfJoin
     * @param {@link LocalDate}  employeeDateOfJoin
     * @return {@link int} calculated experience of employee 
     */
    public static int getExperience(LocalDate employeeDateOfJoin) {
        LocalDate currentDate = LocalDate.now();
        int employeeExperience = Period.between(employeeDateOfJoin, currentDate).getDays();
        return employeeExperience;
    }

    /**
     * used to calculate age from employeeDateOfBirth
     * @param {@link LocalDate}  employeeDateOfBirth
     * @return {@link int} calculated age of employee 
     */
    public static int getAge(LocalDate employeeDateOfBirth) {
        LocalDate currentDate = LocalDate.now();
        int employeeAge = Period.between(employeeDateOfBirth, currentDate).getYears();
        return employeeAge;
    }

    /**
     * used to validate the date;
     * @param {@link LocalDate}  date
     * @return {@link String} validated date 
     */
    public static String validateDate(String date) {
        String[] dates = date.split("\\W");
        String dateToValidate = null;
        if (dates.length == 3) {
            if (dates[0].length() == 2) {
                dateToValidate = dates[2] + "-" + dates[1] + "-" + dates[0];
            } else {
                dateToValidate = dates[0] + "-" + dates[1] + "-" + dates[2];
            }
        } else {
            dateToValidate = date;
        }
        return dateToValidate;
    }
}
