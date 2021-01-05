package pl.firmaBudo.equipBase.api.endpoint.availability.maper;

import org.springframework.stereotype.Component;
import pl.firmaBudo.equipBase.api.endpoint.availability.response.AvailabilityExcavator;
import pl.firmaBudo.equipBase.api.endpoint.availability.response.CheckExcavatorByTypeResponse;
import pl.firmaBudo.equipBase.api.endpoint.availability.response.ExcavatorResponse;
import pl.firmaBudo.equipBase.dao.entity.ExcavatorEntity;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class ExcavatorResponseMapper {


    public ExcavatorResponse mapToResponse(List<ExcavatorEntity> excavatorEntities){

        List<AvailabilityExcavator> availabilityExcavators = excavatorEntities.stream()
                .collect(Collectors.groupingBy(ExcavatorEntity::getType,Collectors.counting()))
                .entrySet().stream()
                .map(e -> new AvailabilityExcavator(e.getKey(), e.getValue()))
                .collect(Collectors.toList());

        return new ExcavatorResponse(availabilityExcavators);
    }

    public List<CheckExcavatorByTypeResponse> mapToResponseByType(List<ExcavatorEntity> excavatorEntities){
       return excavatorEntities.stream()
                .map(this::mapToCheckExcavator)
                .collect(Collectors.toList());

    }

    private CheckExcavatorByTypeResponse mapToCheckExcavator(ExcavatorEntity excavatorEntity) {
        CheckExcavatorByTypeResponse checkExcavatorByTypeResponse = new CheckExcavatorByTypeResponse();
        checkExcavatorByTypeResponse.setId(excavatorEntity.getId());
        checkExcavatorByTypeResponse.setType(excavatorEntity.getType());
        checkExcavatorByTypeResponse.setBucket(excavatorEntity.getBucketSize());
        return checkExcavatorByTypeResponse;
    }
}
