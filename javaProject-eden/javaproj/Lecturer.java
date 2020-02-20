package javaproj;
class Lecturer{

    private String name;
    private String course;
    
    public Lecturer(String name, String course){
        this.name=name;
        this.course=course;
    }
    
    public Lecturer() {
        this.name = "";
        this.course = "";
    }
    
    // gets
    public String Getname() {
        return this.name;
    }
    
    public String Getcourse() {
        return this.course;
    }
    // gets
    
    // sets
    public void Setname(String name) {
        this.name=name;
    }
   
    public void Setcourse(String course) {
        this.course=course;
    }
    // sets
    
}