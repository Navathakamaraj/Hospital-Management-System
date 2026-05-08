import java.util.ArrayList;
 
public class Patient {
    private static int nextNumber = 1;
    private int patientId;
    private String name;
    private String problem;
    private int doctorId;
 
    public Patient(String name, String problem, ArrayList<Doctors> doctorsList) {
        this.patientId = nextNumber++;
        this.name      = name;
        this.problem   = problem;
        this.doctorId  = Doctors.getDoctorIdByProblem(problem, doctorsList);
    }
 
    
    public int    getPatientId() { return patientId; }
    public String getName()      { return name; }
    public String getProblem()   { return problem; }
    public int    getDoctorId()  { return doctorId; }
 
    
    
 
    public void display() {
        System.out.println("┌──────────────────────────────┐");
        System.out.println("│       PATIENT DETAILS        │");
        System.out.println("├──────────────────────────────┤");
        System.out.printf( "│ Patient ID : %-16d│%n", patientId);
        System.out.printf( "│ Name       : %-16s│%n", name);
        System.out.printf( "│ Problem    : %-16s│%n", problem);
        System.out.printf( "│ Doctor ID  : %-16s│%n",
                           doctorId == -1 ? "Not Assigned" : String.valueOf(doctorId));
        System.out.println("└──────────────────────────────┘");
    }
}
 