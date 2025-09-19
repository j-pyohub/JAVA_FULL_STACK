
public class CustomerDAO implements Customer{

	@Override
	public boolean setCustomer(String name, String phoneNumber) {
		
		return false;
	}

	@Override
	public boolean setCustomer(String name, String phoneNumber, int point) {
		
		return false;
	}

	@Override
	public int getPoint(int customerId) {

		return 0;
	}

	@Override
	public boolean setPoint(int customerId, int point) {

		return false;
	}

	@Override
	public boolean deleteCustomer(int customerId) {

		return false;
	}
	
}
