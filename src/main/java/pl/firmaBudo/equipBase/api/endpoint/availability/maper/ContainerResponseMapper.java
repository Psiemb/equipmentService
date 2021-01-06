package pl.firmaBudo.equipBase.api.endpoint.availability.maper;

import org.springframework.stereotype.Component;
import pl.firmaBudo.equipBase.api.endpoint.availability.response.AvailabilityContainer;
import pl.firmaBudo.equipBase.api.endpoint.availability.response.CheckContainerResponse;
import pl.firmaBudo.equipBase.api.endpoint.availability.response.ContainerResponse;
import pl.firmaBudo.equipBase.dao.entity.ContainerEntity;
import pl.firmaBudo.equipBase.dao.entity.ContainerType;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Component
public class ContainerResponseMapper {

    public ContainerResponse mapToResponse(List<ContainerEntity> containerEntities) {
//        List<AvailabilityContainer> availabilityContainers = containers.stream()
//                .collect(Collectors.groupingBy(Container::getType, Collectors.counting()))
//                .entrySet().stream()
//                .map(e -> new AvailabilityContainer(e.getKey(), e.getValue()))
//                .collect(Collectors.toList());

        Map<ContainerType, Long> map = containerEntities.stream()
                .collect(Collectors.groupingBy(ContainerEntity::getType, Collectors.counting()));

        List<AvailabilityContainer> availabilityContainers = map.entrySet().stream()
                .map(e -> new AvailabilityContainer(e.getKey(), e.getValue()))
                .collect(Collectors.toList());

        return new ContainerResponse(availabilityContainers);
    }

    public List<CheckContainerResponse> mapToResponseByParameter(List<ContainerEntity> containerEntities) {
        return containerEntities.stream()
                .map(this::mapToCheckContainer)
                .collect(Collectors.toList());
    }

    private CheckContainerResponse mapToCheckContainer(ContainerEntity containerEntity) {
        CheckContainerResponse checkContainerResponse = new CheckContainerResponse();
        checkContainerResponse.setId(containerEntity.getId());
        checkContainerResponse.setType(containerEntity.getType());
        checkContainerResponse.setWorkerCapacity(containerEntity.getWorkerCapacity());
        checkContainerResponse.setDailyCost(containerEntity.getDailyCost());


        return checkContainerResponse;
    }

//    public List<CheckContainerResponse> mapToResponseByCost(List<ContainerEntity> containerEntities){
//        return containerEntities.stream()
//                .map()
//    }
}
 