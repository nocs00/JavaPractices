/**
 * Created by pdudenkov on 27.07.15.
 */
import com.lessons.lesson6.*;

public class TestPayIncrease {

    public static void main(String args[]) {

        Payable workers[] = new Payable[3];
        workers[0] = new Employee("Mary");
        workers[1] = new Contractor("John");
        workers[2] = new ForeignContractor("Kain");

        for (Payable p : workers) {
            p.increasePay(30);
        }
    }
}
