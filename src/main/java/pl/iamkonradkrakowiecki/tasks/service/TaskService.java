package pl.iamkonradkrakowiecki.tasks.service;

import pl.iamkonradkrakowiecki.tasks.domain.Task;

public interface TaskService {

    Iterable<Task> list();

    Task save(Task task);
}
