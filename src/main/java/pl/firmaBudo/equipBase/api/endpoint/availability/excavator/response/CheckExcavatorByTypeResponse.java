package pl.firmaBudo.equipBase.api.endpoint.availability.excavator.response;

import pl.firmaBudo.equipBase.dao.entity.excavator.ExcavatorType;

import java.util.Objects;

public class CheckExcavatorByTypeResponse {

    private long id;
    private long bucket;
    private ExcavatorType type;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getBucket() {
        return bucket;
    }

    public void setBucket(long bucket) {
        this.bucket = bucket;
    }

    public ExcavatorType getType() {
        return type;
    }

    public void setType(ExcavatorType type) {
        this.type = type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CheckExcavatorByTypeResponse)) return false;
        CheckExcavatorByTypeResponse that = (CheckExcavatorByTypeResponse) o;
        return id == that.id &&
                bucket == that.bucket &&
                type == that.type;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, bucket, type);
    }

    @Override
    public String toString() {
        return "CheckExcavatorByTYpeResponse{" +
                "id=" + id +
                ", bucket=" + bucket +
                ", type=" + type +
                '}';
    }
}
