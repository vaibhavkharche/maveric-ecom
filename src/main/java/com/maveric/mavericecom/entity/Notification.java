package com.maveric.mavericecom.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

@Entity
@Getter
@Setter
public class Notification {

    @Id
    private Long id;
    private String subject;
    private String body;
    private String toAddress;
    private String fromAddress;
    private String type;
    private Date createdAt;
}
