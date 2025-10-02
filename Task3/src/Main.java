import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        Room room1 = new Room(2, 1);
        Room room2 = new Room(4,2);
        Room room3 = new Room(1,1);

        ArrayList<Room> roomList = new ArrayList<>();
        roomList.add(room1);
        roomList.add(room2);
        roomList.add(room3);

        Building building = new Building(roomList, 2);

        System.out.println("Total lamps: " + countLampsInBuilding(building));
        System.out.println("Total windows: " + countWindowsInBuilding(building));
        System.out.println("Total rooms: " + countRoomsInBuilding(building));
        System.out.println("Is the building normal? " + isNormal(building));
    }

    public static int countLampsInBuilding(Building b){
        int totalLamps = 0;
        for (Room r : b.getRooms()){
            totalLamps += r.getNumberOfLamps();
        }
        return totalLamps;
    }

    public static int countWindowsInBuilding(Building b){
        int totalWindows = 0;
        for (Room r : b.getRooms()){
            totalWindows += r.getNumberOfWindows();
        }
        return totalWindows;
    }

    public static int countRoomsInBuilding(Building b){
        return b.getRooms().size();
    }

    public static boolean isNormal(Building b){
        return b.getNumberOfFloors() <= b.getRooms().size();
    }
}
