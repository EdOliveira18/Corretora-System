package serviceGround;

import serviceGround.PaymentService;

public class GroundPaymentService implements PaymentService {

	@Override
	public Double paymentFee(Double Value) {
		return Value * 1.10;
	}

	@Override
	public Double interest(Double amount, Integer months) {
		return amount * 0.02 * months;
	} 

}
