package pl.firmaBudo.equipBase.dao.dataBase;

import org.springframework.stereotype.Component;
import pl.firmaBudo.equipBase.dao.entity.PowerTool;

import java.util.ArrayList;
import java.util.List;

@Component
public class PowerToolDataBase {

    private List<PowerTool> powerTools = new ArrayList<>();

    public PowerTool getById(Long id) {
        return powerTools.stream()
                .filter(powerTool -> powerTool.getId() == id)
                .findFirst()
                .orElse(null);
    }

    public List<PowerTool> getAll() {
        return this.powerTools;
    }

    public PowerTool getByType(String type) {
        return powerTools.stream()
                .filter(powerTool -> powerTool.getType() == type)
                .findFirst()
                .orElse(null);
    }

    public PowerTool getByProductionYear(int productionYear) {
        return powerTools.stream()
                .filter(powerTool -> powerTool.getPriceOfBuying() == productionYear)
                .findFirst()
                .orElse(null);
    }

    public PowerTool addPowerTool(PowerTool powerTool) {
        this.powerTools.add(powerTool);
        return powerTool;
    }

    public void deletePowerTool(Long id) {
        powerTools.removeIf(powerTool -> powerTool.getId() == id);
    }


}
