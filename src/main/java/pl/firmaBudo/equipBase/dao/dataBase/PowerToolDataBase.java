package pl.firmaBudo.equipBase.dao.dataBase;

import org.springframework.stereotype.Component;
import pl.firmaBudo.equipBase.dao.entity.PowerTool;

import java.util.ArrayList;
import java.util.List;

@Component
public class PowerToolDataBase {

    private Iterable<PowerTool> powerToolss;
    private List<PowerTool> powerTools = new ArrayList<>();

    public List<PowerTool> getAll() {
        return this.powerTools;
    }

    public PowerTool getById(long id) {
        return powerTools.stream()
                .filter(powerTool -> powerTool.getId() == id)
                .findFirst()
                .orElse(null);
    }

    public PowerTool getByProductionYear(int productionYear) {
        return powerTools.stream()
                .filter(powerTool -> powerTool.getPriceOfBuying() == productionYear)
                .findFirst()
                .orElse(null);
    }

    public PowerTool getByType(String type) {
        return powerTools.stream()
                .filter(powerTool -> powerTool.getType().equals(type))
                .findFirst()
                .orElse(null);
    }

    public PowerTool addPowerTool(PowerTool powerTool) {
        this.powerTools.add(powerTool);
        return powerTool;
    }

    public void deletePowerTool(Long id) {
        powerTools.removeIf(powerTool -> powerTool.getId().equals(id));
    }


}
