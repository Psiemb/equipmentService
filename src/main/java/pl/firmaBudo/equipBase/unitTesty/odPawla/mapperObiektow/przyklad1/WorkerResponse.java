package pl.firmaBudo.equipBase.unitTesty.odPawla.mapperObiektow.przyklad1;

public class WorkerResponse {

    private String name;
    private boolean wasIll;
    private boolean readyToWork;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isWasIll() {
        return wasIll;
    }

    public void setWasIll(boolean wasIll) {
        this.wasIll = wasIll;
    }

    public boolean isReadyToWork() {
        return readyToWork;
    }

    public void setReadyToWork(boolean readyToWork) {
        this.readyToWork = readyToWork;
    }
}
