package serviceHouse;

public class HousePaymentService implements PaymentService{

	@Override
	public Double paymentFee(Double totalValue) {
		return totalValue * 1.10;
	}

	@Override
	public Double interest(Double amount, Integer months) {
		return amount * 0.02 * months;
	}
}
