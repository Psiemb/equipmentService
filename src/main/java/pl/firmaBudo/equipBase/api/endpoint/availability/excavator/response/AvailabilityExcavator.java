package pl.firmaBudo.equipBase.api.endpoint.availability.excavator.response;

import pl.firmaBudo.equipBase.dao.entity.excavator.ExcavatorType;

public class AvailabilityExcavator {

    private ExcavatorType type;
    private long count;

    public AvailabilityExcavator(ExcavatorType type, long count) {
        this.type = type;
        this.count = count;
    }

    public ExcavatorType getType() {
        return type;
    }

    public AvailabilityExcavator setType(ExcavatorType type) {
        this.type = type;
        return this;
    }

    public long getCount() {
        return count;
    }

    public AvailabilityExcavator setCount(long count) {
        this.count = count;
        return this;
    }
}
