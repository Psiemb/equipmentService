package pl.firmaBudo.equipBase.api.endpoint.availability.excavator.request;

import com.fasterxml.jackson.annotation.JsonCreator;
import pl.firmaBudo.equipBase.api.endpoint.availability.container.request.CheckContainerType;

public enum CheckExcavatorType {

    TYPE;

    @JsonCreator
    public static CheckContainerType fromValue(String text) {
        for (CheckContainerType searchParcelType : CheckContainerType.values()) {
            if (searchParcelType.name().equals(text)) {
                return searchParcelType;
            }
        }
        return null;
    }
}
