package com.example;

import javax.persistence.*;
import java.util.List;

@Entity
public class Employee {

    @Id
    @GeneratedValue
    private Long id;

    @ManyToMany(cascade = CascadeType.REMOVE)
    @Column(updatable=false)
    private List<Task> tasks;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<Task> getTasks() {return tasks;}

    public void setTasks(List<Task> tasks) {this.tasks = tasks;}

    @Override
    public String toString() {
        return String.format("Employee [id=%s, tasks=%s]", id, tasks);
    }
}
