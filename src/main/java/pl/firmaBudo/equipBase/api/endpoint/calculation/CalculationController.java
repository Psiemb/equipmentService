package pl.firmaBudo.equipBase.api.endpoint.calculation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import pl.firmaBudo.equipBase.api.endpoint.calculation.request.CalculationRequest;
import pl.firmaBudo.equipBase.api.endpoint.calculation.response.CalculationResponse;
import pl.firmaBudo.equipBase.dao.dataBase.ContainerDataBase;
import pl.firmaBudo.equipBase.dao.entity.container.ContainerEntity;

@RestController
public class CalculationController {

    @Autowired
    private ContainerDataBase containerDataBase;

    @PostMapping("/v1/calculation")
    public CalculationResponse test(@RequestBody CalculationRequest request) {
        //wyciągniecie odpowidniego kontenera z bazy
        ContainerEntity byId = containerDataBase.getById(request.getId());

        //obliczenie calkowitego kosztu najmu kontenera
        double calculatedCost = byId.getDailyCost() * request.getDays();

        // utworzenie obiektu odpowiedzi
        CalculationResponse result = new CalculationResponse();
        // wlozenie obliczonego wczesniej calkowitego kosztu najmu kontenera do przygotowanego miesjca w response
        result.setFullCost(calculatedCost);

        // zwrocenie obiektu odpowiedzi
        return result;

    }

}
