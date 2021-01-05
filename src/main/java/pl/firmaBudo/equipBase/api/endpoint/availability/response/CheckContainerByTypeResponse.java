package pl.firmaBudo.equipBase.api.endpoint.availability.response;

import pl.firmaBudo.equipBase.dao.entity.ContainerType;

import java.util.Objects;

public class CheckContainerByTypeResponse {

    private long id;
    private int workerCapacity;
    private ContainerType type;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getWorkerCapacity() {
        return workerCapacity;
    }

    public void setWorkerCapacity(int workerCapacity) {
        this.workerCapacity = workerCapacity;
    }

    public ContainerType getType() {
        return type;
    }

    public void setType(ContainerType type) {
        this.type = type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CheckContainerByTypeResponse)) return false;
        CheckContainerByTypeResponse that = (CheckContainerByTypeResponse) o;
        return id == that.id &&
                workerCapacity == that.workerCapacity &&
                type == that.type;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, workerCapacity, type);
    }

    @Override
    public String toString() {
        return "CheckContainerResponse{" +
                "id=" + id +
                ", workerCapacity=" + workerCapacity +
                ", type=" + type +
                '}';
    }
}