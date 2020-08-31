package servicePropertyLease;

import java.util.Calendar;
import java.util.Date;

import entities.Definit;

import entities.PropertyLease;

public class ServicePropertyLease {
	
	public void processContract(PropertyLease pl, Integer contractTime) {
		for(int i = 1; i <= contractTime; i ++) {
			Date newDate = calend(pl.getDateStart(), i);
			pl.getDefinit().add(new Definit(newDate, pl.getValue()));
		}
	}
	
	public Date calend(Date date, int plots) {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		calendar.add(Calendar.MONTH, plots);
		return calendar.getTime();
	}
}
