package pl.firmaBudo.equipBase.unitTesty;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MatematykaTest {

    private Matematyka matematyka;

    @BeforeEach
    private void setUp() {
        this.matematyka = new Matematyka();
    }

    @Test
    public  void  checkSquareAreaPositivesOrZero(){
        //given
        Matematyka matematyka = new Matematyka();
        int a =2;

        //when
        int pole = matematyka.poleKwadratu(a);

        //then
        assertEquals(4,pole);

    }
    @Test
    public  void  checkSquareAreaNegatives(){
        //given
        Matematyka matematyka = new Matematyka();
        int a =-2;

        //when
        int pole = matematyka.poleKwadratu(a);

        //then
        assertEquals(0,pole);

    }
    @Test
    public  void  checkSquarePerimterPositivesOrZero(){
        //given
        Matematyka matematyka = new Matematyka();
        int a =2;

        //when
        int obwod = matematyka.obwodKwadratu(a);

        //then
        assertEquals(8,obwod);

    }
    @Test
    public  void  checkSquarePerimterNegatives(){
        //given
        Matematyka matematyka = new Matematyka();
        int a =-2;

        //when
        int obwod = matematyka.obwodKwadratu(a);

        //then
        assertEquals(0,obwod);

    }
    @Test
    public  void  checkTrapezeAreaPositivesOrZero(){
        //given
        Matematyka matematyka = new Matematyka();
        int a =2;
        int b =3;
        int c =4;

        //when
        int pole = matematyka.poleTrapezuRownoramiennego(a,b,c);

        //then
        assertEquals(20,pole);

    }
    @Test
    public  void  checkTrapezePerimterNegatives(){
        //given
        Matematyka matematyka = new Matematyka();
        int a =-2;
        int b =3;
        int c =4;

        //when
        int pole = matematyka.poleTrapezuRownoramiennego(a,b,c);

        //then
        assertEquals(0,pole);

    }
    @Test
    public  void  checkTrapezeParimeterPositivesOrZero() {

        //given
        Matematyka matematyka = new Matematyka();
        int a = 2;
        int b = 3;
        int c = 4;

        //when
        int obwod = matematyka.obwodTrapezuRownoramiennego(a, b, c);

        //then
        assertEquals(17, obwod);
    }
    @Test
    public  void  checkTrapezeParimeterNegatives() {

        //given
        Matematyka matematyka = new Matematyka();
        int a = -2;
        int b = 3;
        int c = 4;

        //when
        int obwod = matematyka.obwodTrapezuRownoramiennego(a, b, c);

        //then
        assertEquals(0, obwod);
    }


    @Test
    public  void  checkCircleAreaPositivesOrZero(){
        //given
        Matematyka matematyka = new Matematyka();
        int a =2;

        //when
        int pole = matematyka.poleKola(a);

        //then
        assertEquals(12,pole);

    }
    @Test
    public  void  checkCirclePerimterNegatives(){
        //given
        Matematyka matematyka = new Matematyka();
        int a =-2;

        //when
        int obwod = matematyka.poleKola(a);

        //then
        assertEquals(0,obwod);

    }
    @Test
    public  void  checkCircleParimeterPositivesOrZero() {

        //given
        Matematyka matematyka = new Matematyka();
        int a = 2;

        //when
        int obwod = matematyka.obwodKola(a);

        //then
        assertEquals(12, obwod);
    }
    @Test
    public  void  checkCircleParimeterNegatives() {

        //given
        Matematyka matematyka = new Matematyka();
        int a = -2;

        //when
        int obwod = matematyka.obwodKola(a);

        //then
        assertEquals(0, obwod);
    }


}