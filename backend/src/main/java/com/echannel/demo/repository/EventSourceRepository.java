package com.echannel.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.echannel.demo.model.EventSource;

public interface EventSourceRepository extends JpaRepository<EventSource, Long> {
	
  List<EventSource> findByStatus(String status);

  List<EventSource> findByCommentContaining(String comment);
}

