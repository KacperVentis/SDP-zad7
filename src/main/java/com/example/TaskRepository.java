package com.example;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("TaskRepository")
public interface TaskRepository extends JpaRepository<Task, Long> {

}