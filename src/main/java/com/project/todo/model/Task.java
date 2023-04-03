package com.project.todo.model;

import com.project.todo.constants.CategoryType;
import com.project.todo.constants.PriorityType;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
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
    @NotNull
    private Date dueDate;

    @Column(nullable = false)
    @NotNull
    private CategoryType category;

    @Column(nullable = false)

    @NotNull
    private PriorityType priority;
}
