package pl.firmaBudo.equipBase.unitTesty.odPawla.mapperObiektow.przyklad2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import pl.firmaBudo.equipBase.unitTesty.odPawla.mapperObiektow.przyklad1.*;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MapperPRzyklad2Test {
    private MapperPRzyklad2 mapperPRzyklad2;


    @BeforeEach
    void setUp(){
        this.mapperPRzyklad2 = new MapperPRzyklad2();
    }

    @Test
    public void test() {
        //given
        ModelWewnRozliczen modelWewnRozliczen = new ModelWewnRozliczen();
//        List<HistoryWorkStatus> historyWorkStatuses
//                = Arrays.asList(new HistoryWorkStatus(LocalDate.now(), StatusWork.ILL),
//                new HistoryWorkStatus(LocalDate.now().minusDays(2), StatusWork.READY_TO_WORK));
//
//        InternalModelWorker internalModelWorker = new InternalModelWorker();

//        internalModelWorker.setName("Pawel");
//        internalModelWorker.setHistoryWorkStatusList(historyWorkStatuses);

        //when
//        WorkerResponse result = responseMapper.mapToResponse(internalModelWorker);

        //then
//        assertTrue(result.isWasIll());
    }

}