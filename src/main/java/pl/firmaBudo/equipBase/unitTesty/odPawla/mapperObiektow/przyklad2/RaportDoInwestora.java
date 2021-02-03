package pl.firmaBudo.equipBase.unitTesty.odPawla.mapperObiektow.przyklad2;

import java.time.LocalDate;

public class RaportDoInwestora {

    private int totalCost;
    private LocalDate dataRozpoczecia;
    private LocalDate dataZakończenia;

    public LocalDate getDataRozpoczecia() {
        return dataRozpoczecia;
    }

    public void setDataRozpoczecia(LocalDate dataRozpoczecia) {
        this.dataRozpoczecia = dataRozpoczecia;
    }

    public LocalDate getDataZakończenia() {
        return dataZakończenia;
    }

    public void setDataZakończenia(LocalDate dataZakończenia) {
        this.dataZakończenia = dataZakończenia;
    }

    public int getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(int totalCost) {
        this.totalCost = totalCost;
    }
}
