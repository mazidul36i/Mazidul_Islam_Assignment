package com.example.app.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Entry implements Serializable {

    @JsonProperty
    private String API;
    @JsonProperty
    private String Description;
    @JsonProperty
    private String Auth;
    @JsonProperty
    private Boolean HTTPS;
    @JsonProperty
    private String Cors;
    @JsonProperty
    private String Link;
    @JsonProperty
    private String Category;

}
