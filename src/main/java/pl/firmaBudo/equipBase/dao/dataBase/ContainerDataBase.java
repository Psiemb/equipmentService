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
public class ContainerDataBase implements Dao {

    @Autowired
    private ContainerRepository2 containerRepository2;

    @Override
    public ContainerEntity getByParamters(int workerCapacity, double dailyCost) {
        return null;
    }

    @Override
    public ContainerEntity getById(long id) {
        return containerRepository2.findById(id)
                .orElse(null);
    }

    public ContainerEntity getByID(long id) {
        return containerRepository2.findById(id)
                .orElse(null);
    }

    @Override
    public List<ContainerEntity> getAll() {
        return containerRepository2.findAll();
    }

    @Override
    public List<ContainerEntity> getByType(String type) {
        return null;
    }

    @Override
    public List<ContainerEntity> getByMaxCost(double dailyMaxCost) {
        return null;
    }
}
