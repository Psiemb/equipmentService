package pl.firmaBudo.equipBase.dao.entity;


import java.util.Objects;

public class Container {

    private static long idCount;
    private long id;
    private int workerCapacity;
    private ContainerType type;
    private boolean rented;

    public Container(int workerCapacity, ContainerType type) {
        this.id = idCount++;
        this.workerCapacity = workerCapacity;
        this.type = type;
    }

    public long getId() {
        return id;
    }

    public Container setId(long id) {
        this.id = id;
        return this;
    }

    public int getWorkerCapacity() {
        return workerCapacity;
    }

    public Container setWorkerCapacity(int workerCapacity) {
        this.workerCapacity = workerCapacity;
        return this;
    }

    public ContainerType getType() {
        return type;
    }

    public Container setType(ContainerType type) {
        this.type = type;
        return this;
    }

    public boolean isRented() {
        return rented;
    }

    public Container setRented(boolean rented) {
        this.rented = rented;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Container container = (Container) o;
        return id == container.id && workerCapacity == container.workerCapacity && rented == container.rented && type == container.type;
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