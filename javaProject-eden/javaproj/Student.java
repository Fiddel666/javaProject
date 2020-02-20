package javaproj;
class Student{

    private String name;
    private String id;
    private String course;
    private int year;
    
    public Student(String name,String id,String course,int year){
        this.name=name;
        this.id=id;
        this.course=course;
        this.year=year;
    }
 
    public Student (){
         this.name="";
         this.id="";
         this.course="";
         this.year=9999;
    }
    
    public String Getname(){
        return this.name;
    }
    
    public String Getid(){
        return this.id;
    }
   
    public String Getcourse(){
        return this.course; 
    }
    
    public int Getyear(){
        return this.year;    
    }
    
    public void Setname(String name){
        this.name=name;
    }
    
    public void Setid(String id){
        this.id=id;
    }
    
    public void Setcourse(String course){
        this.course=course;
    }
   
    public void Setyear(int year){
        this.year=year;
    }
}