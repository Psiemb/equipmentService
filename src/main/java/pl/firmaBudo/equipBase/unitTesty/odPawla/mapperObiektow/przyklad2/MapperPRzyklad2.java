package pl.firmaBudo.equipBase.unitTesty.odPawla.mapperObiektow.przyklad2;

public class MapperPRzyklad2 {


    public RaportDoInwestora map(ModelWewnRozliczen modelWewnRozliczen) {




        int fabricCosts = modelWewnRozliczen.getInternalCost().getFabricCosts();
        int payouts = modelWewnRozliczen.getInternalCost().getPayouts();

        int result = (fabricCosts + payouts) * modelWewnRozliczen.getNarzut();

        RaportDoInwestora raportDoInwestora = new RaportDoInwestora();
        raportDoInwestora.setTotalCost(result);

        return raportDoInwestora;
    }
}
