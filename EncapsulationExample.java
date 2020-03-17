class EmployeeCount {
    private int numOfEmployees = 0;
    public void setNoOfEmployees (int count){
        numOfEmployees = count;
    }

    public int getNoOfEmployees(){
        return numOfEmployees;
    }
}

public class EncapsulationExample {
    public static void main(String[] args) {
     EmployeeCount obj = new EmployeeCount();
     obj.setNoOfEmployees(5000);
     System.out.println("Number of Employees: "+obj.getNoOfEmployees());   
    }
}