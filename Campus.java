
import java.util.Scanner;

class Campus{
    private Lecturer[] arr_of_lecturers = new Lecturer[10];
    private Student[] arr_of_students = new Student[10];
    private String[] arr_of_courses = new String[] {
                                                    "Software engineering",
                                                    "Electrical Engineering",
                                                    "Structural engineering",
                                                    "Water Engineering",
                                                    "Space Science"
                                                };
    int choose;
    
    int loc;
    Scanner in = new Scanner(System.in);
    
	/* constractors */
    public Campus() {
        for(int i = 0; i < arr_of_lecturers.length; i++) {
            arr_of_lecturers[i] = new Lecturer();
        }
		
        for(int i = 0; i < arr_of_students.length; i++) {
            arr_of_students[i] = new Student();
        }
    }
    /* constractors */
	
	/* GETS */
    public Lecturer[] get_arr_of_lecturers() {
        return this.arr_of_lecturers;
    }
    /* GETS */
	
	/* SETS */
    public void set_arr_of_lecturers(Lecturer[] lecturers) {
        this.arr_of_lecturers = lecturers;
    }
    /* SETS */
	
	/* TO STRING */
    public void ShowPeople() {
    	for(int i=0;i<arr_of_students.length;i++) {
    	    System.out.println("Student " + (i + 1));
    		System.out.println("Name :" + arr_of_students[i].Getname() + "\nID:" + arr_of_students[i].Getid() + "\nCourse:" + arr_of_students[i].Getcourse());
    	    System.out.println("");
    	}
    	System.out.println("\n");
    	
    	for(int i=0;i<arr_of_lecturers.length;i++) {
    		System.out.println("Lecturer " + (i + 1));
    		System.out.println("Name:" + arr_of_lecturers[i].Getname() + "\nCourse:" + arr_of_lecturers[i].Getcourse());
    		System.out.println("");
    	}
    	System.out.println("\n\n");
    }
    /* TO STRING */
	
    public void Register_lecturer() {
		loc = -1;
		
        for(int i = 0; i < arr_of_lecturers.length; i++) {
            if(arr_of_lecturers[i].Getname() == "" && arr_of_lecturers[i].Getcourse() == "") {
                loc = i;
                break;
            }
        }
            
        if(loc == -1) {
            System.out.println("No place");
            return;
        }
            
        System.out.println("Enter Lecturer name: ");
        String name = in.nextLine();
			
        System.out.println("Enter Lecturer course: ");
        String course = choose_curs();
            
		arr_of_lecturers[loc] = new Lecturer(name,course);
		
        System.out.println("Lecturer Registed");
	}
	
    public void Register_Student() {
		loc = -1;
		
        for(int i = 0; i < arr_of_students.length; i++) {
			if(arr_of_students[i].Getname() == "" && arr_of_students[i].Getyear() == 9999) {
				loc = i;
				break;
			}
		}
		
		if(loc == -1) {
			System.out.println("No place");
			return;
		}
		
		System.out.println("Enter student name: ");
		String name = in.nextLine();
		
		System.out.println("Enter student ID: ");
		String id = in.nextLine();
		
		System.out.println("Enter student course: ");
		String course = choose_curs();
		
		System.out.println("Enter student year: ");
		int year = Integer.parseInt(in.nextLine());
		
		arr_of_students[loc] = new Student(name, id, course, year);
		
		System.out.println("Student Registed");
    }
	
    public void Delete_lecturer() {
		loc = -1;
		
		System.out.println("Enter Lecturer name: ");
        String name = in.nextLine();
			
        System.out.println("Enter Lecturer course: ");
        String course = choose_curs();
			
        for(int i = 0; i < arr_of_lecturers.length; i++) {
            if(arr_of_lecturers[i].Getname() == name && arr_of_lecturers[i].Getcourse() == course) {
                arr_of_lecturers[i] = new Lecturer();
                System.out.println("Lecturer deleted");
            }
        }
        
		System.out.println("No such lecturer");
    }
    
    public void Delete_Student() {
		loc = -1;
		
        System.out.println("Enter student name: ");
        String name = in.nextLine();
		
        System.out.println("Enter student ID: ");
        String id = in.nextLine();
		
        System.out.println("Enter student course: ");
        String course = choose_curs();
		
        System.out.println("Enter student year: ");
        int year = Integer.parseInt(in.nextLine());
		
		for(int i = 0; i < arr_of_students.length; i++) {
            if((arr_of_students[i].Getname().equals(name)) ||
				(arr_of_students[i].Getcourse().equals(course)) ||
				(arr_of_students[i].Getid().equals(id)) ||
				(arr_of_students[i].Getyear()==year)) {
					
					arr_of_students[i] = new Student();
					System.out.println("Student deleted");
					return;
            }
        }
		
		System.out.println("No such student");
    }
    
    public void menu() {
        System.out.println("1.Remove student");
        System.out.println("2.Add student");
        System.out.println("3.Remove lecturer");
        System.out.println("4.Add lecturer");
        
        choose = Integer.parseInt(in.nextLine());
        String name = new String();
        String id = new String();
        String course = new String();
        int year;
        
        switch (choose) {
            case 1:
                System.out.println("Remove student");
				Delete_Student();
                break;
            case 2:
                System.out.println("Add student");
                Register_Student();
                break;
            case 3:
                System.out.println("Remove lecturer");
				Delete_lecturer();
                break;
            case 4:
                System.out.println("Add lecturer");
                Register_lecturer();
                break;
            default:
				System.out.println("Error");
		}
    }
    
    public String choose_curs() {
        for(int i = 0; i < arr_of_courses.length; i++) {
            System.out.println((i + 1) + ". " + arr_of_courses[i]);
        }
        
        choose = Integer.parseInt(in.nextLine());
        
        switch(choose) {
            case 1:
                return arr_of_courses[choose - 1];
            case 2:
                return arr_of_courses[choose - 1];
            case 3:
                return arr_of_courses[choose - 1];
            case 4:
                return arr_of_courses[choose - 1];
            case 5:
                return arr_of_courses[choose - 1];
            default:
                System.out.println("Error");
                return "Error";
        }
    }
}


