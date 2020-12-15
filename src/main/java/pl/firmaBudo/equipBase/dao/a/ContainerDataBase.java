package pl.firmaBudo.equipBase.dao.a;

import org.springframework.stereotype.Component;
import pl.firmaBudo.equipBase.dao.entity.Container;

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

    public void addContainer(Container container) {
        this.containers.add(container);
    }

    public Container deleteById(long id) {
        return containers.stream()
                .filter(container -> container.getId() == id)
                .reduce()
                //.findFirst()
                .orElse(null);
    }

}
