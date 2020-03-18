public class Hello {
    String name;

    Hello(){
        this.name = "Beginnersbook.com";
        System.out.println("Check");
    }
    public static void main(String[] args) {
        Hello obj = new Hello();
        System.out.println(obj.name);
    }
}
