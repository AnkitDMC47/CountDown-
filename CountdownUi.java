//import java.util.*;
import javax.swing.*;
import java.awt.*;
//import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

public class CountdownUi {
    public static void main(String[] args) {
        //Scanner in = new Scanner(System.in);
        //System.out.println("Enter the CountDown Number : ");

        JFrame jframe = new JFrame();
        JLabel jLabel = new JLabel();
        jframe.setLayout(new FlowLayout());
        jframe.setBounds(500, 300, 400, 100);

        jframe.add(jLabel);
        jframe.setVisible(true);

        Timer timer = new Timer();

        timer.scheduleAtFixedRate(new TimerTask() {
            //enter the counting number at i;
            int i = 10;

            public void run() {

                jLabel.setText("Time left: " + i);
                i--;

                if (i < 0) {
                    timer.cancel();
                    jLabel.setText("Time Over");
                }
            }
        }, 0, 1000);
    
        
    }
}