package pl.firmaBudo.equipBase.dao.entity;


import java.util.Objects;

public class ContainerEntity {

    private static long idCount;
    private long id;
    private int workerCapacity;
    private ContainerType type;
    private boolean rented;

    //private tajemniczePOle
    //private tajemniczePOle
    //private tajemniczePOle
    //private tajemniczePOle
    //private tajemniczePOle
    //private tajemniczePOle
    //private tajemniczePOle
    //private tajemniczePOle
    //private tajemniczePOle

    public ContainerEntity(int workerCapacity, ContainerType type) {
        this.id = idCount++;
        this.workerCapacity = workerCapacity;
        this.type = type;
    }

    public ContainerEntity(int workerCapacity, ContainerType type, boolean rented) {
        this.id = idCount++;
        this.workerCapacity = workerCapacity;
        this.type = type;
        this.rented = rented;
    }

    public long getId() {
        return id;
    }

    public ContainerEntity setId(long id) {
        this.id = id;
        return this;
    }

    public int getWorkerCapacity() {
        return workerCapacity;
    }

    public ContainerEntity setWorkerCapacity(int workerCapacity) {
        this.workerCapacity = workerCapacity;
        return this;
    }

    public ContainerType getType() {
        return type;
    }

    public ContainerEntity setType(ContainerType type) {
        this.type = type;
        return this;
    }

    public boolean isRented() {
        return rented;
    }

    public ContainerEntity setRented(boolean rented) {
        this.rented = rented;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ContainerEntity containerEntity = (ContainerEntity) o;
        return id == containerEntity.id && workerCapacity == containerEntity.workerCapacity && rented == containerEntity.rented && type == containerEntity.type;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, workerCapacity, type, rented);
    }

    @Override
    public String toString() {
        return "Container{" +
                "id=" + id +
                ", workerCapacity=" + workerCapacity +
                ", type=" + type +
                ", rented=" + rented +
                '}';
    }
}