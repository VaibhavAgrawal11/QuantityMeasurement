package com.bridgelabz.adaptor;

import com.bridgelabz.adaptor.lengths.*;
import com.bridgelabz.adaptor.volume.*;
import com.bridgelabz.adaptor.weights.GramImpl;
import com.bridgelabz.adaptor.weights.KilogramImpl;
import com.bridgelabz.adaptor.weights.TonneImpl;
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
                return new MilliLitre();
            case GRAM:
                return new GramImpl();
            case TONNE:
                return new TonneImpl();
            case KILOGRAM:
                return new KilogramImpl();
            default:
                return null;
        }
    }
}
