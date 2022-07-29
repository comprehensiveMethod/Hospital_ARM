package com.timur.hospital_arm.models;

import lombok.Data;
import org.hibernate.mapping.PrimaryKey;

import javax.persistence.*;

@Table(name = "client")
@Entity
@Data
public class Client {
    @Id
    @Column()
    private Long id;

    @Column(name = "name", length = 30)
    private String name;

    @Column(name = "surname", length = 30)
    private String surname;

    @Column(name = "age", length = 3)
    private Integer age;

    @Column(name = "email", length = 50, unique = true)
    private String email;

    @Column(name = "password", length = 16)
    private String pass;


}
