package pl.firmaBudo.equipBase.unitTesty.odPawla.mapperObiektow.przyklad4;

public class WorkerProfession {
    private Profession profession;
    private int avargeNumberOfWorkedDays;

    public WorkerProfession(Profession profession, int avargeNumberOfWorkedDays) {
        this.profession = profession;
        this.avargeNumberOfWorkedDays = avargeNumberOfWorkedDays;
    }

    public Profession getProfession() {
        return profession;
    }

    public void setProfession(Profession profession) {
        this.profession = profession;
    }

    public int getAvargeNumberOfWorkedDays() {
        return avargeNumberOfWorkedDays;
    }

    public void setAvargeNumberOfWorkedDays(int avargeNumberOfWorkedDays) {
        this.avargeNumberOfWorkedDays = avargeNumberOfWorkedDays;
    }

    @Override
    public String toString() {
        return "WorkerProfession{" +
                "profession=" + profession +
                ", avargeNumberOfWorkedDays=" + avargeNumberOfWorkedDays +
                '}';
    }
}
