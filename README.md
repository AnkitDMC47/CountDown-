# CountDown-
Using Java

This Java code implements a simple countdown timer.
 
The code starts by importing the necessary classes from the Java standard library:

The program creates a scheduled executor service, which is a thread pool that can execute tasks at a scheduled time:

The user is prompted to enter a starting number for the countdown.
The program creates a scheduled executor service with a single thread.
The program defines a Runnable task that will decrement the starting number and print its value to the console.
The task is scheduled to run every 1 second, starting immediately.
The task runs, printing the current value of the countdown to the console, and decrementing it.
If the countdown reaches 0, the task prints "Timer Over" and shuts down the scheduled executor service.
END
