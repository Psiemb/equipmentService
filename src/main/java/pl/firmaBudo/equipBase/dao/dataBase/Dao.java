package pl.firmaBudo.equipBase.dao.dataBase;

import pl.firmaBudo.equipBase.dao.entity.container.ContainerEntity;

import java.util.List;

//dao = data access object
public interface Dao {

    ContainerEntity getByParamters(int workerCapacity, double dailyCost);

    ContainerEntity getById(long id);

    List<ContainerEntity> getAll();

    List<ContainerEntity> getByType(String type);

    List<ContainerEntity> getByMaxCost(double dailyMaxCost);
}
