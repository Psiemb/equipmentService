package pl.firmaBudo.equipBase.dao.a;

import org.springframework.stereotype.Component;
import pl.firmaBudo.equipBase.dao.entity.Container;
import pl.firmaBudo.equipBase.dao.entity.ContainerType;

import java.util.ArrayList;
import java.util.List;

@Component
public class ContainerDataBase {


    private List<Container> containers = new ArrayList<>();

    public Container getById(long id) {
        return containers.stream()
                .filter(container -> container.getId() == id)
                .findFirst()
                .orElse(null);
    }

    public List<Container> getAllContainers() {
        return this.containers;
    }

    public Container getByType(ContainerType type) {
        return containers.stream()
                .filter(container -> container.getType() == type)
                .findFirst()
                .orElse(null);
    }

    public Container addContainer(Container container) {
        this.containers.add(container);
        return container;
    }

    public void deleteById(long id) {
        containers.removeIf(container -> container.getId() == id);
    }

}
