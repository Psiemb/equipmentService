package pl.firmaBudo.equipBase.api.endpoint.calculation.request;

import pl.firmaBudo.equipBase.dao.entity.container.ContainerType;

import java.util.Objects;

public class CalculationRequest {


    private int days;
    private long id;

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
        if (!(o instanceof CalculationRequest)) return false;
        CalculationRequest that = (CalculationRequest) o;
        return days == that.days &&
                id == that.id;
    }

    @Override
    public String toString() {
        return "CalculationRequest{" +
                "days=" + days +
                ", id=" + id +
                '}';
    }

    @Override
    public int hashCode() {

        return Objects.hash(days, id);
    }
}
