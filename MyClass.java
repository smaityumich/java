public class MyClass{
    int age;
    String name;

    MyClass(){
        this("Beginnersbook.com");
    }

    MyClass(String s){
        this(s, 6);
    }

    MyClass(String s, int age){
        this.name = s;
        this.age = age;
    }

    public static void main(String[] args) {
        MyClass obj = new MyClass();
        System.out.println(obj.name + " "+ obj.age);
    }
}