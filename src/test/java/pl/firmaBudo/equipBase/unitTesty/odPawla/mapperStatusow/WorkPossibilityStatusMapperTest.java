package pl.firmaBudo.equipBase.unitTesty.odPawla.mapperStatusow;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class WorkPossibilityStatusMapperTest {

    private WorkPossibilityStatusMapper workPossibilityStatusMapper;

    @BeforeEach
    void setUp(){
        this.workPossibilityStatusMapper = new WorkPossibilityStatusMapper();
    }

    @Test
    void checkStatusIfWorkerReadyToWork(){

        //given
        WorkerStatus checkStatus = WorkerStatus.READY_TO_WORK;


        //when
        WorkPossibilityStatus status = workPossibilityStatusMapper.map(checkStatus);

        //then

        assertEquals(WorkPossibilityStatus.READY, status);

    }
    @Test
    void checkStatusIfWorkerNotReadyToWork(){

        //given
        WorkerStatus checkStatus = WorkerStatus.ILL;


        //when
        WorkPossibilityStatus status = workPossibilityStatusMapper.map(checkStatus);

        //then

        assertEquals(WorkPossibilityStatus.NOT_READY, status);

    }

}