package ua.training.reflection;

public class SomeClass {
	
	private int field;

	@CallMe
	public int getField() {
		System.out.println("ua.training.reflection.immutaible.SomeClass.getField() executed");
		return field;
	}

	public void setField(int field) {
		this.field = field;
	}

	@Override
	@CallMe
	public String toString() {
		return "SomeClass [field=" + field + "]";
	}
	
	
	

}
