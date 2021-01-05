package pl.firmaBudo.equipBase.api.endpoint.availability.response;

import java.util.List;
import java.util.Objects;

public class ExcavatorResponse {

    private String name;

    public ExcavatorResponse(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public ExcavatorResponse setName(String name) {
        this.name = name;
        return this;
    }
}
