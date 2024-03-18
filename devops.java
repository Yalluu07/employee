public class devops extends employee{
    double fieldbonus=5000;

public void totalsalary(double salary,int fieldbonus)
{
    System.out.print("The name of employee is"+salary+fieldbonus);
}

public static void main(String[] args)
{
    employee  e = new devops();
    e.displaydetails();
    e.totalsalary();
}
}