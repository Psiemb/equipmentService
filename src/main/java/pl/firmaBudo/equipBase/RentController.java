package pl.firmaBudo.equipBase;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pl.firmaBudo.equipBase.dao.dataBase.ContainerDataBase;
import pl.firmaBudo.equipBase.dao.dataBase.PowerToolDataBase;
import pl.firmaBudo.equipBase.dao.entity.Container;
import pl.firmaBudo.equipBase.dao.entity.ContainerType;
import pl.firmaBudo.equipBase.dao.entity.PowerTool;

import java.util.List;

@RestController
public class RentController {

    @Autowired
    private ContainerDataBase containerDataBase;

    @Autowired
    private PowerToolDataBase powerToolDataBase;

    @GetMapping("/v1/rent/container/all")
    public ResponseEntity<List<Container>> getAllContainers() {
        return ResponseEntity.ok(containerDataBase.getAll());
    }

    @GetMapping("/v1/rent/container/id")
    public ResponseEntity<Container> getById(@RequestParam long id) {
        return ResponseEntity.ok(containerDataBase.getById(id));
    }

    @GetMapping("/v1/rent/container/productionYear")
    public ResponseEntity<Container> getByProductionYear(@RequestParam int productionYear) {
        return ResponseEntity.ok(containerDataBase.getByProductionYear(productionYear));
    }

    @GetMapping("/v1/rent/container/type")
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


    @GetMapping("/v1/rent/powerTool/all")
    public ResponseEntity<List<PowerTool>> getAllPowerTool() {
        return ResponseEntity.ok(powerToolDataBase.getAll());
    }

    @GetMapping("/v1/rent/powerTool/id")
    public ResponseEntity<PowerTool> getByIdPowerTool(@RequestParam long id) {
        return ResponseEntity.ok(powerToolDataBase.getById(id));
    }

    @GetMapping("/v1/rent/powerTool/productionYear")
    public ResponseEntity<PowerTool> getByProductionYearPowerTool(@RequestParam int productionYear){
        return ResponseEntity.ok(powerToolDataBase.getByProductionYear(productionYear));
    }

    @GetMapping("/v1/rent/powerTool/type")
    public  ResponseEntity<PowerTool> getByType(@RequestParam String type){
        return ResponseEntity.ok(powerToolDataBase.getByType(type));
    }

    @PostMapping("/v1/rent/powerTool")
    public ResponseEntity<PowerTool> addPowerTool(@RequestBody PowerTool powerTool){
        return ResponseEntity.ok(powerToolDataBase.addPowerTool(powerTool));
    }

    @DeleteMapping("/v1/rent/powerTool")
    public void deletePowerTool(@RequestParam long id){
        powerToolDataBase.deletePowerTool(id);
    }

}
