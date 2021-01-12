package pl.firmaBudo.equipBase.api.endpoint.calculation.mapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import pl.firmaBudo.equipBase.api.endpoint.calculation.response.CalculationResponse;
import pl.firmaBudo.equipBase.dao.entity.container.ContainerEntity;

@Component
public class CalculationResponseMapper {

//    @Autowired
//    private CalculationMaster calculationMaster;

    public CalculationResponse mapToResponse(ContainerEntity containerEntity, int days) {
        CalculationResponse calculationResponse = new CalculationResponse();
//      double totalCost =  calculationMaster.getTotalCost(....);
        double totalCost = containerEntity.getDailyCost() * days;
        calculationResponse.setFullCost(totalCost);

        return calculationResponse;

    }
}
