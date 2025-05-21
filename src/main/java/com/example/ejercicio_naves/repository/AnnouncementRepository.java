package com.example.ejercicio_naves.repository;

import com.example.ejercicio_naves.model.Announcement;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AnnouncementRepository extends JpaRepository<Announcement, String> {
} 