package com.maveric.mavericecom.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String firstName;
    private String middleName;
    private String lastName;

    @Temporal(TemporalType.DATE)
    private Date dateOfBirth;

    private String employeeId;
    private String email;
    private String phoneNumber;
    private String bloodGroup;
    private String designation;
    private String primarySkillset;
    private String secondarySkillset;

    @OneToMany(mappedBy = "user")
    private List<Item> items;

    @OneToOne(mappedBy = "subscriber")
    private Subscibe subscibe;

}
