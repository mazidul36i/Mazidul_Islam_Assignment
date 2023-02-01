package com.example.app.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Entry implements Serializable {

    private String API;
    private String Description;
    private String Auth;
    private Boolean HTTPS;
    private String Cors;
    @Id
    private String Link;
    private String Category;

}
