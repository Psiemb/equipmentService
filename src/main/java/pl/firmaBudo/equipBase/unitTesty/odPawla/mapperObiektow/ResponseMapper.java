package pl.firmaBudo.equipBase.unitTesty.odPawla.mapperObiektow;

import java.util.List;

public class ResponseMapper {

    public WorkerResponse mapToResponse(InternalModelWorker internalModelWorker) {
        WorkerResponse workerResponse = new WorkerResponse();
        workerResponse.setName(internalModelWorker.getName());
        workerResponse.setWasIll(toWasIll(internalModelWorker.getHistoryWorkStatusList()));
        workerResponse.setReadyToWork(toReadyToWork(internalModelWorker.getHistoryWorkStatusList()));

        return workerResponse;
    }

    private boolean toWasIll(List<HistoryWorkStatus> historyWorkStatusList) {
        return historyWorkStatusList.stream()
                .map(HistoryWorkStatus::getStatusWork)
                .anyMatch(StatusWork.ILL::equals);
//                .anyMatch(status -> StatusWork.ILL.equals(status));
    }

    private boolean toReadyToWork(List<HistoryWorkStatus> historyWorkStatusList) {
        HistoryWorkStatus newestWorkStatus = historyWorkStatusList.get(0);
        return newestWorkStatus.getStatusWork().equals(StatusWork.READY_TO_WORK);
    }
}
