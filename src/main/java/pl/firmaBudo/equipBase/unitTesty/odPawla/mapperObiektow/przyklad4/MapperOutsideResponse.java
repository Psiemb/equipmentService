package pl.firmaBudo.equipBase.unitTesty.odPawla.mapperObiektow.przyklad4;

import java.util.List;

public class MapperOutsideResponse {

    public OutsideResponse map(InternalWorker internalWorker){
        OutsideResponse outsideResponse = new OutsideResponse();
        WorkerProfession workerProfession = new WorkerProfession();
//        outsideResponse.setTotalNumberOfWorkedDays(toNumberOfWorkedDays(internalWorker.getWorkerList()));
        outsideResponse.setTotalNumberOfWorkedDays(internalWorker.getWorkerProfessionList().size()*workerProfession.getAvargeNumberOfWorkedDays());
        outsideResponse.setCarpenter(toIsCarpenter(internalWorker.getWorkerProfessionList()));

        return outsideResponse;
    }

    private boolean toIsCarpenter(List<WorkerProfession> workerProfessionList) {
        return workerProfessionList.stream()
                .map(WorkerProfession::getProfession)
                .anyMatch(Profession.CARPENTER::equals);

    }

//    private int toNumberOfWorkedDays(List<Worker> workerList) {
//        InternalWorker internalWorker = new InternalWorker();
//        workerList.size() * internalWorker.getWorkerList(Profession.CARPENTER)
//
//    }
}
