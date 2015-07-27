/**
 * Created by pdudenkov on 27.07.15.
 */
import com.lessons.lesson6.Contractor;
import com.lessons.lesson6.Employee;
import com.lessons.lesson6.Payable;
import com.lessons.lesson6.Person;

public class TestPayIncrease {

    public static void main(String args[]) {
        //Employee myEmp = new Employee("Steve");
        Person workers[] = new Person[3];
        workers[0] = new Employee("Mary");
        workers[1] = new Contractor("John");
        workers[2] = new Employee("Kain");

        Employee currentEmployee;
        Contractor currentContractor;

        for (Person p : workers) {
            if (p instanceof Employee) {
                currentEmployee = (Employee) p;
                currentEmployee.increasePay(30);
            }
            if (p instanceof Contractor) {
                currentContractor = (Contractor) p;
                currentContractor.increasePay(30);
            }
        }
    }
//    public static void main(String args[]) {
//        //Employee myEmp = new Employee("Steve");
//        Payable[] workers = new Payable[3];
//        workers[0] = new Employee("Mary");
//        workers[1] = new Contractor("John");
//        workers[2] = new Employee("Kain");
//
//        for (Payable p : workers) {
//            p.increasePay(30);
//        }
//    }
}
