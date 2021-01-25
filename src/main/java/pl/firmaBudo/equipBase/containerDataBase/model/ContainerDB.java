package pl.firmaBudo.equipBase.containerDataBase.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "containers")
public class ContainerDB {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private int workerCapacity;

    private  double dailyCost;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getWorkerCapacity() {
        return workerCapacity;
    }

    public void setWorkerCapacity(int workerCapacity) {
        this.workerCapacity = workerCapacity;
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
        if (!(o instanceof ContainerDB)) return false;
        ContainerDB containerDB = (ContainerDB) o;
        return workerCapacity == containerDB.workerCapacity &&
                Double.compare(containerDB.dailyCost, dailyCost) == 0 &&
                id.equals(containerDB.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, workerCapacity, dailyCost);
    }

    @Override
    public String toString() {
        return "Container{" +
                "id=" + id +
                ", workerCapacity=" + workerCapacity +
                ", dailyCost=" + dailyCost +
                '}';
    }
}
