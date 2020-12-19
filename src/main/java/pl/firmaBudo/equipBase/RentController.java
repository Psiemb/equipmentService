package pl.firmaBudo.equipBase;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pl.firmaBudo.equipBase.dao.a.ContainerDataBase;
import pl.firmaBudo.equipBase.dao.entity.Container;
import pl.firmaBudo.equipBase.dao.entity.ContainerType;

import java.util.List;

@RestController
public class RentController {

    @Autowired
    private ContainerDataBase containerDataBase;

    @GetMapping("/v1/rent/container")
    public ResponseEntity<Container> getById(@RequestParam long id) {
        return ResponseEntity.ok(containerDataBase.getById(id));
    }

    @GetMapping("/v1/rent/container")
    public ResponseEntity<List<Container>> getAllContainers() {
        return ResponseEntity.ok(containerDataBase.getAllContainers());
    }

    @GetMapping("/v1/rent/container")
    public ResponseEntity<Container> getByProductionYear(@RequestParam int productionYear) {
        return ResponseEntity.ok(containerDataBase.getByProductionYear(productionYear));
    }

    @GetMapping("/v1/rent/container")
    public ResponseEntity<Container> getByType(@RequestParam ContainerType containerType) {
        return ResponseEntity.ok(containerDataBase.getByType(containerType));
    }

    @PostMapping("/v1/rent/container")
    public ResponseEntity<Container> addContainer(@RequestBody Container container) {
        return ResponseEntity.ok(containerDataBase.addContainer(container));
    }

    @DeleteMapping("/v1/rent/container")
    public void deleteContainer(@RequestParam long id) {
        containerDataBase.deleteById(id);
    }
}
