package pl.firmaBudo.equipBase.api.endpoint.availability;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import pl.firmaBudo.equipBase.api.endpoint.availability.maper.ContainerResponseMapper;
import pl.firmaBudo.equipBase.api.endpoint.availability.request.CheckContainerByTypeRequest;
import pl.firmaBudo.equipBase.api.endpoint.availability.response.CheckContainerResponse;
import pl.firmaBudo.equipBase.api.endpoint.availability.response.ContainerResponse;
import pl.firmaBudo.equipBase.dao.dataBase.ContainerDataBase;
import pl.firmaBudo.equipBase.dao.dataBase.PowerToolDataBase;
import pl.firmaBudo.equipBase.dao.entity.ContainerEntity;

import java.util.List;

@RestController
public class AvailabilityController {

    @Autowired
    private ContainerDataBase containerDataBase;
    @Autowired
    private PowerToolDataBase powerToolDataBase;
    @Autowired
    private ContainerResponseMapper containerResponseMapper;

    // 1.Potrzeba klienta
    // 2. zastanawiamy się nad request / response. Nad wplywem na inne apliacke, na architekture
    // 3. Zamodelowanie RQ / RS
    // 4. Implementacja

    @GetMapping("/v1/availability/container")
    public ResponseEntity<ContainerResponse> availabilityContainer() {
        ContainerResponse response = containerResponseMapper.mapToResponse(containerDataBase.getAll());
        return ResponseEntity.ok(response);
    }

    // Potrzeba - klient chce wyświetlić wszystkie kontenery danego typu
    // 2 -> Czy klient odpyta nasz serwis z jednym typem kontenera czy z wieloma?  -> Klient uderza z jednym typem

    @PostMapping("/v1/availability/container/type")
    public List<CheckContainerResponse> checkContainerByType(@RequestBody CheckContainerByTypeRequest request) {
        return containerResponseMapper.mapToResponseByType(containerDataBase.getByType(request.getType()));
    }

//    @PostMapping("/v1/availability/container/check")
//    public ResponseEntity<List<ContainerEntity>> checkContainer(@RequestBody CheckContainerRequest containerQuery) {
//        if(CheckContainerType.TYPE.equals(containerQuery.getCheckBy())){
//            return ResponseEntity.ok(containerDataBase.getByType(containerQuery.getValue()));
//        }
//        return ResponseEntity.badRequest().body(null);
//    }

//    @GetMapping("/v1/availability/powerTool")
//    public ResponseEntity<List<PowerToolResponse>> getAllPowerTools() {
//        return ResponseEntity.ok(new PowerToolResponse());
//    }
}
