package pl.firmaBudo.equipBase.api.endpoint.calculation.mapper;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import pl.firmaBudo.equipBase.api.endpoint.calculation.response.CalculationResponse;
import pl.firmaBudo.equipBase.dao.entity.container.ContainerEntity;

import static org.junit.jupiter.api.Assertions.*;

class CalculationResponseMapperTest {

    private CalculationResponseMapper calculationResponseMapper;

    @BeforeEach
    public void setUp() {
        this.calculationResponseMapper = new CalculationResponseMapper();
    }

    @Test
    public void shouldRetrun600BecauseOfInputs() {
        // given
        ContainerEntity containerEntity = new ContainerEntity();
        containerEntity.setDailyCost(120);
        int days = 5;

        // when
        CalculationResponse result = calculationResponseMapper.mapToResponse(containerEntity, days);

        // then
        assertEquals(600, result.getFullCost());
    }

    @Test
    public void test() {
        // given
        ContainerEntity containerEntity = new ContainerEntity();
        containerEntity.setDailyCost(120);
        int days = -5;

        // when
        CalculationResponse result = calculationResponseMapper.mapToResponse(containerEntity, days);

        // then
        assertEquals(0, result.getFullCost());
    }

    @Test
    public void test2() {
        // given
        ContainerEntity containerEntity = new ContainerEntity();
        containerEntity.setDailyCost(120);
        int days = 5;

        // when
        CalculationResponse result = calculationResponseMapper.mapToResponse(null, days);

        // then
        assertEquals(0, result.getFullCost());
    }

    @Test
    public void test3() {
        // given
        ContainerEntity containerEntity = new ContainerEntity();
        containerEntity.setDailyCost(120);
        int days = 0;

        // when
        CalculationResponse result = calculationResponseMapper.mapToResponse(containerEntity, days);

        // then
        assertEquals(0, result.getFullCost());
    }

    @Test
    public void test4() {
        // given
        ContainerEntity containerEntity = new ContainerEntity();
        containerEntity.setDailyCost(-120);
        int days = 5;

        // when
        CalculationResponse result = calculationResponseMapper.mapToResponse(containerEntity, days);

        // then
        assertEquals(0, result.getFullCost());
    }

}