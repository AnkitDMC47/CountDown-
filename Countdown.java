import java.util.*;
import java.util.concurrent.*;

import static java.util.concurrent.TimeUnit.SECONDS;

public class Countdown {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the countdownStart number : ");

        final ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);

        final Runnable runnable = new Runnable() {         
            
            int countdownStarter = in.nextInt();

            public void run() {

                System.out.print(countdownStarter+" ");
                countdownStarter--;

                if (countdownStarter < 0) {
                    System.out.println("Timer Over");
                    scheduler.shutdown();
                }
            }
        };
        scheduler.scheduleAtFixedRate(runnable, 0, 1, SECONDS);
        in.close();
    }
}