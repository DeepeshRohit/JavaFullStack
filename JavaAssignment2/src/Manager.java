class Manager extends Employee{
    double incentive =15000.0;
    void totalsalary()
    {
        System.out.println("The Manager salary is :" +((salary+incentive)));
    }
}