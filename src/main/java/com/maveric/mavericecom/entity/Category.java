package com.maveric.mavericecom.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.Date;
import java.util.List;

@Entity
@Getter
@Setter
public class Category {
    @Id
    private Long id;
    private String title;
    private String description;
    private Date createdAt;
    private Date updatedAt;

    @OneToMany(mappedBy = "category")
    private List<Item> items;

    @OneToMany(mappedBy = "category")
    private List<Image> images;

}
