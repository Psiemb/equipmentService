package pl.firmaBudo.equipBase.api.endpoint.calculation.mapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import pl.firmaBudo.equipBase.api.endpoint.calculation.response.CalculationResponse;
import pl.firmaBudo.equipBase.dao.entity.container.ContainerEntity;

import java.util.Objects;

@Component
public class CalculationResponseMapper {

//    @Autowired
//    private PromotionMapper promotionMapper;

    public CalculationResponse mapToResponse(ContainerEntity containerEntity, int days) {
        CalculationResponse calculationResponse = new CalculationResponse();

        if(days < 0 || Objects.isNull(containerEntity) || containerEntity.getDailyCost() < 0) {
            calculationResponse.setFullCost(0);

        }
        else {
            double totalCost = containerEntity.getDailyCost() * days;
//            double totalCost = promotionMapper.calculatePromo(containerEntity) * days;
            calculationResponse.setFullCost(totalCost);

        }

        return calculationResponse;
    }
}
