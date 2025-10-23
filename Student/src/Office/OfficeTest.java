package Office;

public class OfficeTest {
	public static void main(String[] args) {
		int numberOfEmployees = 5;
		IEmployeeBiz empBiz = new ManagerList(numberOfEmployees);
		
		empBiz.addEmployee(new Manager("19-10553", "≥Ó∫Œ¿Â", "1∆¿"));
		empBiz.addEmployee(new Manager("20-10483", "»Ô∫Œ¿Â", "2∆¿"));
		empBiz.addEmployee(new Employee("23-10213", "»´±Êµø"));
		empBiz.addEmployee(new Employee("25-10184", "∞Ì±Êµø"));
		empBiz.addEmployee(new Employee("25-10421", "±Ë√∂ºˆ"));
		empBiz.addEmployee(new Manager("1004-1004", "Ω∫∆ƒ¿Ã", "0∆¿"));

		System.out.println(empBiz);

		Employee tmpEmployee = new Employee("25-10184", "∞Ì±Êµø");
		System.out.println("[" + empBiz.isEmployee(tmpEmployee)+"] " + tmpEmployee);
		
		tmpEmployee = new Employee("21-10184", "±Ë±Êµø");
		System.out.println("[" + empBiz.isEmployee(tmpEmployee)+"] " + tmpEmployee);
		
		
		System.out.println(((ManagerList)empBiz).getOfficeNumber("19-10553"));
		System.out.println(((ManagerList)empBiz).getOfficeNumber("2-10483"));
	}
	
}
