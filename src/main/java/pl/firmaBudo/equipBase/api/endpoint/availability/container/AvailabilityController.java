package pl.firmaBudo.equipBase.api.endpoint.availability.container;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import pl.firmaBudo.equipBase.api.endpoint.availability.container.mapper.ContainerResponseMapper;
import pl.firmaBudo.equipBase.api.endpoint.availability.container.request.CheckContainerByCostRequest;
import pl.firmaBudo.equipBase.api.endpoint.availability.container.request.CheckContainerByTypeRequest;
import pl.firmaBudo.equipBase.api.endpoint.availability.container.response.AvailabilityContainer;
import pl.firmaBudo.equipBase.api.endpoint.availability.container.response.CheckContainerResponse;
import pl.firmaBudo.equipBase.api.endpoint.availability.container.response.ContainerResponse;
import pl.firmaBudo.equipBase.api.endpoint.availability.excavator.mapper.ExcavatorResponseMapper;
import pl.firmaBudo.equipBase.dao.dataBase.ContainerDataBase;
import pl.firmaBudo.equipBase.dao.dataBase.ExcavatorDataBase;

import java.util.List;

@RestController
public class AvailabilityController {

    @Autowired
    private ContainerDataBase containerDataBase;
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

    //To jest zle podejscie do tworzenie Response z naszego endpointa. Ponieważ, nie ma możliwości rozszerzenia odpowiedzi w przyszłości.
    @GetMapping("/v1/availability/container/2")
    public ResponseEntity<List<AvailabilityContainer>> availabilityContainer2() {
        ContainerResponse response = containerResponseMapper.mapToResponse(containerDataBase.getAll());
        return ResponseEntity.ok(response.getContainers());
    }

    // Potrzeba - klient chce wyświetlić wszystkie kontenery danego typu
    // 2 -> Czy klient odpyta nasz serwis z jednym typem kontenera czy z wieloma?  -> Klient uderza z jednym typem

    @PostMapping("/v1/availability/container/type")
    public List<CheckContainerResponse> checkContainerByType(@RequestBody CheckContainerByTypeRequest request) {
        return containerResponseMapper.mapToResponseByParameter(containerDataBase.getByType(request.getType().name()));
    }

    @PostMapping("/v1/availability/container/byMaxCost")
    public List<CheckContainerResponse> checkContainerByCostResponses(@RequestBody CheckContainerByCostRequest request) {
        return containerResponseMapper.mapToResponseByParameter(containerDataBase.getByMaxCost(request.getDailyCost()));
    }
}
