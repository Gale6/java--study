package oops;


public class ExceptionHandling {
	
	double accountAmount = 100;
	double limit = 200;
	
	public void validateBalance(double amount) throws InsufficientBalanceException{
		
		if (amount < accountAmount ) {
			throw new InsufficientBalanceException("Insufficient Balance");
		}
		
	}
	
	public void validateLimite(double amount) throws ExceedingDailyLimitException{
		
		if (amount > limit ) {
			throw new ExceedingDailyLimitException("Exceeding Daily Limit");
		}
		
	}

	public static void main(String[] args) {
		// 1. compile time
		// 2. runtime
		
		ExceptionHandling ee = new ExceptionHandling();
		
		
		
		try {			
			
			ee.validateBalance(99);

		}catch (InsufficientBalanceException e) {
			System.out.println(e.getMessage());
		}
		
		try {
			ee.validateLimite(203);
		}catch (ExceedingDailyLimitException e) {
			System.out.println(e.getMessage());
		}
		
	}
}
