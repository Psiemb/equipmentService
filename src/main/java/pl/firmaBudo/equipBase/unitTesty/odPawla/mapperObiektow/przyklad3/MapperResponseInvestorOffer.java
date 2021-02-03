package pl.firmaBudo.equipBase.unitTesty.odPawla.mapperObiektow.przyklad3;

import java.util.Objects;

public class MapperResponseInvestorOffer {

    public ResponseInvestorOffer map(InternalInvestorOfferModel internalInvestorOfferModel) {
        if (Objects.isNull(internalInvestorOfferModel) || Objects.isNull(internalInvestorOfferModel.getInternalInvestorOffer())) {
            return null;
        }
        int directCosts = internalInvestorOfferModel.getInternalInvestorOffer().getDirectCosts();
        int supervisionCosts = internalInvestorOfferModel.getInternalInvestorOffer().getSupervisionCosts();

        if (internalInvestorOfferModel.getInvestors() == Investors.ACTIV) {
            int result = (directCosts + supervisionCosts) * internalInvestorOfferModel.getMarkup()-100;
        }
        if (internalInvestorOfferModel.getInvestors() == Investors.KG_GROUP) {
            int result = (directCosts + supervisionCosts) * internalInvestorOfferModel.getMarkup()-80;
        }

        int result = (directCosts + supervisionCosts) * internalInvestorOfferModel.getMarkup();

        ResponseInvestorOffer responseInvestorOffer = new ResponseInvestorOffer();
        responseInvestorOffer.setOffer(result);

        return responseInvestorOffer;
    }


}
