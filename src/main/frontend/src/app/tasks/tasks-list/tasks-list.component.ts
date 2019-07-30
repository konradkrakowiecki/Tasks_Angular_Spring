import { Component, OnInit } from '@angular/core';
import { Task } from '../task.model';

@Component({
    selector: 'app-tasks-list',
    templateUrl: './tasks-list.component.html',
    styleUrls: ['./tasks-list.component.css']
})
export class TasksListComponent implements OnInit {

    tasks: Task[] = [];

    constructor() { }

    ngOnInit() {
        this.tasks.push(new Task(1,"Task1", true, "07/07/2019"));
        this.tasks.push(new Task(2,"Task2", false, "09/07/2019"));
        this.tasks.push(new Task(3,"Task3", false, "12/07/2019"));
    }

    getDueDateLabel(task: Task) {
        return task.completed ? 'badge-success' : 'badge-primary';
    }

    onTaskChange(event, task) {
        console.log("Task has changed");
        // this.taskService.saveTask(task, event.target.checked).subscribe();
    }
}
