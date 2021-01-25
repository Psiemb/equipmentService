package pl.firmaBudo.equipBase.containerDataBase.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pl.firmaBudo.equipBase.containerDataBase.model.ContainerDB;
import pl.firmaBudo.equipBase.containerDataBase.model.ContainerRepositoryDB;

import javax.validation.Valid;
import java.net.URI;
import java.util.List;

@RestController
public class ContainerControllerDB {

    @Autowired
    private ContainerRepositoryDB containerRepositoryDB;


    @PostMapping("containers")
    public ResponseEntity<ContainerDB> createTask(@RequestBody @Valid ContainerDB toCreate) {
        ContainerDB result = containerRepositoryDB.save(toCreate);
        return ResponseEntity
                // created -> ustawia status 201
                // oraz ustawia w header'sach ścieżkę gdzie można uzyskać dostęp do zapisanego zasobu
                .created(URI.create("/" + result.getId()))
                .body(result);
    }

    @GetMapping("/containers")
    public ResponseEntity<List<ContainerDB>> readAllTasks(Pageable page) {

        List<ContainerDB> content = containerRepositoryDB.findAll(page).getContent();

        return ResponseEntity.ok(content);
    }

    @GetMapping("/containers/{id}")
    public ResponseEntity<ContainerDB> addAllTasks(@PathVariable long id) {
        return containerRepositoryDB.findById(id)
//                .map(task -> ResponseEntity.ok(task))
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }


}
