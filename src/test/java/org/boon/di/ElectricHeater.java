package org.boon.di;



@Named
public class ElectricHeater extends BaseObject implements Heater {
    boolean heating;

    @Override
    public void on() {
        System.out.println( "~ ~ ~ heating ~ ~ ~" );
        this.heating = true;
    }

    @Override
    public void off() {
        this.heating = false;
    }

    @Override
    public boolean isHot() {
        return heating;
    }
}