package pl.firmaBudo.equipBase.unitTesty.odPawla.mapperObiektow;

import java.time.LocalDate;

public class HistoryWorkStatus {

    private LocalDate date;
    private StatusWork statusWork;

    public HistoryWorkStatus(LocalDate date, StatusWork statusWork) {
        this.date = date;
        this.statusWork = statusWork;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public StatusWork getStatusWork() {
        return statusWork;
    }

    public void setStatusWork(StatusWork statusWork) {
        this.statusWork = statusWork;
    }
}
