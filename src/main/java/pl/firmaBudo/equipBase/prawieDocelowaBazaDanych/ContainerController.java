package pl.firmaBudo.equipBase.prawieDocelowaBazaDanych;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pl.firmaBudo.equipBase.dao.entity.container.ContainerEntity;
import pl.firmaBudo.equipBase.testowaBazaDanych.controller.TaskController;

import javax.validation.Valid;
import java.net.URI;
import java.util.List;

@RestController
public class ContainerController {

    private static final Logger LOGGER = LoggerFactory.getLogger(TaskController.class);

    private ContainerRepository2 containerRepository2;

//    @Autowired
    public ContainerController(ContainerRepository2 containerRepository2) {
        this.containerRepository2 = containerRepository2;
    }

    @PostMapping("containers2")
    public ResponseEntity<ContainerEntity> createContainer2(@RequestBody @Valid ContainerEntity toCreate) {
//    public ResponseEntity<ContainerCreateResponse> createContainer2(@RequestBody @Valid ContainerCreateRequest toCreate) {
        //tutaj powinien byc mapper, który zmapuje z ContainerRequest na ContainerEntity2
        ContainerEntity result = containerRepository2.save(toCreate);
        return ResponseEntity.created(URI.create("/" + result.getId())).body(result);
    }

    @GetMapping("/containers2")
    public ResponseEntity<List<ContainerEntity>> readAllContainers() {
        LOGGER.info("Custom pageable");
        List<ContainerEntity> listOfContainers = containerRepository2.findAll();
        return ResponseEntity.ok(listOfContainers);
    }

    @GetMapping("/containers2/{id}")
    public ResponseEntity<ContainerEntity> addAllContainers(@PathVariable long id) {
        return containerRepository2.findById(id)
//                .map(task -> ResponseEntity.ok(containerEntity2))
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }
}
