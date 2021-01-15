package pl.firmaBudo.equipBase.api.endpoint.calculation.request;

import java.util.Objects;

public class CalculationRequestParameters {


    private int workerCapacity;
    private double dailyCost;
    private int days;
    private long id;

    public int getWorkerCapacity() {
        return workerCapacity;
    }

    public void setWorkerCapacity(int workerCapacity) {
        this.workerCapacity = workerCapacity;
    }

    public double getDailyCost() {
        return dailyCost;
    }

    public void setDailyCost(double dailyCost) {
        this.dailyCost = dailyCost;
    }

    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        this.days = days;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CalculationRequestParameters)) return false;
        CalculationRequestParameters that = (CalculationRequestParameters) o;
        return workerCapacity == that.workerCapacity &&
                Double.compare(that.dailyCost, dailyCost) == 0 &&
                days == that.days &&
                id == that.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(workerCapacity, dailyCost, days, id);
    }

    @Override
    public String toString() {
        return "CalculationRequestParameters{" +
                "workerCapacity=" + workerCapacity +
                ", dailyCost=" + dailyCost +
                ", days=" + days +
                ", id=" + id +
                '}';
    }
}
