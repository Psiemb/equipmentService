package pl.firmaBudo.equipBase;

import org.springframework.web.bind.annotation.*;
import pl.firmaBudo.equipBase.dao.entity.Container;
import pl.firmaBudo.equipBase.dao.entity.Excavator;
import pl.firmaBudo.equipBase.dao.entity.PowerTool;

@RestController
@RequestMapping("v1/rent")
public class RentController {


    @GetMapping("/container")
    public Container getContainer(Container container){
        return container;
    }
    @GetMapping("/excavator")
    public Excavator getExcavator(Excavator excavator){
        return excavator;
    }
    @GetMapping("powerTool")
    public PowerTool getPowerTool(PowerTool powerTool){
        return powerTool;
    }

}
