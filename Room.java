public class Room {
    private static int nextRoomId = 201;

    private int roomId;
   private boolean isOccupied;
    private int patientId;

    public Room(int patientId) {
        this.roomId = nextRoomId++;
        this.isOccupied = true;
        this.patientId = patientId;
         System.out.println("Room assigned Successfully");
    }

    public int getRoomId() { return roomId; }
       public boolean isOccupied() { return isOccupied; }
       public int getPatientid() { return patientId; }

  

    public void vacateRoom() {
        this.patientId = -1;
        this.isOccupied = false;
    }

    public void display() {
        System.out.println("┌──────────────────────────────┐");
        System.out.println("│        ROOM DETAILS          │");
        System.out.println("├──────────────────────────────┤");
        System.out.printf("│ Room ID   : %-16d│%n", roomId);
        System.out.printf("│ Status    : %-16s│%n", isOccupied ? "Occupied" : "Available");
        System.out.println("└──────────────────────────────┘");
    }
}
