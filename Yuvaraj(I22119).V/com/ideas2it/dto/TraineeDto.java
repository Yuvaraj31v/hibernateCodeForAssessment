package com.ideas2it.dto;

import java.time.LocalDate;
import java.util.List;

import com.ideas2it.dto.EmployeeDto;

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
public class TraineeDto extends EmployeeDto {


    private List<TrainerDto> trainers;

    public void setTrainerDto(List<TrainerDto> trainer) {
        this.trainers = trainer;
    }

    public List<TrainerDto> getTrainerDto() {
        return trainers;
    }

    public TraineeDto(String id, String firstName, String lastName, long phoneNumber, LocalDate dateOfBirth,
                      LocalDate dateOfJoin, String emailId) {

        super(id, firstName, lastName, phoneNumber, dateOfBirth, dateOfJoin, emailId);
    }

    public TraineeDto() {

    }

    public String toString() {
        return super.toString();
    }
}        
