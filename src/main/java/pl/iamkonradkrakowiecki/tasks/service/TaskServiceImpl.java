package pl.iamkonradkrakowiecki.tasks.service;

import org.springframework.stereotype.Service;
import pl.iamkonradkrakowiecki.tasks.domain.Task;
import pl.iamkonradkrakowiecki.tasks.repository.TaskRepository;

@Service
public class TaskServiceImpl implements TaskService {

    private TaskRepository taskRepository;

    public TaskServiceImpl(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    @Override
    public Iterable<Task> list() {
        return taskRepository.findAll();
    }

    @Override
    public Task save(Task task) {
        return taskRepository.save(task);
    }
}
