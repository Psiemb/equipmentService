package pl.firmaBudo.equipBase.dao.dataBase;

import org.springframework.stereotype.Component;
import pl.firmaBudo.equipBase.dao.entity.ContainerEntity;
import pl.firmaBudo.equipBase.dao.entity.ContainerType;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class ContainerDataBase {

    private List<ContainerEntity> containerEntities = initialization();

    public List<ContainerEntity> getAll() {
        return containerEntities.stream()
                .filter(container -> !container.isRented())
                .collect(Collectors.toList());
    }

    public List<ContainerEntity> getByType(String type) {
        return containerEntities.stream()
                .filter(container -> container.getType().name().equals(type))
                .filter(container -> !container.isRented())
                .collect(Collectors.toList());
    }

    private List<ContainerEntity> initialization() {
        List<ContainerEntity> result = new ArrayList<>();
        result.add(new ContainerEntity(15, ContainerType.EMPLOYEE));
        result.add(new ContainerEntity(15, ContainerType.EMPLOYEE, true));
        result.add(new ContainerEntity(10, ContainerType.EMPLOYEE));
        result.add(new ContainerEntity(18, ContainerType.EMPLOYEE));
        result.add(new ContainerEntity(5, ContainerType.SANITARY));
        result.add(new ContainerEntity(5, ContainerType.SANITARY));
        result.add(new ContainerEntity(18, ContainerType.STORAGE));
        result.add(new ContainerEntity(18, ContainerType.STORAGE));
        result.add(new ContainerEntity(18, ContainerType.STORAGE));
        result.add(new ContainerEntity(5, ContainerType.OFFICE));
        result.add(new ContainerEntity(8, ContainerType.OFFICE));

        return result;
    }
}
