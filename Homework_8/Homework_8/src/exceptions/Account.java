package exceptions;

public class Account {
	private double money;

	public Account() throws NegativeMoneyException {
		setMoney(0.0);
	}

	public Account(double money) throws NegativeMoneyException {
		this();
		setMoney(money);
	}

	public double getMoney() {
		return money;
	}

	public void setMoney(double money) throws NegativeMoneyException {
		checkForNegative(money);
		this.money = money;
	}

	public static void checkForNegative(double mon) throws NegativeMoneyException {
		if (mon < 0) {
			throw new NegativeMoneyException("You cannot enter negative amount of money!");
		} else {
			return;
		}
	}

}
