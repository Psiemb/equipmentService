package pl.firmaBudo.equipBase.api.endpoint.availability.request;

import com.fasterxml.jackson.annotation.JsonCreator;

public enum CheckContainerType {

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
