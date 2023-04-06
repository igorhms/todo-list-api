package com.project.todo.model;

import com.project.todo.constants.CategoryType;
import com.project.todo.constants.PriorityType;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;


@Entity
@Table(name = "tasks")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String title;

    @Column(nullable = false)
    private Date dueDate;

    @Column(nullable = false)
    private CategoryType category;

    @Column(nullable = false)

    private PriorityType priority;
}
