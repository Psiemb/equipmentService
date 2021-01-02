package pl.firmaBudo.equipBase.api.endpoint.availability.maper;

import org.springframework.stereotype.Component;
import pl.firmaBudo.equipBase.api.endpoint.availability.response.AvailabilityContainer;
import pl.firmaBudo.equipBase.api.endpoint.availability.response.ContainerResponse;
import pl.firmaBudo.equipBase.dao.entity.Container;
import pl.firmaBudo.equipBase.dao.entity.ContainerType;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Component
public class ContainerResponseMapper {

    public ContainerResponse mapToResponse(List<Container> containers) {
//        List<AvailabilityContainer> availabilityContainers = containers.stream()
//                .collect(Collectors.groupingBy(Container::getType, Collectors.counting()))
//                .entrySet().stream()
//                .map(e -> new AvailabilityContainer(e.getKey(), e.getValue()))
//                .collect(Collectors.toList());

        Map<ContainerType, Long> map = containers.stream()
                .collect(Collectors.groupingBy(Container::getType, Collectors.counting()));

        List<AvailabilityContainer> availabilityContainers = map.entrySet().stream()
                .map(e -> new AvailabilityContainer(e.getKey(), e.getValue()))
                .collect(Collectors.toList());

        return new ContainerResponse(availabilityContainers);
    }

}
 