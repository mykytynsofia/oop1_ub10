package ch.fhnw.oop1.ub.test;

import ch.fhnw.oop1.ub.Auto;
import ch.fhnw.oop1.ub.Linie;
import ch.fhnw.oop1.ub.Motorisierung;
import ch.fhnw.oop1.ub.SmartCabrio;
import ch.fhnw.oop1.ub.SmartCity;
import org.junit.Test;
import static org.junit.Assert.*;

import java.awt.Color;

public class TestAuto {

    @Test
     public void testAuto(){
        Auto autoCabrio = new SmartCabrio(Color.BLACK, Motorisierung.BENZIN, true, Linie.PURE);
        Auto autoCity = new SmartCity(Color.BLACK, Motorisierung.BENZIN, true, Linie.PURE);
        assertFalse(autoCity.equals(autoCabrio));
    }

    @Test
    public void testPreis(){
        Auto autoCabrio = new SmartCabrio(Color.BLACK, Motorisierung.BENZIN, true, Linie.PURE);
        int preis = 14850;
        assertEquals(preis,autoCabrio.getPreis(autoCabrio.getLinie(),autoCabrio.getMotor()));
    }

    @Test
    public void testPreisWithDiesel(){
        Auto autoCabrio = new SmartCabrio(Color.BLACK, Motorisierung.DIESEL, true, Linie.PURE);
        int preis = 16050;
        assertEquals(preis,autoCabrio.getPreis(autoCabrio.getLinie(),autoCabrio.getMotor()));
    }
}
