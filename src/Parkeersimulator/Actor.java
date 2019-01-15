package Parkeersimulator;

import java.awt.Color;

public abstract class Actor {
	//private Location location;

    /**
     * Constructor for objects of class Car
     */
    public Actor() {

    }

    /*
    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }
	*/
    
    public abstract Color getColor();
}
