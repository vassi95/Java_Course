package exceptions;

public class CoorporativeAccount extends Account {
	private String firmName;
	private long bulstat;

	public CoorporativeAccount() throws NegativeMoneyException {
		super();
		setFirmName("");
		setBulstat(0);
	}

	public CoorporativeAccount(double money, String firmName, long bulstat) throws NegativeMoneyException {
		super(money);
		setFirmName(firmName);
		setBulstat(bulstat);
	}

	public String getFirmName() {
		return firmName;
	}

	public void setFirmName(String firmName) {
		this.firmName = firmName;
	}

	public long getBulstat() {
		return bulstat;
	}

	public void setBulstat(long bulstat) {
		this.bulstat = bulstat;
	}

}
