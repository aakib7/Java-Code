
package Lab8b;

import java.time.*;
import java.util.*;
public class Test {

        public static void main(String[] args) {
   
        Scanner scan=new Scanner(System.in);
        LocalDate date = LocalDate.now();
        int currentMonth=date.getMonthValue();
       
        
        Employee employees[] = new Employee[ 5 ]; 
        
        
        Date sed=new Date(2,7,1999);
        employees[ 0 ] =new SalariedEmployee(800.00,"AB", "DE", "111-11-1111",sed );
        
        Date hrd=new Date(2,6,1998);
        employees[ 1 ] =new HourlyEmployee(162,4,"ali","hassan","222-2-2222",hrd);
        
        Date cmd=new Date(19,7,1987);
        employees[ 2 ] =new CommissionEmployee(10000,0.06,"SUZAN", "Jones", "333-33-3333",cmd);
        
        Date bpcmd=new Date(1,3,1990);
        employees[ 3 ] =new BasePlusCommissionEmployee( 5000, 0.04, 300,"ALI", "M.", "444-44-4444", bpcmd);
        
        Date pwd=new Date(1,7,1990);
        employees[4]=new PieceWorker(123,21,"DANYAL", "ALAM", "555-45-5544", pwd);
        
        for ( Employee currentEmployee : employees ) 
        {
           System.out.println("");
           System.out.println( currentEmployee ); 
           
        if ( currentEmployee instanceof BasePlusCommissionEmployee ) {
              BasePlusCommissionEmployee bpce =(BasePlusCommissionEmployee)currentEmployee;
              
            if(bpce.getDate().getMonth()==currentMonth){
              double oldBaseSalary = bpce.getBaseSalary();
              double ns = oldBaseSalary+100;
             
        System.out.println("happy Brith Day:"+bpce.getFrisrName());
        System.out.println("you got $100 increase in salary new salary:"+ns);
               }
        else{   
              double oldBaseSalary = bpce.getBaseSalary();
              bpce.setBaseSalary((1.10) * oldBaseSalary);
        System.out.println("you got 10% increase in salary new salary:"+bpce.getBaseSalary());
               }
           } 
        else if(currentEmployee.getDate().getMonth()==currentMonth){
            if ( currentEmployee instanceof HourlyEmployee ) {
               HourlyEmployee hr =( HourlyEmployee ) currentEmployee;
               double os= hr.earnings();
               double ns=100+os;
        System.out.println("happy Brith Day:"+hr.getFrisrName());
        System.out.println("you got $100 increase in salary new salary:"+ns);
                 }
        else if ( currentEmployee instanceof SalariedEmployee ) {
           SalariedEmployee  se =( SalariedEmployee  ) currentEmployee;
           double os= se.earnings();
           double ns=100+os;
        System.out.println("happy Brith Day:"+se.getFrisrName());
         System.out.println("you got $100 increase in salary new salary:"+ns);
                 }
            else if ( currentEmployee instanceof CommissionEmployee ) {
           CommissionEmployee ce =( CommissionEmployee ) currentEmployee;
           double os= ce.earnings();
           double ns=100+os;
        System.out.println("happy Brith Day:"+ce.getFrisrName());
        System.out.println("you got $100 increase in salary new salary:"+ns);
                 }
            
            else if ( currentEmployee instanceof PieceWorker ) {
           PieceWorker  pw =(PieceWorker) currentEmployee;
           double os= pw.earnings();
           double ns=100+os;
        System.out.println("happy Brith Day:"+pw.getFrisrName());
        System.out.println("you got $100 increase in salary new salary:"+ns);
                 }
            
           }
        else if(currentEmployee.getDate().getMonth()!=currentMonth){
               System.out.println("Earing:"+currentEmployee.earnings());}
        } 
    }
   
}
