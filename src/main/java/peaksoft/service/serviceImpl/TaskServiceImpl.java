package peaksoft.service.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import peaksoft.model.Task;
import peaksoft.repository.TaskRepository;
import peaksoft.service.TaskService;

import java.util.List;

//@Service

public class TaskServiceImpl implements TaskService {

//    private final TaskRepository taskRepository;
//
//    @Autowired
//    public TaskServiceImpl(TaskRepository taskRepository) {
//        this.taskRepository = taskRepository;
//    }
//
//    @Override
//    public List<Task> getAlTasks() {
//        return taskRepository.getAlTasks();
//    }
//
//    @Override
//    public void addTask(Long id, Task task) {
//        taskRepository.addTask(id,task);
//
//    }
//
//    @Override
//    public Task getTaskById(Long id) {
//        return taskRepository.getTaskById(id);
//    }
//
//    @Override
//    public void updateTask(Task task, Long id) {
//        taskRepository.updateTask(task,id);
//
//    }
//
//    @Override
//    public void deleteTask(Long id) {
//        taskRepository.deleteTask(id);
//
//    }
}
