package pl.firmaBudo.equipBase.api.endpoint.availability.container.response;

import java.util.List;
import java.util.Objects;

public class ContainerResponse {

    private List<AvailabilityContainer> containers;

    public ContainerResponse(List<AvailabilityContainer> availabilityContainerList) {
        this.containers = availabilityContainerList;
    }

    public List<AvailabilityContainer> getContainers() {
        return containers;
    }

    public ContainerResponse setContainers(List<AvailabilityContainer> containers) {
        this.containers = containers;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ContainerResponse that = (ContainerResponse) o;
        return Objects.equals(containers, that.containers);
    }

    @Override
    public int hashCode() {
        return Objects.hash(containers);
    }

    @Override
    public String toString() {
        return "ContainerResponse{" +
                "containers=" + containers +
                '}';
    }
}
