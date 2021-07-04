package com.example.conference.springdemo.repositories;

import com.example.conference.springdemo.models.Session;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SessionRepository extends JpaRepository<Session, Long> {

}
