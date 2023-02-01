package com.example.app.service;

import com.example.app.dto.AllEntryDTO;
import com.example.app.dto.EntryDTO;
import com.example.app.exceptions.EntryException;
import com.example.app.model.Entry;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

@Service
public class EntryServiceImpl implements EntryService {

    private static final String BASE_URL = "https://api.publicapis.org";
    private RestTemplate restTemplate = new RestTemplate();

    @Override
    public List<EntryDTO> getAllEntryByCategory(String category) throws EntryException {

        AllEntryDTO allEntryDTO = restTemplate.getForObject(BASE_URL + "/entries", AllEntryDTO.class);
        System.out.println(allEntryDTO);
        List<EntryDTO> entries = new ArrayList<>();

        if (allEntryDTO.getEntries().isEmpty()) throw new EntryException("No Entry found to load!");

        for (Entry entry : allEntryDTO.getEntries()) {
            if (entry.getCategory().equalsIgnoreCase(category)) {
                EntryDTO dto = new EntryDTO();
                dto.setDescription(entry.getDescription());
                dto.setTitle(entry.getAPI());
                entries.add(dto);
            }
        }

        return entries;
    }

    @Override
    public EntryDTO saveEntry(Entry entry) throws EntryException {
        return null;
    }
}
