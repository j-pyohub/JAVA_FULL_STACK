package Office;

public class Manager extends Employee{
	private String officeNumber;

	public Manager(String number, String name, String officeNumber) {
		super(number, name);
		this.officeNumber = officeNumber;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((officeNumber == null) ? 0 : officeNumber.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Manager other = (Manager) obj;
		if (officeNumber == null) {
			if (other.officeNumber != null)
				return false;
		} else if (!officeNumber.equals(other.officeNumber))
			return false;
		return true;
	}

	public String getofficeNumber() {
		return officeNumber;
	}

	public void setofficeNumber(String officeNumber) {
		this.officeNumber = officeNumber;
	}

	@Override
	public String toString() {
		return "[" + officeNumber + "] "+super.toString();
	}
	
	
}
