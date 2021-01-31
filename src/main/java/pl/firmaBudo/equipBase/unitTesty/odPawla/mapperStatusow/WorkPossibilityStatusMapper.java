package pl.firmaBudo.equipBase.unitTesty.odPawla.mapperStatusow;

import java.util.Objects;

public class WorkPossibilityStatusMapper {

    public WorkPossibilityStatus map(WorkerStatus workerStatus) {
        if(Objects.isNull(workerStatus)) {
            return null;
        }

        if (WorkerStatus.READY_TO_WORK.equals(workerStatus)) {
//        if (workerStatus.equals(WorkerStatus.READY_TO_WORK)) {
            return WorkPossibilityStatus.READY;
        } else {
            return WorkPossibilityStatus.NOT_READY;
        }
    }
}
