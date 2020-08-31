package entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PropertyLease {
	
	private String name;
	private Date dateStart;
	private Double value;
	
	List<Definit> definit = new ArrayList<Definit>();
	
	public PropertyLease() {
		
	}

	public PropertyLease(String name, Date dateStart, Double value) {
		
		this.name = name;
		this.dateStart = dateStart;
		this.value = value;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getDateStart() {
		return dateStart;
	}

	public void setDateStart(Date dateStart) {
		this.dateStart = dateStart;
	}

	public Double getValue() {
		return value;
	}

	public void setValue(Double value) {
		this.value = value;
	}

	public List<Definit> getDefinit() {
		return definit;
	}

	
	
}
