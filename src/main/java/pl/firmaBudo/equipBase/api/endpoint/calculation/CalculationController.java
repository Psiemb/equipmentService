package pl.firmaBudo.equipBase.api.endpoint.calculation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import pl.firmaBudo.equipBase.api.endpoint.calculation.mapper.CalculationResponseMapper;
import pl.firmaBudo.equipBase.api.endpoint.calculation.request.CalculationRequest;
import pl.firmaBudo.equipBase.api.endpoint.calculation.response.CalculationResponse;
import pl.firmaBudo.equipBase.dao.dataBase.ContainerDataBase;
import pl.firmaBudo.equipBase.dao.entity.container.ContainerEntity;

@RestController
public class CalculationController {

    @Autowired
    private ContainerDataBase containerDataBase;

    @Autowired
    private CalculationResponseMapper calculationResponseMapper;

    //    @PostMapping("/v1/calculation")
//    public CalculationResponse test(@RequestBody CalculationRequest request) {
//        wyciągniecie odpowidniego kontenera z bazy
//        ContainerEntity byId = containerDataBase.getById(request.getId());
//
//        obliczenie calkowitego kosztu najmu kontenera
//        double calculatedCost = byId.getDailyCost() * request.getDays();
//
//         utworzenie obiektu odpowiedzi
//        CalculationResponse result = new CalculationResponse();
//         wlozenie obliczonego wczesniej calkowitego kosztu najmu kontenera do przygotowanego miesjca w response
//        result.setFullCost(calculatedCost);
//
//         zwrocenie obiektu odpowiedzi
//        return result;
//
//    }
    @PostMapping("/v1/calculation")
    public ResponseEntity<CalculationResponse> kierownikBudowy(@RequestBody CalculationRequest request) {

        ContainerEntity container = containerDataBase.getById(request.getId());
        CalculationResponse result = calculationResponseMapper.mapToResponse(container, request.getDays());

//        CalculationResponse result = new CalculationResponse();
//
//        result.setFullCost(container.getDailyCost() * request.getDays());

        return ResponseEntity.ok(result);
    }





}
