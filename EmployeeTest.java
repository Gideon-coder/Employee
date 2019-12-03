import java.util.Scanner;

public class EmployeeTest {
    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);
        Employee worker1 = new Employee("John", "Doe", 2500000.00);
        Employee worker2 = new Employee("Lisa", "Walters", 5000000.00);

        System.out.printf("Cheif Technology Officer %s %s salary is %.2f%n%n",
            worker1.GetfirstName(), worker1.GetlastName(), worker1.Getsalary());
        
        System.out.printf("Cheif Operating Officer %s %s salary is %.2f%n%n",
            worker2.GetfirstName(), worker2.GetlastName(), worker2.Getsalary());

        System.out.println("Enter percentage raise to salary1: ");
        double raise1 = user.nextDouble();
        worker1.raise(raise1);
        System.out.println();

        System.out.println("Enter percentage raise to salary2: ");
        raise1 = user.nextDouble();
        worker2.raise(raise1);
        System.out.println();

        System.out.printf("Cheif Technology Officer %s %s salary is %.2f%n%n",
            worker1.GetfirstName(), worker1.GetlastName(), worker1.Getsalary());
        
        System.out.printf("Cheif Operating Officer %s %s salary is %.2f%n%n",
            worker2.GetfirstName(), worker2.GetlastName(), worker2.Getsalary());
        
    }
}