package pl.firmaBudo.equipBase.api.endpoint.availability.maper;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import pl.firmaBudo.equipBase.api.endpoint.availability.response.ContainerResponse;
import pl.firmaBudo.equipBase.dao.entity.Container;
import pl.firmaBudo.equipBase.dao.entity.ContainerType;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ContainerResponseMapperTest {

    private ContainerResponseMapper containerResponseMapper;

    @BeforeEach
    void setUp() {
        this.containerResponseMapper = new ContainerResponseMapper();
    }

    @Test
    void shouldGroupingByContainerType() {
        // given
        List<Container> containers = new ArrayList<>();
        containers.add(new Container(5, ContainerType.EMPLOYEE));
        containers.add(new Container(5, ContainerType.EMPLOYEE));
        containers.add(new Container(5, ContainerType.STORAGE));
        containers.add(new Container(5, ContainerType.OFFICE));
        containers.add(new Container(5, ContainerType.OFFICE));
        containers.add(new Container(5, ContainerType.OFFICE));
        containers.add(new Container(5, ContainerType.SANITARY));
        containers.add(new Container(5, ContainerType.SANITARY));
        containers.add(new Container(5, ContainerType.SANITARY));
        containers.add(new Container(5, ContainerType.SANITARY));

        // when
        ContainerResponse result = containerResponseMapper.mapToResponse(containers);

        // then
        assertEquals(4, result.getContainers().size());
        assertEquals(ContainerType.EMPLOYEE, result.getContainers().get(0).getType());
        assertEquals(2, result.getContainers().get(0).getCount());
        assertEquals(ContainerType.SANITARY, result.getContainers().get(1).getType());
        assertEquals(4, result.getContainers().get(1).getCount());
        assertEquals(ContainerType.STORAGE, result.getContainers().get(2).getType());
        assertEquals(1, result.getContainers().get(2).getCount());
        assertEquals(ContainerType.OFFICE, result.getContainers().get(3).getType());
        assertEquals(3, result.getContainers().get(3).getCount());
    }

}