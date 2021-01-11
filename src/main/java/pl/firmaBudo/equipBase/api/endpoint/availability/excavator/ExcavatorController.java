package pl.firmaBudo.equipBase.api.endpoint.availability.excavator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import pl.firmaBudo.equipBase.api.endpoint.availability.excavator.mapper.ExcavatorResponseMapper;
import pl.firmaBudo.equipBase.api.endpoint.availability.excavator.request.CheckExcavatorByTypeRequest;
import pl.firmaBudo.equipBase.api.endpoint.availability.excavator.response.CheckExcavatorByTypeResponse;
import pl.firmaBudo.equipBase.api.endpoint.availability.excavator.response.ExcavatorResponse;
import pl.firmaBudo.equipBase.dao.dataBase.ExcavatorDataBase;

import java.util.List;

@RestController
public class ExcavatorController {

    @Autowired
    private ExcavatorDataBase excavatorDataBase;
    @Autowired
    private ExcavatorResponseMapper excavatorResponseMapper;

    @GetMapping("/v1/availability/excavator")
    public ResponseEntity<ExcavatorResponse> availabilityExcavator() {
        ExcavatorResponse response = excavatorResponseMapper.mapToResponse(excavatorDataBase.getAll());
        return ResponseEntity.ok(response);
    }

    @PostMapping("/v1/availability/excavator/type")
    public List<CheckExcavatorByTypeResponse> checkExcavatorByType(@RequestBody CheckExcavatorByTypeRequest request) {
        return excavatorResponseMapper.mapToResponseByType(excavatorDataBase.getByType(request.getType().name()));
    }
}