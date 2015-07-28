/**
 * Created by pdudenkov on 27.07.15.
 */
import com.lessons.lesson6.Contractor;
import com.lessons.lesson6.Employee;
import com.lessons.lesson6.Payable;
import com.lessons.lesson6.Person;

public class TestPayIncrease {

    public static void main(String args[]) {

        Person workers[] = new Person[3];
        workers[0] = new Employee("Mary");
        workers[1] = new Contractor("John");
        workers[2] = new Employee("Kain");

        for (Person p : workers) {
            p.increasePay(30);
        }
    }
}
