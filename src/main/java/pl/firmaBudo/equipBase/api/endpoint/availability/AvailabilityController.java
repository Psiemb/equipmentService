package pl.firmaBudo.equipBase.api.endpoint.availability;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import pl.firmaBudo.equipBase.api.endpoint.availability.maper.ContainerResponseMapper;
import pl.firmaBudo.equipBase.api.endpoint.availability.request.CheckContainerQuery;
import pl.firmaBudo.equipBase.api.endpoint.availability.request.CheckContainerType;
import pl.firmaBudo.equipBase.api.endpoint.availability.response.ContainerResponse;
import pl.firmaBudo.equipBase.dao.dataBase.ContainerDataBase;
import pl.firmaBudo.equipBase.dao.dataBase.PowerToolDataBase;
import pl.firmaBudo.equipBase.dao.entity.Container;

import java.util.List;

@RestController
public class AvailabilityController {

    @Autowired
    private ContainerDataBase containerDataBase;
    @Autowired
    private PowerToolDataBase powerToolDataBase;
    @Autowired
    private ContainerResponseMapper containerResponseMapper;

    @GetMapping("/v1/availability/container")
    public ResponseEntity<ContainerResponse> availabilityContainer() {
        ContainerResponse response = containerResponseMapper.mapToResponse(containerDataBase.getAll());
        return ResponseEntity.ok(response);
    }

    @PostMapping("/v1/availability/container/check")
    public ResponseEntity<List<Container>> checkContainer(@RequestBody CheckContainerQuery containerQuery) {
        if(CheckContainerType.TYPE.equals(containerQuery.getCheckBy())){
            return ResponseEntity.ok(containerDataBase.getByType(containerQuery.getValue()));
        }
        return ResponseEntity.badRequest().body(null);
    }

//    @GetMapping("/v1/availability/powerTool")
//    public ResponseEntity<List<PowerToolResponse>> getAllPowerTools() {
//        return ResponseEntity.ok(new PowerToolResponse());
//    }
}
