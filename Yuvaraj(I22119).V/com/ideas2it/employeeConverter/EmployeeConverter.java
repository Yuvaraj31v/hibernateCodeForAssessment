package com.ideas2it.employeeConverter;

import java.util.List;
import java.util.ArrayList;

import com.ideas2it.dto.EmployeeDto;
import com.ideas2it.dto.TrainerDto;
import com.ideas2it.dto.TraineeDto;
import com.ideas2it.entity.Employee;
import com.ideas2it.entity.Trainer;
import com.ideas2it.entity.Trainee;

/**            
 * <p>
 * EmployeeConverter class is a class which converts Dto to model and viceversa    
 * </p>
 *
 * @author Yuvaraj
 *
 * @version 1
 *
 * @since 2022-08-29
 */
public class EmployeeConverter {

    /**
     *used to convert TrainerDto to trainer
     *@param trainerDto {@link TrainerDto} the trainerDto Object
     *@return {@link Trainer} the trainer object 
     */
    public static Trainer convertTrainerDtoToTrainer(TrainerDto trainerDto) {
        Trainer trainer = new Trainer();
	trainer.setEmployeeId(trainerDto.getEmployeeId());
	trainer.setEmployeeFirstName(trainerDto.getEmployeeFirstName());
	trainer.setEmployeeLastName(trainerDto.getEmployeeLastName());
	trainer.setEmployeePhoneNumber(trainerDto.getEmployeePhoneNumber());
	trainer.setEmployeeDateOfBirth(trainerDto.getEmployeeDateOfBirth());
	trainer.setEmployeeDateOfJoin(trainerDto.getEmployeeDateOfJoin());
	trainer.setEmployeeEmailId(trainerDto.getEmployeeEmailId());
        return trainer;
    }

    /**
     *used to convert TraineeDto to trainee
     *@param traineeDto {@link TraineeDto} the traineeDto 
     *@return {@link Trainee} the trainee object 
     */  
    public static Trainee convertTraineeDtoToTrainee(TraineeDto traineeDto) {
        Trainee trainee = new Trainee();
	trainee.setEmployeeId(traineeDto.getEmployeeId());
	trainee.setEmployeeFirstName(traineeDto.getEmployeeFirstName());
	trainee.setEmployeeLastName(traineeDto.getEmployeeLastName());
	trainee.setEmployeePhoneNumber(traineeDto.getEmployeePhoneNumber());
	trainee.setEmployeeDateOfBirth(traineeDto.getEmployeeDateOfBirth());
	trainee.setEmployeeDateOfJoin(traineeDto.getEmployeeDateOfJoin());
	trainee.setEmployeeEmailId(traineeDto.getEmployeeEmailId());
        return trainee;
    }

    /**
     *used to convert Trainer to TrainerDto
     *@param trainer {@link TrainerDto} the trainer 
     *@return {@link TrainerDto} the trainerDto object 
     */
    public static TrainerDto convertTrainerToTrainerDto(Trainer trainer) {
	TrainerDto trainerDto = null;
	if (trainer != null) {
	    trainerDto =  new TrainerDto(trainer.getEmployeeId(),trainer.getEmployeeFirstName(),trainer.getEmployeeLastName(),trainer.getEmployeePhoneNumber(),trainer.getEmployeeDateOfBirth(),trainer.getEmployeeDateOfJoin(),trainer.getEmployeeEmailId());
	}
        return trainerDto;
    }

    /**
     *used to convert Trainee to TraineeDto
     *@param trainee {@link TrainerDto} the trainee 
     *@return {@link TraineeDto} the traineeDto object 
     */    
    public static TraineeDto convertTraineeToTraineeDto(Trainee trainee) {
	TraineeDto traineeDto = null;
	if (trainee !=null) {
	    traineeDto =  new TraineeDto(trainee.getEmployeeId(),trainee.getEmployeeFirstName(),trainee.getEmployeeLastName(),trainee.getEmployeePhoneNumber(),trainee.getEmployeeDateOfBirth(),trainee.getEmployeeDateOfJoin(),trainee.getEmployeeEmailId());
	}
        return traineeDto;
    }

     /**
     *used to convert TraineeList to TraineeDtoList
     *@param trainees {@link List<Trainee>} trainees
     *@return {@link List<TraineeDto>} the List of traineeDto  
     */
    public static List<TraineeDto> convertTraineeList(List<Trainee> trainees) {
	List<TraineeDto> traineeDtos = new ArrayList<>();
	
	TraineeDto traineeDto = null; 
	for (Trainee trainee : trainees) {
	    traineeDto = convertTraineeToTraineeDto(trainee);
	    traineeDtos.add(traineeDto);
	}
	return traineeDtos;
    }

    /**
     *used to convert TrainerDtoList to TrainerList
     *@param  {@link List<Trainer>} trainers
     *@return {@link List<TraineeDto>} List of TrainerDto  
     */	
    public static List<TrainerDto> convertTrainerList(List<Trainer> trainers) {
	List<TrainerDto> trainerDtos = new ArrayList<>();	
	TrainerDto trainerDto = null;	
	for (Trainer trainer : trainers) {
	    trainerDto = convertTrainerToTrainerDto(trainer);
	    trainerDtos.add(trainerDto);	  
	}
	return trainerDtos;
    }
}