package pl.firmaBudo.equipBase.unitTesty;

public class Matematyka {

    public int poleKwadratu(int a) {
        int pole;
        if (a >= 0) {
            pole = a * a;
        } else {
            pole = 0;
        }
        return pole;
    }

    public int obwodKwadratu(int a) {
        int obwod;
        if (a >= 0) {
            obwod = 4 * a;
        } else {
            obwod = 0;
        }
        return obwod;
    }

    public int poleTrapezuRownoramiennego(int a, int b, int h) {
        int pole;
        if (a >= 0 & b >= 0 & h >= 0){
            pole = (a + b) * h;
        } else {
            pole = 0;
        }
        return pole;

    }

    public int obwodTrapezuRownoramiennego(int a, int b, int h) {
        int obwod;
        if (a >= 0 & b >= 0 & h >= 0) {
            if (a > b)
                obwod = (((a - b)) * ((a - b)) + h * h);
            else
                obwod = (((b - a)) * ((b - a)) + h * h);
        }
        else
            obwod = 0;
        return obwod;
    }

    public int poleKola(int r) {
        int pole;
        if (r >= 0) {
            pole = 3 * r * r;
        } else {
            pole = 0;
        }
        return pole;

    }

    public int obwodKola(int r) {
        int obwod;
        if (r >= 0) {
            obwod = 2 * 3 * r;
        } else {
            obwod = 0;
        }
        return obwod;

    }

}
