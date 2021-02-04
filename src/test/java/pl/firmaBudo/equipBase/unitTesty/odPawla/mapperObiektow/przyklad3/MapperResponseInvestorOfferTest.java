package pl.firmaBudo.equipBase.unitTesty.odPawla.mapperObiektow.przyklad3;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class MapperResponseInvestorOfferTest {

    private MapperResponseInvestorOffer mapperResponseInvestorOffer;

    @BeforeEach
    void setUp() {
        this.mapperResponseInvestorOffer = new MapperResponseInvestorOffer();
    }

    @Test
    public void CheckInternalInvestorOffer() {
        //given
        InternalInvestorOffer internalInvestorOffer = new InternalInvestorOffer();
        InternalInvestorOfferModel internalInvestorOfferModel = new InternalInvestorOfferModel();
        internalInvestorOfferModel.setInternalInvestorOffer(internalInvestorOffer);

        //when
        ResponseInvestorOffer result = mapperResponseInvestorOffer.map(internalInvestorOfferModel);

        //then
        assertEquals(0, result.getOffer());
    }

    @Test
    public void CheckResultWhenChooseActiv() {
        //given
        InternalInvestorOffer internalInvestorOffer = new InternalInvestorOffer();
        internalInvestorOffer.setDirectCosts(1000);
        internalInvestorOffer.setSupervisionCosts(500);

        InternalInvestorOfferModel internalInvestorOfferModel = new InternalInvestorOfferModel();
        internalInvestorOfferModel.setMarkup(2);
        internalInvestorOfferModel.setInvestors(Investors.ACTIV);
        internalInvestorOfferModel.setInternalInvestorOffer(internalInvestorOffer);

        //when
        ResponseInvestorOffer result = mapperResponseInvestorOffer.map(internalInvestorOfferModel);

        //then
        assertEquals(2900, result.getOffer());

    }

    @Test
    public void CheckIfResultWhenChooseKGGropu() {
        //given
        InternalInvestorOffer internalInvestorOffer = new InternalInvestorOffer();
        internalInvestorOffer.setDirectCosts(2000);
        internalInvestorOffer.setSupervisionCosts(400);

        InternalInvestorOfferModel internalInvestorOfferModel = new InternalInvestorOfferModel();
        internalInvestorOfferModel.setMarkup(2);
        internalInvestorOfferModel.setInvestors(Investors.KG_GROUP);
        internalInvestorOfferModel.setInternalInvestorOffer(internalInvestorOffer);

        //when
        ResponseInvestorOffer result = mapperResponseInvestorOffer.map(internalInvestorOfferModel);

        //then
        assertEquals(4720, result.getOffer());
    }

    @Test
    public void CheckIfResultIsNotMINUSwhenValuesAreMinus() {
        //given
        InternalInvestorOffer internalInvestorOffer = new InternalInvestorOffer();
        internalInvestorOffer.setDirectCosts(2000);
        internalInvestorOffer.setSupervisionCosts(400);

        InternalInvestorOfferModel internalInvestorOfferModel = new InternalInvestorOfferModel();
        internalInvestorOfferModel.setMarkup(-2);
        internalInvestorOfferModel.setInternalInvestorOffer(internalInvestorOffer);

        //when
        ResponseInvestorOffer result = mapperResponseInvestorOffer.map(internalInvestorOfferModel);

        //then
        assertNull(result);
    }

    @Test
    public void CheckInternalInvestorOfferNull() {
        //given
        InternalInvestorOfferModel internalInvestorOfferModel = new InternalInvestorOfferModel();
        internalInvestorOfferModel.setInternalInvestorOffer(null);

        //when
        ResponseInvestorOffer result = mapperResponseInvestorOffer.map(internalInvestorOfferModel);

        //then
        assertNull(result);
    }

    @Test
    public void CheckInternalInvestorOfferModelNull() {
        //given
        InternalInvestorOfferModel internalInvestorOfferModel = null;

        //when
        ResponseInvestorOffer result = mapperResponseInvestorOffer.map(internalInvestorOfferModel);

        //then
        assertNull(result);
    }

}