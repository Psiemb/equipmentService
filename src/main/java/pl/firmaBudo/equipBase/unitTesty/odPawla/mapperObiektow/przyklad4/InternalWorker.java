package pl.firmaBudo.equipBase.unitTesty.odPawla.mapperObiektow.przyklad4;

import java.util.List;

public class InternalWorker {

    private List<WorkerProfession> workerProfessionList;
    private boolean hired;

    public List<WorkerProfession> getWorkerProfessionList() {
        return workerProfessionList;
    }

    public void setWorkerProfessionList(List<WorkerProfession> workerProfessionList) {
        this.workerProfessionList = workerProfessionList;
    }

    public boolean isHired() {
        return hired;
    }

    public void setHired(boolean hired) {
        this.hired = hired;
    }
}
