package pl.firmaBudo.equipBase.dao.entity.excavator;

import java.util.Objects;

public class ExcavatorEntity {

    private static long idCount;
    private long id;
    private long bucketSize;
    private ExcavatorType type;
    private boolean rented;

    public ExcavatorEntity(long bucketSize, ExcavatorType type) {
        this.bucketSize = bucketSize;
        this.type = type;
    }

    public long getId() {
        return id;
    }

    public ExcavatorEntity setId(long id) {
        this.id = id;
        return this;
    }

    public long getBucketSize() {
        return bucketSize;
    }

    public ExcavatorEntity setBucketSize(long bucketSize) {
        this.bucketSize = bucketSize;
        return this;
    }

    public ExcavatorType getType() {
        return type;
    }

    public ExcavatorEntity setType(ExcavatorType type) {
        this.type = type;
        return this;
    }

    public boolean isRented() {
        return rented;
    }

    public ExcavatorEntity setRented(boolean rented) {
        this.rented = rented;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ExcavatorEntity)) return false;
        ExcavatorEntity that = (ExcavatorEntity) o;
        return id == that.id &&
                bucketSize == that.bucketSize &&
                rented == that.rented &&
                type == that.type;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, bucketSize, type, rented);
    }

    @Override
    public String toString() {
        return "ExcavatorEntity{" +
                "id=" + id +
                ", bucketSize=" + bucketSize +
                ", type=" + type +
                ", rented=" + rented +
                '}';
    }
}
