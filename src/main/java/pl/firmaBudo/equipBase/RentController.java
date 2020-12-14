package pl.firmaBudo.equipBase;

import org.springframework.web.bind.annotation.*;
import pl.firmaBudo.equipBase.dao.entity.Container;
import pl.firmaBudo.equipBase.dao.entity.Excavator;
import pl.firmaBudo.equipBase.dao.entity.PowerTool;

@RestController
@RequestMapping("v1/rent")
public class RentController {


    @GetMapping("/container")
    public Container getContainer(Container container) {
        return container;
    }

    @GetMapping("/excavator")
    public Excavator getExcavator(Excavator excavator) {
        return excavator;
    }

    @GetMapping("powerTool")
    public PowerTool getPowerTool(PowerTool powerTool) {
        return powerTool;
    }

    @PostMapping("/container")
    public void addContainer(Container container) {
    }

    @PostMapping("/excavator")
    public void addExcavator(Excavator excavator) {
    }

    @PostMapping("powerTool")
    public void addPowerTool(PowerTool powerTool) {
    }

    @DeleteMapping("/container")
    public void deleteContainer(Container container) {

    }

    @DeleteMapping("/excavator")
    public void deleteExcavator(Excavator excavator) {

    }

    @DeleteMapping("powerTool")
    public void deletePowerTool(PowerTool powerTool) {
    }

    @PutMapping("/container")
    public void updateContainer(Container container) {

    }

    @PutMapping("/excavator")
    public void updateExcavator(Excavator excavator){

    }
    @PutMapping("powerTool")
    public void updatePowerTool(PowerTool powerTool){

    }


}
