package pl.firmaBudo.equipBase;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pl.firmaBudo.equipBase.dao.a.ContainerDataBase;
import pl.firmaBudo.equipBase.dao.entity.Container;

import java.util.List;

@RestController
public class RentController {

    @Autowired
    private ContainerDataBase containerDataBase;

//    @GetMapping("/v1/rent/container")
//    public ResponseEntity<Container> getContainer(@RequestBody Container container) {
//        containerDataBase.addContainer(container);
//        return ResponseEntity.ok(container);
//    }

    @GetMapping("/v1/rent/container")
    public ResponseEntity<Container> getContainer(@RequestBody Container container) {
        containerDataBase.addContainer(container);
        return ResponseEntity.ok(container);
    }


    @GetMapping("/v1/rent/container/all")
    public ResponseEntity<List<Container>> getAllContainers() {
        return ResponseEntity.ok(containerDataBase.getAllContainers());
    }

    @PutMapping
    public void addContainer(@RequestBody Container container){
        containerDataBase.addContainer(container);
    }
    @DeleteMapping
    public void deleteContainer(long id){
        containerDataBase.deleteById(id);
    }
}
