/*
Rudrik Patel
COP2805 HW - 6_1_2 part2
04/02/2022
 */
import java.util.Scanner;
public class hw6_1_2{  //reading from the file salary.txt
    public static void main(String[] args) throws Exception{
        
        java.io.File f = new java.io.File("Salary.txt");
        
        //scanner assign to file 
        Scanner input = new Scanner(f);
        
        //variables 
        int assistant = 0;
        int associate = 0;
        int full = 0;
        double assistants = 0;
        double associates = 0;
        double fulls = 0;
        
        //while loop for extracting the data from the salary.txt file and assign to variables
        while(input.hasNext()){
            String fname = input.next();
            String lname = input.next();
            String rank = input.next();
            double salary = input.nextDouble();
            
            //calculating individual rank's number and salary 
            if(rank.equals("assistant")){
                assistant ++;
                assistants += salary;
            }
            else if(rank.equals("associate")){
                associate++;
                associates += salary;
            }
            else if(rank.equals("full")){
                full++;
                fulls += salary;
            }
        }
        //calculating individual rank's salary average
        double assistantavg = assistants / assistant;
        double associateavg = associates/ associate;
        double fullavg = fulls/ full;
        
        //display the number of individual rank
        System.out.println("Number of assistant professors is "+assistant);
        System.out.println("Number of associates professors is "+associate);
        System.out.println("Number of full professors is "+full);
        
        System.out.println();
        
        //display the average salary of each rank 
        System.out.println("Average salary for assistant professor is "+assistantavg);
        System.out.println("Average salary for associate professor is "+associateavg);
        System.out.println("Average salary for full professor is "+fullavg);
        
        input.close(); //close
    }
}
