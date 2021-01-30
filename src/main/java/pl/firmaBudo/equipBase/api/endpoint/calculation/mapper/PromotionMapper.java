package pl.firmaBudo.equipBase.api.endpoint.calculation.mapper;

import pl.firmaBudo.equipBase.dao.entity.container.ContainerEntity;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class PromotionMapper {
    public int calculatePromo(ContainerEntity containerEntity) {


        return (int) (containerEntity.getDailyCost() * Math.random());
    }

}
