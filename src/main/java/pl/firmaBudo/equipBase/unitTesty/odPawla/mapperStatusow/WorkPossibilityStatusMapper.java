package pl.firmaBudo.equipBase.unitTesty.odPawla.mapperStatusow;

public class WorkPossibilityStatusMapper {

    public WorkPossibilityStatus map(WorkerStatus workerStatus) {
        if (workerStatus.equals(WorkerStatus.READY_TO_WOK)) {
            return WorkPossibilityStatus.READY;
        } else {
            return WorkPossibilityStatus.NOT_READY;
        }
    }
}
