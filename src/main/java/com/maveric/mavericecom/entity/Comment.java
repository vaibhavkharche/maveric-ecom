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
public class Comment {
    @Id
    private Long id;
    private String text;

    @ManyToOne
    private User commentedBy;

    @ManyToOne
    private Item item;

    private Date createdAt;
    private Date updatedAt;

    @ManyToOne
    private Comment childComment;

    @OneToMany(mappedBy = "comment")
    private List<Image> images;
}
