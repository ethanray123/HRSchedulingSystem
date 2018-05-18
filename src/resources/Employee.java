package resources;

/**
 *
 * @author Ethan
 */
public class Employee {
    
    public Employee(int id, int sal, String fname, String lname, String pos, String projTitle, String projType){
            this.id = id;
            //monthly salary is 25000, 30000, 35000
            //monthly tax rate is 
            this.monthlySalary = sal;
            //calculating tax
            double annualIncome = monthlySalary*12;
            double excess = annualIncome - 250000;
            double annualTax = (0.20*excess);
            double monthlyTax = annualTax / 12;
            this.monthlyTax = monthlyTax;
            //lookup table sss
            this.sss = 581.30;
            this.philHealth = 343.75;
            this.pagIbig = 100;
            this.projectType = projType;
            this.isInProject = false;
            this.firstName = fname;
            this.lastName = lname;
            this.position = pos;
            this.projectTitle = projTitle;
    }
    
    protected final int id;
    protected double monthlySalary;
    protected double monthlyTax;
    protected double sss;
    protected double philHealth;
    protected double pagIbig;
    protected boolean isInProject;
    protected String projectTitle;
    protected String projectType;
    protected String firstName;
    protected String lastName;
    protected String position;

    public int getId(){
        return id;
    }

    public double getMonthlyTax() {
        return monthlyTax;
    }

    public void setMonthlyTax(double monthlyTax) {
        this.monthlyTax = monthlyTax;
    }

    public double getSss() {
        return sss;
    }

    public void setSss(double sss) {
        this.sss = sss;
    }

    public double getPhilHealth() {
        return philHealth;
    }

    public void setPhilHealth(double philHealth) {
        this.philHealth = philHealth;
    }

    public double getPagIbig() {
        return pagIbig;
    }

    public void setPagIbig(double pagIbig) {
        this.pagIbig = pagIbig;
    }

    public boolean getIsInProject(){
        return isInProject;
    }
    
    public String getProjectTitle() {
        return projectTitle;
    }
    
    public String getProjectType() {
        return projectType;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPosition() {
        return position;
    }
    
    public double calculateSalary() {
        double salary = monthlySalary - monthlyTax - sss - philHealth - pagIbig;
        return salary;
    }
}
