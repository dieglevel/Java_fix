package entity;

import java.time.LocalDate;

public class Contract {
	private int contractID;
	private int customerID;
	private LocalDate contractDate ;
	private int staffID;
	private double moneyPay;
	private float discount;
	private double moneypaied;
	private int timePay;
	private String methodPayment;
	
	
	
	
	public Contract(int contractID, int customerID, LocalDate contractDate, int staffID, double moneyPay,
			float discount, double moneypaied, int timePay, String methodPayment) {
		super();
		this.contractID = contractID;
		this.customerID = customerID;
		this.contractDate = contractDate;
		this.staffID = staffID;
		this.moneyPay = moneyPay;
		this.discount = discount;
		this.moneypaied = moneypaied;
		this.timePay = timePay;
		this.methodPayment = methodPayment;
	}
	public int getContractID() {
		return contractID;
	}
	public void setContractID(int contractID) {
		this.contractID = contractID;
	}
	public int getCustomerID() {
		return customerID;
	}
	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}
	public LocalDate getContractDate() {
		return contractDate;
	}
	public void setContractDate(LocalDate contractDate) {
		this.contractDate = contractDate;
	}
	public int getStaffID() {
		return staffID;
	}
	public void setStaffID(int staffID) {
		this.staffID = staffID;
	}
	public double getMoneyPay() {
		return moneyPay;
	}
	public void setMoneyPay(double moneyPay) {
		this.moneyPay = moneyPay;
	}
	public float getDiscount() {
		return discount;
	}
	public void setDiscount(float discount) {
		this.discount = discount;
	}
	public double getMoneypaied() {
		return moneypaied;
	}
	public void setMoneypaied(double moneypaied) {
		this.moneypaied = moneypaied;
	}
	public int getTimePay() {
		return timePay;
	}
	public void setTimePay(int timePay) {
		this.timePay = timePay;
	}
	public String getMethodPayment() {
		return methodPayment;
	}
	public void setMethodPayment(String methodPayment) {
		this.methodPayment = methodPayment;
	}

    @Override
    public String toString() {
        return "Contract{" + "contractID=" + contractID + ", customerID=" + customerID + ", contractDate=" + contractDate + ", staffID=" + staffID + ", moneyPay=" + moneyPay + ", discount=" + discount + ", moneypaied=" + moneypaied + ", timePay=" + timePay + ", methodPayment=" + methodPayment + '}';
    }

   
	
	
	
	
	
	
	
}
