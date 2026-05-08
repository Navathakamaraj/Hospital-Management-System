import java.util.ArrayList;

public class Billing {

    public static void generate(Patient p, ArrayList<Room> rooms) {

        int doctorFee = 300;
        int medicineFee = 1000;
        int roomFee = 0;

        for (Room r : rooms) {
            if (r.getPatientid() == p.getPatientId() && r.isOccupied()) {
                roomFee = 500;
                break;
            }
        }

        int total = doctorFee + medicineFee + roomFee;

        System.out.println("\n--- BILL RECEIPT ---");
        System.out.println("Doctor Fee   : " + doctorFee);
        System.out.println("Medicine Fee : " + medicineFee);
        System.out.println("Room Fee     : " + roomFee);
        System.out.println("----------------------");
        System.out.println("TOTAL        : " + total);
    }
}
