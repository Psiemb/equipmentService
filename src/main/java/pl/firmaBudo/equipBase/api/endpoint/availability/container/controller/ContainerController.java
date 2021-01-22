package pl.firmaBudo.equipBase.api.endpoint.availability.container.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pl.firmaBudo.equipBase.api.endpoint.availability.container.model.ContainerRepository;
import pl.firmaBudo.equipBase.dao.entity.container.ContainerEntity;

import javax.validation.Valid;
import java.util.List;


@RestController
public class ContainerController {

    private static final Logger logger = LoggerFactory.getLogger((ContainerController.class));

    private ContainerRepository containerRepository;

    @Autowired
    ContainerController(ContainerRepository containerRepository) {
        this.containerRepository = containerRepository;
    }

    @GetMapping(value = "/containerx", params = {"!sort", "!page", "!size"})
    ResponseEntity<List<ContainerEntity>> readAllContainers() {
        logger.warn("Exposing all the tasks!");
        return ResponseEntity.ok(containerRepository.findAll());
    }

    @PutMapping("/container/{id}")
    ResponseEntity<?> updateContainer(@PathVariable int id, @RequestBody @Valid ContainerEntity toUpadate) {
        if (containerRepository.existsById(id)) {
            return ResponseEntity.notFound().build();
//            return ResponseEntity.status(HttpStatus.SERVICE_UNAVAILABLE).build();
        }
        toUpadate.setId(id);
        containerRepository.save(toUpadate);
        return ResponseEntity.noContent().build();
    }


}
