package pl.firmaBudo.equipBase.dao.entity.container;


import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "containerx")
public class ContainerEntity {

    private static long idCount;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    // historia wynajmu
    // historia naprawy
    // historia stastow
    private int workerCapacity;
    private ContainerType type;
    private double dailyCost;
    private boolean rented;

    //private tajemniczePOle
    //private tajemniczePOle

    public ContainerEntity(int workerCapacity, ContainerType type) {
        this.id = idCount++;
        this.workerCapacity = workerCapacity;
        this.type = type;
        this.dailyCost = (int) (Math.random() * 1000);
    }

    public ContainerEntity(int workerCapacity, ContainerType type, boolean rented) {
        this.id = idCount++;
        this.workerCapacity = workerCapacity;
        this.type = type;
        this.rented = rented;
        this.dailyCost = Math.random() * 100;
    }

    public ContainerEntity() {
    }

    public static long getIdCount() {
        return idCount;
    }

    public static void setIdCount(long idCount) {
        ContainerEntity.idCount = idCount;
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

    public double getDailyCost() {
        return dailyCost;
    }

    public ContainerEntity setDailyCost(double dailyCost) {
        this.dailyCost = dailyCost;
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
        ContainerEntity that = (ContainerEntity) o;
        return id == that.id && workerCapacity == that.workerCapacity && Double.compare(that.dailyCost, dailyCost) == 0 && rented == that.rented && type == that.type;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, workerCapacity, type, dailyCost, rented);
    }

    @Override
    public String toString() {
        return "ContainerEntity{" +
                "id=" + id +
                ", workerCapacity=" + workerCapacity +
                ", type=" + type +
                ", dailyCost=" + dailyCost +
                ", rented=" + rented +
                '}';
    }
}