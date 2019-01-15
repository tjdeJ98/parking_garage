package Parkeersimulator;

public abstract class Vehicle {
	private int minutesLeft;
    private boolean isPaying;
    private boolean hasToPay;
    
	public Vehicle() {
		
	}
	
    public int getMinutesLeft() {
        return minutesLeft;
    }

    public void setMinutesLeft(int minutesLeft) {
        this.minutesLeft = minutesLeft;
    }
    
    public boolean getIsPaying() {
        return isPaying;
    }

    public void setIsPaying(boolean isPaying) {
        this.isPaying = isPaying;
    }

    public boolean getHasToPay() {
        return hasToPay;
    }

    public void setHasToPay(boolean hasToPay) {
        this.hasToPay = hasToPay;
    }
    
    public void tick() {
        minutesLeft--;
    }
}
