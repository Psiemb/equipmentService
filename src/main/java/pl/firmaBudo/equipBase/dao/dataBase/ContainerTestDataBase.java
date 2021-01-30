package pl.firmaBudo.equipBase.dao.dataBase;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import pl.firmaBudo.equipBase.dao.entity.container.ContainerEntity;
import pl.firmaBudo.equipBase.dao.entity.container.ContainerType;
import pl.firmaBudo.equipBase.prawieDocelowaBazaDanych.ContainerRepository2;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component

public class ContainerTestDataBase implements Dao {

//    @Autowired
//    private ContainerRepositoryTest containerRepositoryTest;

    private List<ContainerEntity> containerEntities = initialization();

    public ContainerEntity getByParamters(int workerCapacity, double dailyCost) {
        return containerEntities.stream()
                .filter(container -> container.getWorkerCapacity() < workerCapacity)
                .filter(container -> container.getDailyCost() < dailyCost)
                .findFirst()
                .orElse(null);
    }

    public ContainerEntity getById(long id) {
        return containerEntities.stream()
                .filter(container -> container.getId() == id)
                .findFirst()
                .orElse(null);
    }

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

    public List<ContainerEntity> getByMaxCost(double dailyMaxCost) {
        return containerEntities.stream()
                .filter(container -> container.getDailyCost() < dailyMaxCost)
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
