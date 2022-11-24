package ch.fhnw.oop1.ub;

import java.awt.Color;

public class SmartCabrio extends Auto{
    public SmartCabrio(Color farbe, Motorisierung motor, boolean feature, Linie linie) {
        super(farbe, motor, feature, linie);
    }

    @Override
    public int getPreis(Linie linie, Motorisierung motorisierung){
        return super.getPreis(getLinie(),getMotor()) + 3100;
    }
}
