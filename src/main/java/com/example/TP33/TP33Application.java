package com.example.springmvc;

import com.example.springmvc.Entities.Patient;
import com.example.springmvc.Repositories.PatientRepositery;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;

@SpringBootApplication
public class TP33Application {

    public static void main(String[] args) {
        SpringApplication.run(TP33Application.class, args);
    }

    //@Bean
    CommandLineRunner start(PatientRepositery patientRepositery){
        return  args -> {
        patientRepositery.save(new Patient(null,"Hassan",
                new Date(),false,120));
        patientRepositery.save(new Patient(null,"Wahid",
                    new Date(),false,122));
        patientRepositery.save(new Patient(null,"karim",
                    new Date(),false,123));
        };
    }

}
