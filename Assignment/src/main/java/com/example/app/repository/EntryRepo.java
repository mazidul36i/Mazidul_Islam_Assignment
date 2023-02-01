package com.example.app.repository;


import com.example.app.model.Entry;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EntryRepo extends JpaRepository<Entry, String> {
}
