package pl.firmaBudo.equipBase.testowaBazaDanych.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pl.firmaBudo.equipBase.testowaBazaDanych.Task;
import pl.firmaBudo.equipBase.testowaBazaDanych.TaskRepository;

import javax.validation.Valid;
import java.net.URI;
import java.util.List;

@RestController
public class TaskController {

    private static final Logger logger = LoggerFactory.getLogger(TaskController.class);

    @Autowired
    private TaskRepository taskRepository;
//
//    @Autowired
//    TaskController(TaskRepository taskRepository) {
//        this.taskRepository = taskRepository;
//    }

    //Sygnatura metody
    @PostMapping("tasks")
    public ResponseEntity<Task> createTask(@RequestBody @Valid Task toCreate) {
        Task result = taskRepository.save(toCreate);
        return ResponseEntity
                // created -> ustawia status 201
                // oraz ustawia w header'sach ścieżkę gdzie można uzyskać dostęp do zapisanego zasobu
                .created(URI.create("/" + result.getId()))
                .body(result);
    }


//    @RequestMapping(method = RequestMethod.GET, path = "/tasks", params = {"!sort", "!page", "!size"})
//        //  @GetMapping(value = "/tasks", params = {"!sort", "!page", "!size"})
//    ResponseEntity<List<Task>> readAllTasks() {
//        logger.warn("Exposing all the tasks!");
//        return ResponseEntity.ok(taskRepository.findAll());
//    }

    @GetMapping("tasks")
    public ResponseEntity<List<Task>> readAllTasks(Pageable page) {
        logger.info("Custom pageable");
        List<Task> content = taskRepository.findAll(page).getContent();

//        ResponseEntity
//                .status(HttpStatus.MULTI_STATUS)
//                .headers()
//                .body("aldfsdlfalsdf");

        return ResponseEntity.ok(content);
    }

    @GetMapping("/tasks/{id}")
    public ResponseEntity<Task> addAllTasks(@PathVariable long id) {
        return taskRepository.findById(id)
//                .map(task -> ResponseEntity.ok(task))
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

//    @PutMapping("/tasks/{id}")
//    ResponseEntity<?> updateTask(@PathVariable long id, @RequestBody @Valid Task toUpadate) {
//        if (taskRepository.existsById(id)) {
//            return ResponseEntity.notFound().build();
////            return ResponseEntity.status(HttpStatus.SERVICE_UNAVAILABLE).build();
//        }
//        toUpadate.setId(id);
//        taskRepository.save(toUpadate);
//        return ResponseEntity.noContent().build();
//    }
}
