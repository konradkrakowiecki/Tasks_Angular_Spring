package pl.iamkonradkrakowiecki.tasks.controller;

import org.springframework.web.bind.annotation.*;
import pl.iamkonradkrakowiecki.tasks.domain.Task;
import pl.iamkonradkrakowiecki.tasks.service.TaskService;

@RestController
@RequestMapping("api/tasks")
public class TaskController {

    private TaskService taskService;

    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }

    @GetMapping(value = {"", "/"})
    public Iterable<Task> list() {
        return this.taskService.list();
    }

    @PostMapping("/save")
    public Task saveTask(@RequestBody Task task) {
        return this.taskService.save(task);
    }
}
