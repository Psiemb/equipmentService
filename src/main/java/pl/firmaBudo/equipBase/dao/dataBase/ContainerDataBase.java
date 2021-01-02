package pl.firmaBudo.equipBase.dao.dataBase;

import org.springframework.stereotype.Component;
import pl.firmaBudo.equipBase.dao.entity.Container;
import pl.firmaBudo.equipBase.dao.entity.ContainerType;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class ContainerDataBase {

    private List<Container> containers = initialization();

    public List<Container> getAll() {
        return containers.stream()
                .filter(container -> !container.isRented())
                .collect(Collectors.toList());
    }

    public List<Container> getByType(String type) {
        return containers.stream()
                .filter(container -> container.getType().name().equals(type))
                .filter(container -> !container.isRented())
                .collect(Collectors.toList());
    }

    private List<Container> initialization() {
        List<Container> result = new ArrayList<>();
        result.add(new Container(15, ContainerType.EMPLOYEE));
        result.add(new Container(10, ContainerType.EMPLOYEE));
        result.add(new Container(18, ContainerType.EMPLOYEE));
        result.add(new Container(5, ContainerType.SANITARY));
        result.add(new Container(5, ContainerType.SANITARY));
        result.add(new Container(18, ContainerType.STORAGE));
        result.add(new Container(18, ContainerType.STORAGE));
        result.add(new Container(18, ContainerType.STORAGE));
        result.add(new Container(5, ContainerType.OFFICE));
        result.add(new Container(8, ContainerType.OFFICE));

        return result;
    }
}
