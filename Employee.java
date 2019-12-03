public class Employee {
    private String Name;
    private String LastName;
    private double Monthlysal;

    public Employee(String name, String lastname, double salary) {
        this.Name = name;

        this.LastName = lastname;

        if(salary > 0.0) {
            this.Monthlysal = salary;
        }

    }

    public void SetfirstName(String name1) {
        this.Name = name1;
    }

    public String GetfirstName() {
        return this.Name;
    }

    public void SetlastName(String name2) {
        this.LastName = name2;
    }

    public String GetlastName() {
        return this.LastName;
    }

    public void Setsalary(double salary1) {
        this.Monthlysal = salary1;
    }

    public double Getsalary() {
        return Monthlysal;
    }

    public void raise(double raise) {
        if(raise > 0) {
            Monthlysal = Monthlysal * raise / 100 + Monthlysal;
        }
    }
}