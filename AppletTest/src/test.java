import com.lessons.lesson10.Calculator;

import javax.swing.JApplet;
import java.awt.Graphics;
/**
 * Created by pdudenkov on 04.08.15.
 */

public class test extends JApplet {
    //Graphics gr;
    public void paint(Graphics g){
        //g.drawString("Hello World", 50, 100);
        Calculator calc = new Calculator(this);
    }
//
//    public void init() {
//        gr.drawString("Init", 50, 100);
//    }
//
//    public void start() {
//        gr.drawString("Hi again!", 50, 100);
//    }
}
