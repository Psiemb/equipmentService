package pl.firmaBudo.equipBase.unitTesty.odPawla.mapperObiektow.przyklad4;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

class MapperOutsideResponseTest {

    private MapperOutsideResponse mapperOutsideResponse;

    @BeforeEach
    void setUp() {
        this.mapperOutsideResponse = new MapperOutsideResponse();
    }

    @Test
    public void test() {
        //given
        List<WorkerProfession> workerProfessions
                = Arrays.asList(new WorkerProfession(Profession.CARPENTER, 20),
                new WorkerProfession(Profession.GENERAL_CONSTRUCTION, 40), new WorkerProfession(Profession.REBAR_FIXER, 60));

        InternalWorker internalWorker = new InternalWorker();
        internalWorker.setWorkerProfessionList(workerProfessions);
        //when
        OutsideResponse result = mapperOutsideResponse.map((internalWorker));

        //then
        assertFalse(result.isCarpenter());
    }
}