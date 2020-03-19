class Teacher2 {
    private String designation = "Teacher";
    private String collageName = "UMich";
    
    protected String getDesignation(){
        return this.designation;
    }

    protected void setDesignation(String designation){
        this.designation = designation;
    }

    protected String getCollageName(){
        return this.collageName;
    }

    protected void setCollageName(String collageName){
        this.collageName = collageName;
    }


}






public class JavaExample extends Teacher2 {
    String mainSubject = "Physics";
    public static void main(String args[]) {
        JavaExample obj = new JavaExample();
        System.out.println(obj.getCollageName());
        System.out.println(obj.getDesignation());
        System.out.println(obj.mainSubject);
    }
}