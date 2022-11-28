package peaksoft.repository;

import peaksoft.model.Company;
import peaksoft.model.Group;
import peaksoft.model.Task;

import java.util.List;

public interface TaskRepository {
    List<Task> getAlTasks(Long lessonId);

    void addTask(Long id, Task task);

    Task getTaskById(Long id);

    void updateTask(Task task, Long id);

    void deleteTask(Long id);
}
