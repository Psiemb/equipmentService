package pl.firmaBudo.equipBase.api.endpoint.availability.response;

import java.util.List;
import java.util.Objects;

public class ExcavatorResponse {

    private List<AvailabilityExcavator> excavators;

    public ExcavatorResponse(List<AvailabilityExcavator> excavators) {
        this.excavators = excavators;
    }

    public List<AvailabilityExcavator> getExcavators() {
        return excavators;
    }

    public ExcavatorResponse setExcavators(List<AvailabilityExcavator> excavators) {
        this.excavators = excavators;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ExcavatorResponse)) return false;
        ExcavatorResponse that = (ExcavatorResponse) o;
        return Objects.equals(excavators, that.excavators);
    }

    @Override
    public int hashCode() {
        return Objects.hash(excavators);
    }

    @Override
    public String toString() {
        return "ExcavatorResponse{" +
                "excavators=" + excavators +
                '}';
    }
}
