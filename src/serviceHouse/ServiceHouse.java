package serviceHouse;

import java.util.Calendar;
import java.util.Date;

import entities.Definit;
import entities.House;

public class ServiceHouse {
	private PaymentService paymentService;
	private HousePaymentService housepaymentService;
	
	public ServiceHouse(PaymentService paymentService) {
		this.paymentService = paymentService;
	}
	
	public void processContract(House house, Integer months) {
		double media = paymentService.paymentFee(house.getValue())/months;
		for(int i = 1; i <= months; i ++) {
			double interestQuota = media + paymentService.interest(media, i);
			Date newDate = calend(house.getDate(), i);
			house.getDefinit().add(new Definit(newDate, interestQuota));
		}
	}
	
	public Date calend(Date date, int plots) {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		calendar.add(Calendar.MONTH, plots);
		return calendar.getTime();
	}
	
}

