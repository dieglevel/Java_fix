package entity;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author Admin
 */
public class Motobike {
    private int motobikeID;
    private String countryOfmanufacture;
    private String rangeOfVehicle;
    private double cubic;
    private String theFrameOfTheMachine;
    private String numberOfRibs;
    private String color;
    private double money;
    private String warrantyPeriod;
    
    
    
    
    
	public Motobike(int motobikeID, String countryOfmanufacture, String rangeOfVehicle, double cubic,
			String theFrameOfTheMachine, String numberOfRibs, String color, double money, String warrantyPeriod) {
		super();
		this.motobikeID = motobikeID;
		this.countryOfmanufacture = countryOfmanufacture;
		this.rangeOfVehicle = rangeOfVehicle;
		this.cubic = cubic;
		this.theFrameOfTheMachine = theFrameOfTheMachine;
		this.numberOfRibs = numberOfRibs;
		this.color = color;
		this.money = money;
		this.warrantyPeriod = warrantyPeriod;
	}
	public int getMotobikeID() {
		return motobikeID;
	}
	public void setMotobikeID(int motobikeID) {
		this.motobikeID = motobikeID;
	}
	public String getCountryOfmanufacture() {
		return countryOfmanufacture;
	}
	public void setCountryOfmanufacture(String countryOfmanufacture) {
		this.countryOfmanufacture = countryOfmanufacture;
	}
	public String getRangeOfVehicle() {
		return rangeOfVehicle;
	}
	public void setRangeOfVehicle(String rangeOfVehicle) {
		this.rangeOfVehicle = rangeOfVehicle;
	}
	public double getCubic() {
		return cubic;
	}
	public void setCubic(double cubic) {
		this.cubic = cubic;
	}
	public String getTheFrameOfTheMachine() {
		return theFrameOfTheMachine;
	}
	public void setTheFrameOfTheMachine(String theFrameOfTheMachine) {
		this.theFrameOfTheMachine = theFrameOfTheMachine;
	}
	public String getNumberOfRibs() {
		return numberOfRibs;
	}
	public void setNumberOfRibs(String numberOfRibs) {
		this.numberOfRibs = numberOfRibs;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public double getMoney() {
		return money;
	}
	public void setMoney(double money) {
		this.money = money;
	}
	public String getWarrantyPeriod() {
		return warrantyPeriod;
	}
	public void setWarrantyPeriod(String warrantyPeriod) {
		this.warrantyPeriod = warrantyPeriod;
	}
	@Override
	public String toString() {
		return "Motobike [motobikeID=" + motobikeID + ", countryOfmanufacture=" + countryOfmanufacture
				+ ", rangeOfVehicle=" + rangeOfVehicle + ", cubic=" + cubic + ", theFrameOfTheMachine="
				+ theFrameOfTheMachine + ", numberOfRibs=" + numberOfRibs + ", color=" + color + ", money=" + money
				+ ", warrantyPeriod=" + warrantyPeriod;
	}
    
}