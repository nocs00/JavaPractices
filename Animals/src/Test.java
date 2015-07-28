import com.lessons.animals.*;

/**
 * Created by pdudenkov on 28.07.15.
 */
public class Test {
    public static void main(String args[]) {
        Noisable[] animals = new Noisable[3];

        animals[0] = new Cat();
        animals[1] = new Dog();
        animals[2] = new Fox();

        for (Noisable a : animals) {
            if (a != null) {
                System.out.println(a.makeNoise());
            }
        }
    }
}
