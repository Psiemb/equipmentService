package pl.firmaBudo.equipBase.api.endpoint.calculation2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import pl.firmaBudo.equipBase.api.endpoint.calculation2.request2.CalculationRequest2;
import pl.firmaBudo.equipBase.api.endpoint.calculation2.response2.CalculationResponse2;
import pl.firmaBudo.equipBase.dao.dataBase.ContainerDataBase;
import pl.firmaBudo.equipBase.dao.entity.container.ContainerEntity;

@RestController
public class CaluculationController2 {

    @Autowired
    private ContainerDataBase containerDataBase;

    @PostMapping("/v1/calculation2")
    public CalculationResponse2 test2(@RequestBody CalculationRequest2 request2) {
        ContainerEntity byId2 = containerDataBase.getById(request2.getId());

        CalculationResponse2 result2 = new CalculationResponse2();
        result2.setFullCost(byId2.getDailyCost() * request2.getDays());
        return result2;


    }

    //    @PostMapping("/v1/calculation2")
//    public ResponseEntity<CalculationResponse2> test(@RequestBody CalculationRequest2 request) {
//
//        ContainerEntity container = containerDataBase.getByCosTam(request.getWorkerCapacity(), request.getCosTam());
//        CalculationResponse result = calculationResponseMapper.mapToResponse2(container, request.getDays());
//
////        CalculationResponse result = new CalculationResponse();
////
////        result.setFullCost(container.getDailyCost() * request.getDays());
//
//        return ResponseEntity.ok(result);
//    }


}
