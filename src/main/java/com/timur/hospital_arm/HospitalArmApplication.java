package com.timur.hospital_arm;

import org.hibernate.cfg.Environment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HospitalArmApplication {
    public static void main(String[] args) {
        SpringApplication.run(HospitalArmApplication.class, args);
    }

}
