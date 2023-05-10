package entity;

import java.time.LocalDate;

public class Payment {

	private int paymentID;
	private int contractID;
	private LocalDate paymentDate;
	private Double moneyPay;
	private String persionTake;
	private String persionGive;
	public Payment(int paymentID, int contractID, LocalDate paymentDate, Double moneyPay, String persionTake,
			String persionGive) {
		super();
		this.paymentID = paymentID;
		this.contractID = contractID;
		this.paymentDate = paymentDate;
		this.moneyPay = moneyPay;
		this.persionTake = persionTake;
		this.persionGive = persionGive;
	}
	public int getPaymentID() {
		return paymentID;
	}
	public void setPaymentID(int paymentID) {
		this.paymentID = paymentID;
	}
	public int getContractID() {
		return contractID;
	}
	public void setContractID(int contractID) {
		this.contractID = contractID;
	}
	public LocalDate getPaymentDate() {
		return paymentDate;
	}
	public void setPaymentDate(LocalDate paymentDate) {
		this.paymentDate = paymentDate;
	}
	public Double getMoneyPay() {
		return moneyPay;
	}
	public void setMoneyPay(Double moneyPay) {
		this.moneyPay = moneyPay;
	}
	public String getPersionTake() {
		return persionTake;
	}
	public void setPersionTake(String persionTake) {
		this.persionTake = persionTake;
	}
	public String getPersionGive() {
		return persionGive;
	}
	public void setPersionGive(String persionGive) {
		this.persionGive = persionGive;
	}
	
	
}
