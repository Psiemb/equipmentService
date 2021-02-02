package pl.firmaBudo.equipBase.unitTesty.odPawla.mapperObiektow.przyklad1;

import java.util.List;

public class InternalModelWorker {

    private String name;
    private List<HistoryWorkStatus> historyWorkStatusList;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<HistoryWorkStatus> getHistoryWorkStatusList() {
        return historyWorkStatusList;
    }

    public void setHistoryWorkStatusList(List<HistoryWorkStatus> historyWorkStatusList) {
        this.historyWorkStatusList = historyWorkStatusList;
    }

    @Override
    public String toString() {
        return "InternalModelWorker{" +
                "name='" + name + '\'' +
                ", historyWorkStatusList=" + historyWorkStatusList +
                '}';
    }
}
