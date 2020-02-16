import java.util.Scanner;

class College{
    
    public Campus Tech_campus = new Campus();
    public Campus Academ_campus = new Campus();
    
    Scanner in = new Scanner(System.in);
    
    public College() {}
    
    
	public void Maim_menu() {
		int choose;
		boolean end = false;
		
		while(!end) {
            System.out.println("1. Technology campus");
            System.out.println("2. Academic campus");
            System.out.println("3. Exit");
            
            choose = Integer.parseInt(in.nextLine());
            
            switch(choose) {
                case 1:
                    Tech_campus.menu();
                    break;
                case 2:
                    Academ_campus.menu();
                    break;
                case 3:
                    end = true;
                    break;
                default:
                    System.out.println("Error");
		    }
		}
	}
    
}