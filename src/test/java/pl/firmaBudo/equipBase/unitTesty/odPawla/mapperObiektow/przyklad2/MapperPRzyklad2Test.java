package pl.firmaBudo.equipBase.unitTesty.odPawla.mapperObiektow.przyklad2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import pl.firmaBudo.equipBase.unitTesty.odPawla.mapperObiektow.przyklad1.*;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MapperPRzyklad2Test {

    private MapperPRzyklad2 mapperPRzyklad2;

    @BeforeEach
    void setUp(){
        this.mapperPRzyklad2 = new MapperPRzyklad2();
    }

    @Test
    public void test() {
        //given
        InternalCost internalCost = new InternalCost();

        ModelWewnRozliczen modelWewnRozliczen = new ModelWewnRozliczen();
        modelWewnRozliczen.setInternalCost(internalCost);

        //when
        RaportDoInwestora result = mapperPRzyklad2.map(modelWewnRozliczen);

        //then
        assertEquals(0, result.getTotalCost());

    }

    @Test
    public void testNull() {
        //given
        ModelWewnRozliczen modelWewnRozliczen = new ModelWewnRozliczen();
        modelWewnRozliczen.setInternalCost(null);

        //when
        RaportDoInwestora result = mapperPRzyklad2.map(modelWewnRozliczen);

        //then
        assertNull(result);
    }

    @Test
    public void testNull2() {
        //given
        ModelWewnRozliczen modelWewnRozliczen = null;

        //when
        RaportDoInwestora result = mapperPRzyklad2.map(modelWewnRozliczen);

        //then
        assertNull(result);
    }

}