package pl.firmaBudo.equipBase.dao.dataBase;

import org.springframework.stereotype.Component;
import pl.firmaBudo.equipBase.dao.entity.ExcavatorEntity;
import pl.firmaBudo.equipBase.dao.entity.ExcavatorType;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class ExcavatorDataBase {

    private final List<ExcavatorEntity> excavatorEntities = initilization();

    public List<ExcavatorEntity> getAll() {
        return excavatorEntities.stream()
                .filter(excavator -> !excavator.isRented())
                .collect(Collectors.toList());

    }

    public List<ExcavatorEntity> getByType(ExcavatorType type) {
        return excavatorEntities.stream()
                .filter(excavator -> excavator.getType().equals(type))
                .filter(excavator -> !excavator.isRented())
                .collect(Collectors.toList());

    }


    private List<ExcavatorEntity> initilization() {
        List<ExcavatorEntity> excavatorEntitie = new ArrayList<>();
        excavatorEntitie.add(new ExcavatorEntity(3, ExcavatorType.WHEELED));
        excavatorEntitie.add(new ExcavatorEntity(5, ExcavatorType.WHEELED));
        excavatorEntitie.add(new ExcavatorEntity(1, ExcavatorType.TRACKED));
        excavatorEntitie.add(new ExcavatorEntity(2, ExcavatorType.TRACKED));

        return excavatorEntitie;
    }

}
