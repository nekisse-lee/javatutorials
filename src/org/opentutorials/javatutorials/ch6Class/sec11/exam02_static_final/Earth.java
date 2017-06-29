package org.opentutorials.javatutorials.ch6Class.sec11.exam02_static_final;

/**
 * Created by Nekisse_lee on 2017. 6. 28..
 */
public class Earth {
    static final double EARTH_RADIUS = 6400;
    static final double EARTH_SURFACE_AREA;

    static{
        EARTH_SURFACE_AREA = 4*Math.PI*EARTH_RADIUS*EARTH_RADIUS;
    }


}
