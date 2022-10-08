package com.maveric.mavericecom.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Entity
@Getter
@Setter
public class Image {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String type;
    private String url;

    @Lob
    private byte[] photo;

    private Date createdAt;
    private Date updatedAt;

    @ManyToOne
    private Category category;

    @ManyToOne
    private Item item;

    @ManyToOne
    private Comment comment;
}
