package com.theironyard;

import com.sun.javafx.scene.layout.region.Margins;

/**
 * In this exercise you will create a tool that can convert between units of
 * length. For example, you can use this to calculate what 0.25 inches is in
 * millimeters.
 * <p>
 * Start by following the instructions in the Unit enum. Next, work on the
 * Converter class. Finally, follow the instructions in the Main class below.
 */
public class Main {

    public static void main(String[] args) {

        /*
            Use the Converter.convert method at least 3 times using at least 6
            different units.
         */
        // todo: convert something
        Converter.convert(10, Unit.FOOT, Unit.MILLIMETER);


        // todo: convert something else
        Converter.convert(10, Unit.YARD, Unit.CENTIMETER);



        // todo: convert yet another thing
        Converter.convert(1, Unit.MILE, Unit.METER);



    }
}


