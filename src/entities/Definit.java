package entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Definit {
	private Date newDate;
	private Double value;
	private static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	public Definit() {
		
	}
	public Definit(Date newDate, Double value) {
		
		this.newDate = newDate;
		this.value = value;
	}
	public Date getNewDate() {
		return newDate;
	}
	public void setNewDate(Date newDate) {
		this.newDate = newDate;
	}
	public Double getValue() {
		return value;
	}
	public void setValue(Double value) {
		this.value = value;
	}
	public String toString() {
		return sdf.format(newDate) + " - " + String.format("%.2f", value);
	}
	
	
}