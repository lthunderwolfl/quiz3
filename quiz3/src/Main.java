import java.util.List;

public class Main {
    public static void main(String[] args) {
        PersonManager personManager = new PersonManager();
        List<Person> persons = personManager.getPersons();
        Person yourPerson = new Person("Younis", "Mirani");
        Room room = new Room(101, 2);
        HotelManager hotelManager = new HotelManager();
        hotelManager.checkIn(yourPerson.getId(), room);
        hotelManager.checkIn(persons.get(0).getId(), room);
        hotelManager.displayInfo();
    }
}
