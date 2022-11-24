package ch.fhnw.oop1.ub;

import java.awt.Color;
import java.util.Random;

public class Auto {
    private Color farbe;
    private int seriennumer;
    private int preis;
    private Motorisierung motor;
    private boolean feature;
    private Linie linie;

    Random random = new Random();

    public Auto(Color farbe, Motorisierung motor, boolean feature, Linie linie) {
        this.farbe = farbe;
        this.motor = motor;
        this.feature = feature;
        this.linie = linie;
        this.seriennumer = getSeriennumer();
        this.preis = getPreis(linie,motor);

    }

    public Linie getLinie() {
        return linie;
    }

    public Color getFarbe() {
        return farbe;
    }

    public int getSeriennumer() {
        return random.nextInt(99);
    }

    public int getPreis(Linie linie, Motorisierung motorisierung) {
        return linie.getPrice() + motorisierung.getPrice();
    }

    public Motorisierung getMotor() {
        return motor;
    }

    public boolean hasFeature() {
        return feature;
    }

    public boolean equals(Auto auto) {

         return this.farbe == auto.getFarbe() &&
             this.feature == auto.hasFeature() &&
             this.motor == auto.getMotor() &&
             this.linie == auto.getLinie() &&
             this.getClass() == auto.getClass();
    }

    @Override
    public String toString() {
        return "Auto{" +
            "seriennumer=" + seriennumer +
            ", preis=" + preis +
            ", linie=" + linie +
            ", farbe=" + farbe +
            '}';
    }
}
