package entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Ground {
	private String name;
	private Date date;
	private Double value;

	List<Definit> definit = new ArrayList<Definit>();
	public Ground(){
	}
	public Ground(String name, Date date, Double value) {

		this.name = name;
		this.date = date;
		this.value = value;

	}
		
		public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public Double getValue() {
		return value;
	}
	public void setvalue(Double value) {
		this.value = value;
	}
		public List<Definit> getDefinit() {
		return definit;
	}
}
