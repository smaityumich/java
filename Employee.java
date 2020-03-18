public class Employee {
    int empId;
    String empName;

    //Parametrized constructor
    Employee(int id, String name){
        this.empId = id;
        this.empName = name;
    }
    void info(){
        System.out.println("Id: " + this.empId + " Name: "+ this.empName);
    }
    public static void main(String[] args) {
        Employee obj1 = new Employee(100, "Megan");
        Employee obj2 = new Employee(101, "Derek");
        obj1.info();
        obj2.info();
    }

}