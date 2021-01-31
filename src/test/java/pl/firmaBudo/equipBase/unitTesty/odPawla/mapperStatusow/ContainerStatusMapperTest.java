package pl.firmaBudo.equipBase.unitTesty.odPawla.mapperStatusow;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContainerStatusMapperTest {

    private ContainerStatusMapper containerStatusMapper;

    @BeforeEach
    void setUp(){
        this.containerStatusMapper = new ContainerStatusMapper();
    }

    @Test
    void checkStatusForReasdyToRent(){

        //given
        InternalContainerStatus readyToUse = InternalContainerStatus.READY_TO_USE;


        //when
        ContainerRentStatus status = containerStatusMapper.toContainerStatus(readyToUse);

        //then

        assertEquals(ContainerRentStatus.AVAILABLE, status);

    }
    @Test
    void checkStatusForTransportToBase(){

        //given
        InternalContainerStatus readyToUse = InternalContainerStatus.TRANSPORT_TO_BASE;


        //when
        ContainerRentStatus status = containerStatusMapper.toContainerStatus(readyToUse);

        //then

        assertEquals(ContainerRentStatus.AVAILABLE, status);

    }
    @Test
    void checkStatusForRent(){

        //given
        InternalContainerStatus readyToUse = InternalContainerStatus.RENT;


        //when
        ContainerRentStatus status = containerStatusMapper.toContainerStatus(readyToUse);

        //then

        assertEquals(ContainerRentStatus.NOT_AVAILABLE, status);

    }
    @Test
    void checkStatusForTransportToClient(){

        //given
        InternalContainerStatus readyToUse = InternalContainerStatus.TRANSPORT_TO_CLIENT;


        //when
        ContainerRentStatus status = containerStatusMapper.toContainerStatus(readyToUse);

        //then

        assertEquals(ContainerRentStatus.NOT_AVAILABLE, status);

    }
    @Test
    void checkStatusForInRepair(){

        //given
        InternalContainerStatus readyToUse = InternalContainerStatus.IN_REPAIR;


        //when
        ContainerRentStatus status = containerStatusMapper.toContainerStatus(readyToUse);

        //then

        assertEquals(ContainerRentStatus.TEMPORARY_DECOMMISSION, status);

    }
    @Test
    void checkStatusForDemage(){

        //given
        InternalContainerStatus readyToUse = InternalContainerStatus.DAMAGE;


        //when
        ContainerRentStatus status = containerStatusMapper.toContainerStatus(readyToUse);

        //then

        assertEquals(ContainerRentStatus.TEMPORARY_DECOMMISSION, status);

    }
    @Test
    void checkStatusForOnService(){

        //given
        InternalContainerStatus readyToUse = InternalContainerStatus.ON_SERVICE;


        //when
        ContainerRentStatus status = containerStatusMapper.toContainerStatus(readyToUse);

        //then

        assertEquals(ContainerRentStatus.TEMPORARY_DECOMMISSION, status);

    }


}