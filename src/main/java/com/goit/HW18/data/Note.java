package com.goit.HW18.data;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Builder;
import lombok.Data;

@Data

@Entity
public class Note {
    @Id
    private long id;
    //   private UUID id;
    @Column
    private String title;
    @Column
    private String content;

}
