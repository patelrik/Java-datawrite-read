/*
Rudrik Patel
COP2805 HW - 6_1
04/02/2022
 */

public class hw6_1 { //file data writing
    public static void main(String[] args) throws Exception{
        
        //declare variable and name of file
        java.io.PrintWriter file = new java.io.PrintWriter("Salary.txt");
        
        //array string 
        String[] rank = {"assistant", "associate", "full"};
        
        //declare 100 names in file
        for(int i =0; i<100; i++){
            double salary = 0;
            //randomly choosing the rank 
            int r = (int)(Math.random()*3);
            
            //declaring name in file
            String fname = "FirstName"+i;
            String lname = "LastName"+i;
            
            //random salary for perticular rank
            if(r == 0){
                salary = 50000+(Math.random()*(80000-50000));
            }
            else if(r == 1){
                salary = 60000+(Math.random()*(110000-60000));
            }
            else if(r == 2){
                salary = 75000+(Math.random()*(130000-75000));
            }
            //write the data into the file
            file.println(fname +" " +lname +" " +rank[r] +" " +salary);
        }
        file.close(); //file close
    }
}
