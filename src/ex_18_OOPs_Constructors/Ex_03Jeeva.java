package ex_18_OOPs_Constructors;

public class Ex_03Jeeva
{
    String dep;
    int emp;

// parameterized constructor
    Ex_03Jeeva (String dep_name, int emp_Count)
    {
        this.dep = dep_name;
        this.emp = emp_Count;
    }
    // Default constructor
    Ex_03Jeeva() {
      dep = "Unknown";
      emp = 0;
    }
    public static void main(String[] args)
    {
        //  Use parameterized constructor
        Ex_03Jeeva jc = new Ex_03Jeeva ("IT", 100);  // This will now work
        System.out.println("Department: " + jc.dep);
        System.out.println("Employee Count: " + jc.emp);
        //  Use default  constructor
        Ex_03Jeeva jv = new Ex_03Jeeva ();
        System.out.println("Department: " + jv.dep);
        System.out.println("Employee Count: " + jv.emp);
    }

}
