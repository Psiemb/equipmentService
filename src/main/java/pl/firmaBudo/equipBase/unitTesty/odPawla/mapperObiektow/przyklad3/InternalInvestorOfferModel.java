package pl.firmaBudo.equipBase.unitTesty.odPawla.mapperObiektow.przyklad3;

import pl.firmaBudo.equipBase.unitTesty.odPawla.mapperObiektow.przyklad2.InternalCost;

public class InternalInvestorOfferModel {

    private InternalInvestorOffer internalInvestorOffer;
    private Investors investors;
    private int markup;

    public InternalInvestorOffer getInternalInvestorOffer() {
        return internalInvestorOffer;
    }

    public void setInternalInvestorOffer(InternalInvestorOffer internalInvestorOffer) {
        this.internalInvestorOffer = internalInvestorOffer;
    }

    public int getMarkup() {
        return markup;
    }

    public void setMarkup(int markup) {
        this.markup = markup;
    }

    public Investors getInvestors() {
        return investors;
    }

    public void setInvestors(Investors investors) {
        this.investors = investors;
    }
}
