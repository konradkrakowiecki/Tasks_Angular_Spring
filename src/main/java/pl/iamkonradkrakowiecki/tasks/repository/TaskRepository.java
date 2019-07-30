package pl.iamkonradkrakowiecki.tasks.repository;

import org.springframework.data.repository.CrudRepository;
import pl.iamkonradkrakowiecki.tasks.domain.Task;

public interface TaskRepository extends CrudRepository<Task, Long> {


}
