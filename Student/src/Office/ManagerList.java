package Office;

public class ManagerList extends EmployeeList {

	public ManagerList(int size) {
		super(size);
	}

	public String getOfficeNumber(String number){
		for (int i = 0; i < getCount(); i++) {
			if(getEmployee(i).getNumber().equals(number)) 
				return ((Manager)getEmployee(i)).getofficeNumber();
		}
		return null;
	}
}
