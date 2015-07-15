import com.lessons.lesson6.*;

public class TestPayIncrease {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println("test");
		//Employee myEmployee = new Employee();
		
		Person workers[] = new Person[3];
		workers[0] = new Employee("Kano");
		workers[1] = new Contractor("LiuKang");
		workers[2] = new Employee("Goro");
		
		Employee currentEmployee;
		Contractor currentContractor;
		
		for (Person p : workers) {
			if (p instanceof Employee) {
				currentEmployee = (Employee)p;
				((Employee) p).increasePay(30);
				
			} else if (p instanceof Contractor) {
				currentContractor = (Contractor)p;
				((Contractor) p).increasePay(30);
			}
		}
		
	}

}
