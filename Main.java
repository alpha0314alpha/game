import java.util.Scanner;
import javax.swing.*;
import java.awt.event.*;
import java.time.*;

class Main extends JFrame{
    static Scanner javain = new Scanner(System.in);
    static int tick;

    public static void main(String[] args){
        System.out.println("Input tick(ms)");
        tick = javain.nextInt();
        new Main();
    }

    public Main(){
        double count = 0;
        while (true){
            try{
                Thread.sleep(tick);
            }
            catch(InterruptedException e){
                e.printStackTrace();
            }
            count += tick/1000.0;
            System.out.println(count);
        }
    }
}
