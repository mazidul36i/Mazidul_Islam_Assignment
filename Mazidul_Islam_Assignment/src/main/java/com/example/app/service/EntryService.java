package com.example.app.service;

import com.example.app.dto.EntryDTO;
import com.example.app.exceptions.EntryException;
import com.example.app.model.Entry;

import java.util.List;

public interface EntryService {

    List<EntryDTO> getAllEntryByCategory(String category) throws EntryException;

    EntryDTO saveEntry(Entry entry) throws EntryException;

}
