package pl.firmaBudo.equipBase.api.endpoint.availability.response;

import pl.firmaBudo.equipBase.dao.entity.ContainerType;

import java.util.Objects;

public class CheckContainerResponse {

    private long id;
    private int workerCapacity;
    private ContainerType type;
    private double dailyCost = 20;

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

    public double getDailyCost() {
        return dailyCost;
    }

    public void setDailyCost(double dailyCost) {
        this.dailyCost = dailyCost;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CheckContainerResponse)) return false;
        CheckContainerResponse that = (CheckContainerResponse) o;
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
