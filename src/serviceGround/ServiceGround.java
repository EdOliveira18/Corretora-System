package serviceGround;

import java.util.Calendar;
import java.util.Date;

import entities.Definit;
import entities.Ground;

public class ServiceGround {
	
	private PaymentService paymentService;
	private GroundPaymentService groundPaymentService;
	
	public ServiceGround(PaymentService paymentService){
		this.paymentService = paymentService;
		
	}
	
	public void processContract(Ground ground, Integer months) {
		double media = paymentService.paymentFee(ground.getValue())/months;
		for(int i = 1; i <= months; i ++) {
			double interestQuota = media + paymentService.interest(media, i);
			Date newDate = calend(ground.getDate(), i);
			ground.getDefinit().add(new Definit(newDate, interestQuota));
		}
	}
	
	public Date calend(Date date, int plots) {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		calendar.add(Calendar.MONTH, plots);
		return calendar.getTime();
	}

}
