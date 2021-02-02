package pl.firmaBudo.equipBase.unitTesty.odPawla.mapperObiektow.przyklad1;

import java.util.List;
import java.util.Objects;

public class ResponseMapper {

    public WorkerResponse mapToResponse(InternalModelWorker internalModelWorker) {
        WorkerResponse workerResponse = new WorkerResponse();
        workerResponse.setName(internalModelWorker.getName());
        workerResponse.setWasIll(toWasIll(internalModelWorker.getHistoryWorkStatusList()));
        workerResponse.setReadyToWork(toReadyToWork(internalModelWorker.getHistoryWorkStatusList()));

        return workerResponse;
    }

    private boolean toWasIll(List<HistoryWorkStatus> historyWorkStatusList) {
        if(Objects.nonNull(historyWorkStatusList) || historyWorkStatusList.isEmpty()){
            return false;
        }
        return historyWorkStatusList.stream()
                .map(HistoryWorkStatus::getStatusWork)
                .anyMatch(StatusWork.ILL::equals);
//                .anyMatch(status -> StatusWork.ILL.equals(status));
    }

    private boolean toReadyToWork(List<HistoryWorkStatus> historyWorkStatusList) {
        if (Objects.isNull(historyWorkStatusList) || historyWorkStatusList.isEmpty()) {
            return false;
        }

//        return historyWorkStatusList.get(0).getStatusWork().equals(StatusWork.READY_TO_WORK);
        return StatusWork.READY_TO_WORK.equals(historyWorkStatusList.get(0).getStatusWork());
    }
}
