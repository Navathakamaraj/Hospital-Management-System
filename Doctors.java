import java.util.ArrayList;
 
public class Doctors {
    private static int nextNumber = 101;
    private int id;
    private String name;
    private String role;
    private boolean assigned;
 
    public Doctors(String name, String role) {
        this.id = nextNumber++;
        this.name = name;
        this.role = role;
        this.assigned=false;
    }
 
    public int getId()      { return id; }
    public String getName() { return name; }
    public String getRole() { return role; }
     public Boolean getassigned() { return assigned; }

     Doctors(){
        this.assigned=true;
     }
 

 
    public static int getDoctorIdByProblem(String problem, ArrayList<Doctors> doctorsList) {
        String p = problem.toLowerCase();
        for (Doctors doc : doctorsList) {
            if (p.contains(doc.getRole().toLowerCase()) && doc.getassigned()==false){
                doc.Doctors();
                return doc.getId();}
            else{
                    System.out.println("Doctors are Assigned");
            }
        }
        return -1;
       
    }


 
    private void Doctors() {
        this.assigned = true;
    }

    public void display() {
        System.out.println("┌──────────────────────────────┐");
        System.out.println("│       DOCTOR DETAILS         │");
        System.out.println("├──────────────────────────────┤");
        System.out.printf( "│ Doctor ID : %-17d│%n", id);
        System.out.printf( "│ Name      : %-17s│%n", name);
        System.out.printf( "│ Role      : %-17s│%n", role);
        System.out.println("└──────────────────────────────┘");
    }
}
 
