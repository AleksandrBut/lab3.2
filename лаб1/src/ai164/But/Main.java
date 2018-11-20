package ai164.But;

public class Main {

    public static void main(String[] args) {
	House house1 = new House(2, 3);
	Flat flat1 = new Flat(1);
	Flat flat2 = new Flat(2);
	Flat flat3 = new Flat(1);
	Room room1 = new Room(25.6, 2.5, 10.5, "Green", 5);
	Room room2 = new Room(10,3, 9.8, "White", 6);
	Room room3 = new Room(15.6, 2.3,10.2, "Blue", 8);
	Room room4 = new Room(45, 3.5,30.5, "White", 12);

	house1.setFlat(flat1);
	house1.setFlat(flat2);
	house1.setFlat(flat3);

	flat1.setRoom(room1);
	flat2.setRoom(room2);
	flat2.setRoom(room3);
	flat3.setRoom(room4);
    }
}
