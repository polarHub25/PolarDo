package com.polar.toDo.domain;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ToDoBoardRepository extends JpaRepository<ToDoBoard, Long> {
}
