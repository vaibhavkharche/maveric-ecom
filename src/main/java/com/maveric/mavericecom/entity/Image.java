package com.maveric.mavericecom.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import java.util.Date;

@Entity
@Getter
@Setter
public class Image {

    @Id
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
