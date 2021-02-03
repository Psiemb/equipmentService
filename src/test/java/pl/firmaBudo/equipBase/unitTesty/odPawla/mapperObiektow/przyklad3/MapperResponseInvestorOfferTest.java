package pl.firmaBudo.equipBase.unitTesty.odPawla.mapperObiektow.przyklad3;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MapperResponseInvestorOfferTest {

    private MapperResponseInvestorOffer mapperResponseInvestorOffer;

    @BeforeEach
    void setUp(){
        this.mapperResponseInvestorOffer = new MapperResponseInvestorOffer();
    }

    @Test
    public void CheckInternalInvestorOffer(){
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
    public void CheckResultWhenChooseActiv(){
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
    public void CheckIfResultWhenChooseKGGropu(){
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
    public void CheckInternalInvestorOfferNull(){
        //given
//        InternalInvestorOffer internalInvestorOffer = null;
        InternalInvestorOfferModel internalInvestorOfferModel = new InternalInvestorOfferModel();
        internalInvestorOfferModel.setInternalInvestorOffer(null);

        //when
        ResponseInvestorOffer result = mapperResponseInvestorOffer.map(internalInvestorOfferModel);

        //then
        assertNull(result);
    }

    @Test
    public void CheckInternalInvestorOfferModelNull(){
        //given
        InternalInvestorOfferModel internalInvestorOfferModel = null;

        //when
        ResponseInvestorOffer result = mapperResponseInvestorOffer.map(internalInvestorOfferModel);

        //then
        assertNull(result);
    }

}