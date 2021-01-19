package testingtime;

 

import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;



//the class that represents our task (thread)
class stopwatchTimer extends TimerTask{ //create a task by extending the timetask class itself
    
    int seconds = 0;
    
    public void run(){ 
        
        seconds++;
        System.out.println("Seconds passed: " + seconds);
    }
}


public class TestingTime {
    
    public static Scanner input = new Scanner(System.in);
    
    public static void timerGo() {
        stopwatchTimer task1 = new stopwatchTimer();
        Timer timer = new Timer();
        timer.scheduleAtFixedRate(task1, 1000, 1000);
        // timer.scheduleAtFiexedRate( the task you want to run, how long before it starts, how quickly you want it to repeat e.g every 0.5 seconds
        
        //tell main method to wait before next line of code so that it runs the task
        try {
            Thread.sleep(1000); // wait 1 second before starting
        } catch (InterruptedException exc) {}
        
        System.out.println("Press 2 to stop");
        int userInput = input.nextInt();
        if (userInput == 2) {
            //play music (not there yet)
            timer.cancel();
        } else {
            System.out.print("");
        }
    }
    
    

    
    public static void main(String[] args) {
        while (true) {
            System.out.println("Welcome to the stopwatch");
            System.out.println("Enter 1 to start timer");
            System.out.println("Enter 2 to stop timer");
            System.out.println("Enter 0 to reset timer");
            int menuOptions = input.nextInt();

            if (menuOptions == 1) {
                timerGo();
            }
            
        }
        
        
        
        
                
//        stopwatchTimer task1 = new stopwatchTimer();
//        Timer timer = new Timer();
//        timer.scheduleAtFixedRate(task1, 1000, 1000);
//        // timer.scheduleAtFiexedRate( the task you want to run, how long before it starts, how quickly you want it to repeat e.g every 0.5 seconds
//        
//        //tell main method to wait before next line of code so that it runs the task
//        try {
//            Thread.sleep(1000); // wait as long as sceonds
//        } catch (InterruptedException exc) {}
//        
//        System.out.println("Press y to stop");
//        String userInput = input.next();
//        if (userInput.equals("y")) {
//            timer.cancel();
//        } else {
//            System.out.print("");
//        }
//        //timer.cancel();
        
        
    }
    
}
