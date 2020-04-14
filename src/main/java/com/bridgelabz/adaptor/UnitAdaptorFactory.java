package com.bridgelabz.adaptor;

import com.bridgelabz.adaptor.lengths.*;
import com.bridgelabz.adaptor.temperature.CelsiusImpl;
import com.bridgelabz.adaptor.temperature.FahrenheitImpl;
import com.bridgelabz.adaptor.volume.*;
import com.bridgelabz.adaptor.weights.*;
import com.bridgelabz.utility.Quantity;

public class UnitAdaptorFactory {
    public static IUnitAdaptor getObject(Quantity.Unit unit) {
        switch (unit) {
            case FEET:
                return new FeetImpl();
            case INCH:
                return new InchImpl();
            case YARD:
                return new YardImpl();
            case LITRE:
                return new LitreImpl();
            case GALLON:
                return new GallonImpl();
            case CENTIMETRE:
                return new CentimetreImpl();
            case MILLILITRE:
                return new MilliLitreImpl();
            case GRAM:
                return new GramImpl();
            case TONNE:
                return new TonneImpl();
            case KILOGRAM:
                return new KilogramImpl();
            case CELSIUS:
                return new CelsiusImpl();
            case FAHRENHEIT:
                return new FahrenheitImpl();
            default:
                return null;
        }
    }
}
