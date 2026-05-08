import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
 
        ArrayList<Doctors> doctorsList = new ArrayList<>();
        ArrayList<Patient> patientList = new ArrayList<>();
        ArrayList<Room> roomList = new ArrayList<>();
 
        System.out.println("╔══════════════════════════════════════════╗");
        System.out.println("║  WELCOME TO HOSPITAL MANAGEMENT SYSTEM   ║");
        System.out.println("╚══════════════════════════════════════════╝");
 
        int ch = 0;
 
        while (ch != 8) {
            System.out.println("\n╔══════════════════════════════════════════╗");
            System.out.println("║              MAIN MENU                   ║");
            System.out.println("╠══════════════════════════════════════════╣");
            System.out.println("║  1. Add Patient                          ║");
            System.out.println("║  2. Add Doctor                           ║");
            System.out.println("║  3. View Patient Details                 ║");
            System.out.println("║  4. Display Doctor Details               ║");
            System.out.println("║  5. Allocate Room for Patient            ║");
            System.out.println("║  6. Billing                              ║");
            System.out.println("║  7. Fix an Appointment                   ║");
            System.out.println("║  8. vacate Room                          ║");
            System.out.println("║  9. Exit                                 ║");
            System.out.println("╚══════════════════════════════════════════╝");
            System.out.print("Enter your choice: ");
 
            ch = s.nextInt();
            s.nextLine();
 
            switch (ch) {
 
                case 1: {
                    System.out.print("Enter patient name: ");
                    String name = s.nextLine();
                    System.out.print("Enter patient problem (Fever/Organ/Brain/Body Pain): ");
                    String problem = s.nextLine();
 
                    Patient patient = new Patient(name, problem, doctorsList);
                    patientList.add(patient);
                    System.out.println("Patient added! ID: " + patient.getPatientId());
                    break;
                }
 
                case 2: {
                    System.out.print("Enter doctor name: ");
                    String name = s.nextLine();
                    System.out.print("Enter doctor role (Fever/Organ/Brain/Body Pain): ");
                    String role = s.nextLine();
 
                    Doctors doctor = new Doctors(name, role);
                    doctorsList.add(doctor);
                    System.out.println("Doctor added! ID: " + doctor.getId());
                    break;
                }
 
                case 3: {
                    System.out.print("Enter Patient ID: ");
                    int id = s.nextInt();
                    boolean found = false;
                    for (Patient pa : patientList) {
                        if (pa.getPatientId() == id) {
                            pa.display();
                            found = true;
                            break;
                        }
                    }
                    if (!found) System.out.println("Patient not found.");
                    break;
                }
 
                case 4: {
                    System.out.print("Enter Doctor ID: ");
                    int id = s.nextInt();
                    boolean found = false;
                    for (Doctors doc : doctorsList) {
                        if (doc.getId() == id) {
                            doc.display();
                            found = true;
                            break;
                        }
                    }
                    if (!found) System.out.println("Doctor not found.");
                    break;
                }
 
                case 5:{
                      System.out.print("Enter Patient ID: ");
                    int id = s.nextInt();
                    for(Patient pt:patientList){
                    if(pt.getPatientId() ==id){
                    Room room=new Room(id);
                    roomList.add(room);}
                    else{
                        System.out.println("Enter proper Patient ID"); 
                    }
                   }
                    break;

                }
                case 6:{
                    System.out.print("Enter Patient ID: ");
                    int id = s.nextInt();
                  
                    int amount=100;
                     for(Patient pt:patientList){
                    if(pt.getPatientId() ==id){
                        System.out.println("Room fee 100");
                    amount+=100;}
                     
                    amount+=1000;
                    
                    System.out.println("doctor fee=100 + medicine fee =1000" +"total amount"+amount);
                }
                    break;
                }
                case 7: {
                    System.out.println("Feature coming soon.");
                    break;
                }
                case 8:{
                      System.out.print("Enter Patient ID: ");
                    int id = s.nextInt();
                    for(Room r:roomList){
                        if( r.getPatientid()==id)
                           r. vacateRoom();
                        else
                            System.out.println("Enter proper Patient ID");
                    }
                    break;

                }
 
                case 9: {
                    System.out.println("Thank you for using Hospital Management System. Goodbye!");
                    break;
                }
 
                default:
                    System.out.println("Invalid choice. Please enter 1-8.");
            }
        }
 
        s.close();
    }
}
