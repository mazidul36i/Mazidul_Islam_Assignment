package com.example.app.controller;

import com.example.app.dto.EntryDTO;
import com.example.app.service.EntryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EntryController {

    @Autowired
    private EntryService entryService;

    @GetMapping("/entries")
    public ResponseEntity<List<EntryDTO>> getAllEntryByCategoryHandler(@RequestParam("category") String category) {
        return new ResponseEntity<>(entryService.getAllEntryByCategory(category), HttpStatus.OK);
    }

}
