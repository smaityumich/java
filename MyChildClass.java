class MyParentClass {
    MyParentClass(){
        System.out.println("MyParentClass Constructor");
    }
}

class MyChildClass extends MyParentClass {
    MyChildClass() {
        System.out.println("MyChildClass COnstructor");
    }
    public static void main(String[] args) {
        new MyChildClass();
    }
}