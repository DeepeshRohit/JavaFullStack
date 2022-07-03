public class MainClass
{
    public static void main(String args[]){


        Labour t = new Labour();
        Manager m=new Manager();
        System.out.println("Total Salary Of Employees In Organisation is "+(m.salary+ (((m.incentive)+ t.overtime))+ t.salary)); //displays total salary of emp in org//

        // based on an object it decides which class salary method to be execute
       // m.totalsalary(); // displays manager salary//
        // t.totalsalary(); //displays Labour salary//
        
        System.out.println();
        CurrentAccount c=new CurrentAccount();
        SavingAccount s=new SavingAccount();


        // based on an object it decides which class account method to be execute
        c.totalMoneyInBank(); //prints total money in current acc//
        s.totalMoneyInBank(); //prints total money in savings acc//
        System.out.println("Total money in the bank  is "+( c.fixedDeposits+c.cashCredit)); //displays total salary of emp in org//
        
        


    }
}