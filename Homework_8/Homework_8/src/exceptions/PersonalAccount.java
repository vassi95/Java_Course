package exceptions;

public class PersonalAccount extends Account {
	private String name;
	private long personalID;

	public PersonalAccount() throws NegativeMoneyException {
		super();
		setName("");
		setPersonalID(0);
	}

	public PersonalAccount(double money, String name, long personalID) throws NegativeMoneyException {
		super(money);
		setName(name);
		setPersonalID(personalID);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getPersonalID() {
		return personalID;
	}

	public void setPersonalID(long personalID) {
		this.personalID = personalID;
	}

}
