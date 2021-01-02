package pl.firmaBudo.equipBase.api.endpoint.availability.response;

import pl.firmaBudo.equipBase.dao.entity.ContainerType;

public class AvailabilityContainer {

    private ContainerType type;
    private long count;

    public AvailabilityContainer(ContainerType type, long count) {
        this.type = type;
        this.count = count;
    }

    public ContainerType getType() {
        return type;
    }

    public AvailabilityContainer setType(ContainerType type) {
        this.type = type;
        return this;
    }

    public long getCount() {
        return count;
    }

    public AvailabilityContainer setCount(long count) {
        this.count = count;
        return this;
    }
}
