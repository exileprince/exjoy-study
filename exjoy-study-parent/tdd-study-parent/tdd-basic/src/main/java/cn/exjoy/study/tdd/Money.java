package cn.exjoy.study.tdd;

public abstract class Money {

	protected int amount;

	@Override
	public boolean equals(Object obj) {
		if (obj == null)
			return false;

		if (obj instanceof Money && this.getClass().equals(obj.getClass()))
			return this.amount == ((Money) obj).amount;

		return false;
	}
	
	public static Money dollar(int amount) {
		return new Dollar(amount);
	}
	
	public static Money franc(int amount) {
		return new Franc(amount);
	}
	
	public abstract Money times(int multiplier);
}
