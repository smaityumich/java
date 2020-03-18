class Example2 {
    private int var;
    
    public Example2(){
        this.var = 10;
    }

    public Example2(int v){
        this.var = v;
    }

    public int getValue(){
        return var;
    }

    public static void main(String[] args) {
        Example2 obj1 = new Example2();
        Example2 obj2 = new Example2(100);
        System.out.println(obj1.getValue());
        System.out.println(obj2.getValue());
    }

}