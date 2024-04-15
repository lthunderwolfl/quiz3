import java.util.HashMap;
import java.util.Map;

public class HotelManager {
    private Map<String, Room> guests;

    public HotelManager() {
        this.guests = new HashMap<>();
    }

    public void checkIn(String personId, Room room) {
        if (room.isAvailable()) {
            guests.put(personId, room);
            room.setAvailable(false);
        } else {
            System.out.println("The room is not available.");
        }
    }

    public void checkOut(String personId) {
        if (guests.containsKey(personId)) {
            Room room = guests.get(personId);
            room.setAvailable(true);
            guests.remove(personId);
        } else {
            System.out.println("The person is not checked-in.");
        }
    }

    public void displayInfo() {
        for (Map.Entry<String, Room> entry : guests.entrySet()) {
            System.out.println("Person ID: " + entry.getKey() +
                    ", Room Number: " + entry.getValue().getRoomNumber());
        }
    }
}