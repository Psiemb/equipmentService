package pl.firmaBudo.equipBase.api.endpoint.calculation2.request2;

import java.util.Objects;

public class CalculationRequest2 {

    private long id;
    private int days;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        this.days = days;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CalculationRequest2)) return false;
        CalculationRequest2 that = (CalculationRequest2) o;
        return id == that.id &&
                days == that.days;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, days);
    }

    @Override
    public String toString() {
        return "CalculationRequest2{" +
                "id=" + id +
                ", days=" + days +
                '}';
    }
}
