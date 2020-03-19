class ParentClass {
    ParentClass(){
        System.out.println("Constructor of parent");
    }
    void disp(){
        System.out.println("Parent method");
    }
}

class ChildClass extends ParentClass {
    ChildClass(){
        System.out.println("Constructor of child class");
    }

    void disp(){
        System.out.println("Child method");
        super.disp();
    }

    public static void main(String[] args) {
        ChildClass obj = new ChildClass();
        obj.disp();
    }
}