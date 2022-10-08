package com.maveric.mavericecom.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import java.util.Date;
import java.util.List;

@Entity
@Getter
@Setter
public class Item {

    @Id
    private Long id;
    private String title;
    private String description;
    private Date createdAt;
    private Date updatedAt;
    private Double price;
    private Integer numberOfUnitsAvailable;
    private Boolean isAvailable;
    private Boolean isNegotiable;

    @ManyToOne
    private Category category;

    @ManyToOne
    private User user;

    @OneToMany(mappedBy = "item")
    private List<Image> images;

}
