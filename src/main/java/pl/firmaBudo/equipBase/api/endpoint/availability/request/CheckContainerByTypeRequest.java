package pl.firmaBudo.equipBase.api.endpoint.availability.request;

import pl.firmaBudo.equipBase.dao.entity.ContainerType;

import java.util.Objects;

public class CheckContainerByTypeRequest {

    private ContainerType type;

    public ContainerType getType() {
        return type;
    }

    public void setType(ContainerType type) {
        this.type = type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CheckContainerByTypeRequest)) return false;
        CheckContainerByTypeRequest that = (CheckContainerByTypeRequest) o;
        return type == that.type;
    }

    @Override
    public int hashCode() {
        return Objects.hash(type);
    }

    @Override
    public String toString() {
        return "CheckContainerByTypeRequest{" +
                "type=" + type +
                '}';
    }
}
