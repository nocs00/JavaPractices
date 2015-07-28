import com.lessons.animalsAbstract.*;

/**
 * Created by pdudenkov on 28.07.15.
 */
public class Test2 {
    public static void main(String args[]) {
        Animal[] animals = new Animal[1];

        animals[0] = new Cat(2,"Browny",4, Animal.AnimalType.FURRY);
        //animals[1] = new Dog();
        //animals[2] = new Fox();

        for (Animal a : animals) {
            if (a != null) {
                System.out.println(a.makeNoise());
            }
        }
    }
}
