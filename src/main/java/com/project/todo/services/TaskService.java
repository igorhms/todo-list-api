package com.project.todo.services;

import com.project.todo.model.Task;
import com.project.todo.repository.TaskRepository;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
public class TaskService {
    private final TaskRepository taskRepository;

    public TaskService(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    public List<Task> findAll() {
        return taskRepository.findAll();
    }

    public Task findById(Long id) {
        return taskRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Task not found"));
    }

    public Task create(Task task) {
        return taskRepository.save(task);
    }

    public Task update(Long id, Task task) {
        Task taskToUpdate = taskRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Task not found"));
        taskToUpdate.setTitle(task.getTitle());
        taskToUpdate.setCategory(task.getCategory());
        return taskRepository.save(taskToUpdate);
    }

    public void delete(Long id) {
        taskRepository.deleteById(id);
    }
}
