import {Task} from "../task.model";
import {HttpClient} from "@angular/common/http";

export class TaskService {

    private tasks: Task[] = [];

    constructor(private httpClient: HttpClient) {}

    getTasks() {
        return this.httpClient.get<Task[]>('api/tasks');
    }

}
