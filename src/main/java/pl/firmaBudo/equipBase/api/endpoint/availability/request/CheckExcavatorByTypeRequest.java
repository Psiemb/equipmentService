package pl.firmaBudo.equipBase.api.endpoint.availability.request;

import java.util.Objects;

public class CheckExcavatorByTypeRequest {

    private RequestExcavatorType type;

    public RequestExcavatorType getType() {
        return type;
    }

    public void setType(RequestExcavatorType type) {
        this.type = type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CheckExcavatorByTypeRequest)) return false;
        CheckExcavatorByTypeRequest that = (CheckExcavatorByTypeRequest) o;
        return type == that.type;
    }

    @Override
    public int hashCode() {
        return Objects.hash(type);
    }

    @Override
    public String toString() {
        return "CheckExcavatorByTypeRequest{" +
                "type=" + type +
                '}';
    }
}
