package pl.firmaBudo.equipBase.testowaBazaDanych;

import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task, Long> {
}
