package pl.firmaBudo.equipBase.unitTesty.odPawla.mapperObiektow;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
//TODO: ctrl + alt + L
//TODO: ctrl + alt + O  - to musi być u Ciebie nawyk
import pl.firmaBudo.equipBase.unitTesty.odPawla.mapperObiektow.przyklad1.*;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ResponseMapperTest {

    private ResponseMapper responseMapper;


    @BeforeEach
    void setUp(){
        this.responseMapper = new ResponseMapper();
    }

    @Test
    public void shouldWasIllBecauseStatusWorkIsIll() {
        //given
        List<HistoryWorkStatus> historyWorkStatuses
                = Arrays.asList(new HistoryWorkStatus(LocalDate.now(), StatusWork.ILL),
                new HistoryWorkStatus(LocalDate.now().minusDays(2), StatusWork.READY_TO_WORK));

        InternalModelWorker internalModelWorker = new InternalModelWorker();
        //TODO: jak nie sprawdzasz imienia to nie musisz ustawiać
//        internalModelWorker.setName("Pawel");
        internalModelWorker.setHistoryWorkStatusList(historyWorkStatuses);

        //when
        WorkerResponse result = responseMapper.mapToResponse(internalModelWorker);

        //then
        assertTrue(result.isWasIll());
    }

    @Test
    public void shouldReturnReadyToWorkBecauseStatusWorkNotReadyToWorkOnFirtPostion() {
        //given
        List<HistoryWorkStatus> historyWorkStatuses
                = Arrays.asList(new HistoryWorkStatus(LocalDate.now(), StatusWork.ILL),
                new HistoryWorkStatus(LocalDate.now().minusDays(2), StatusWork.READY_TO_WORK));

        InternalModelWorker internalModelWorker = new InternalModelWorker();
        //TODO: jak nie sprawdzasz imienia to nie musisz ustawiać
//        internalModelWorker.setName("Pawel");
        internalModelWorker.setHistoryWorkStatusList(historyWorkStatuses);

        //when
        WorkerResponse result = responseMapper.mapToResponse(internalModelWorker);

        //then
        assertFalse(result.isReadyToWork());
    }

    @Test
    public void shouldWasNotIllBecauseStatusWorkNotIll() {
        //given
        List<HistoryWorkStatus> historyWorkStatuses
                = Arrays.asList(new HistoryWorkStatus(LocalDate.now(), StatusWork.NEW),
                new HistoryWorkStatus(LocalDate.now().minusDays(2), StatusWork.READY_TO_WORK));
                new HistoryWorkStatus(LocalDate.now().minusDays(2), StatusWork.WORKING);
                new HistoryWorkStatus(LocalDate.now().minusDays(2), StatusWork.ON_VACATION);

        InternalModelWorker internalModelWorker = new InternalModelWorker();
        //TODO: jak nie sprawdzasz imienia to nie musisz ustawiać
//        internalModelWorker.setName("Pawel");
        internalModelWorker.setHistoryWorkStatusList(historyWorkStatuses);

        //when
        WorkerResponse result = responseMapper.mapToResponse(internalModelWorker);

        //then
//        assertEquals("Pawel", result);
        assertFalse(result.isWasIll());
    }

    @Test
    public void shouldReturnNotReadyToWorkBecauseStatusWorkNotReadyToWorkOnFirtPostion() {
        //given
        List<HistoryWorkStatus> historyWorkStatuses
                = Arrays.asList(new HistoryWorkStatus(LocalDate.now(), StatusWork.NEW),
                new HistoryWorkStatus(LocalDate.now().minusDays(2), StatusWork.ILL));
        new HistoryWorkStatus(LocalDate.now().minusDays(2), StatusWork.WORKING);
        new HistoryWorkStatus(LocalDate.now().minusDays(2), StatusWork.ON_VACATION);

        InternalModelWorker internalModelWorker = new InternalModelWorker();
        //TODO: jak nie sprawdzasz imienia to nie musisz ustawiać
//        internalModelWorker.setName("Pawel");
        internalModelWorker.setHistoryWorkStatusList(historyWorkStatuses);

        //when
        WorkerResponse result = responseMapper.mapToResponse(internalModelWorker);

        //then
//        assertEquals("Pawel", result);
        assertFalse(result.isReadyToWork());
    }

    @Test
    public void shouldReturnPawelBecauseNameIsPawel() {
        //given
        //TODO: jak w tym tescie sprawdzasz tylko mapowanie 'name', to możesz zasetować pustą listę
        List<HistoryWorkStatus> historyWorkStatuses = Collections.emptyList();
        //TODO: i dzięki temu zobaczymy, że gdy lista HistoryWorkStatusow jest pusta (ale nie nullowa!), to i tak leci błąd -

//        List<HistoryWorkStatus> historyWorkStatuses
//                = Arrays.asList(new HistoryWorkStatus(LocalDate.now(), StatusWork.ILL),
//                new HistoryWorkStatus(LocalDate.now().minusDays(2), StatusWork.READY_TO_WORK));

        InternalModelWorker internalModelWorker = new InternalModelWorker();
        internalModelWorker.setName("Pawel");
        internalModelWorker.setHistoryWorkStatusList(historyWorkStatuses);

        //when
        WorkerResponse result = responseMapper.mapToResponse(internalModelWorker);

        //then
        assertEquals("Pawel", result.getName());
    }

//    @Test
//    public void shouldReturnNullBecauseStatusWorkIsNull() {
//        given
//        List<HistoryWorkStatus> historyWorkStatuses
//                = Arrays.asList(new HistoryWorkStatus(LocalDate.now(), null),
//                new HistoryWorkStatus(LocalDate.now().minusDays(2), StatusWork.READY_TO_WORK));
//
//        InternalModelWorker internalModelWorker = new InternalModelWorker();
//        internalModelWorker.setName("Pawel");
//        internalModelWorker.setHistoryWorkStatusList(historyWorkStatuses);
//
//        when
//        WorkerResponse result = responseMapper.mapToResponse(internalModelWorker);
//
//        then
//      assertFalse(null);
//    }

}