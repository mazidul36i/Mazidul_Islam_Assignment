package com.example.app.dto;

import com.example.app.model.Entry;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AllEntryDTO implements Serializable {

    private Integer count;
    private List<Entry> entries;

}
