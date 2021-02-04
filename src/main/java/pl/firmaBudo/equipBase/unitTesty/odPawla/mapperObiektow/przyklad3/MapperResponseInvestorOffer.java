package pl.firmaBudo.equipBase.unitTesty.odPawla.mapperObiektow.przyklad3;

import java.util.Objects;

public class MapperResponseInvestorOffer {

    public ResponseInvestorOffer map(InternalInvestorOfferModel internalInvestorOfferModel) {
        if (Objects.isNull(internalInvestorOfferModel) || Objects.isNull(internalInvestorOfferModel.getInternalInvestorOffer())) {
            return null;
        }
        if (internalInvestorOfferModel.getInternalInvestorOffer().getDirectCosts() <= 0 || internalInvestorOfferModel.getInternalInvestorOffer().getSupervisionCosts() <= 0 ||
        internalInvestorOfferModel.getMarkup() <= 0){
            System.out.println("Podana wartości nie mogą być mniejsze od zera.");
            return null;
        }
        int offer = 0;
        int directCosts = internalInvestorOfferModel.getInternalInvestorOffer().getDirectCosts();
        int supervisionCosts = internalInvestorOfferModel.getInternalInvestorOffer().getSupervisionCosts();

        if (internalInvestorOfferModel.getInvestors() == Investors.ACTIV) {
            offer = (directCosts + supervisionCosts) * internalInvestorOfferModel.getMarkup()-100;
        }
        else if (internalInvestorOfferModel.getInvestors() == Investors.KG_GROUP) {
            offer = (directCosts + supervisionCosts) * internalInvestorOfferModel.getMarkup()-80;
        }
//        else if (internalInvestorOfferModel.getInternalInvestorOffer().getDirectCosts() <= 0 || internalInvestorOfferModel.getInternalInvestorOffer().getSupervisionCosts() <= 0 ||
//                internalInvestorOfferModel.getMarkup() <= 0){
//            System.out.println("Podana wartości nie mogą być mniejsze od zera.");
//            offer = 0;
//        }
        else {
            offer = (directCosts + supervisionCosts) * internalInvestorOfferModel.getMarkup();
        }

        ResponseInvestorOffer responseInvestorOffer = new ResponseInvestorOffer();
        responseInvestorOffer.setOffer(offer);

        return responseInvestorOffer;
    }


}
