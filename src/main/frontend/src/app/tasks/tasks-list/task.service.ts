import {Task} from "../task.model";
import {HttpClient} from "@angular/common/http";
import {EventEmitter} from "@angular/core";

export class TaskService {

    onTaskAdded = new EventEmitter<Task>()

    constructor(private httpClient: HttpClient) {}

    getTasks() {
        return this.httpClient.get<Task[]>('api/tasks');
    }

    saveTask(task: Task, checked: boolean) {
        task.completed = checked;
        return this.httpClient.post<Task>('api/tasks/save', task);
    }

    addTask(task: Task) {
        return this.httpClient.post<Task>('api/tasks/save', task);
    }
}
