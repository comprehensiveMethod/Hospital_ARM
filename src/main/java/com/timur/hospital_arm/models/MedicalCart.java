package com.timur.hospital_arm.models;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "medical_cart")
public class MedicalCart {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;
    @Column(name = "client_id")
    private Integer clientID;
    @Column(name="about")
    private String about;
}
