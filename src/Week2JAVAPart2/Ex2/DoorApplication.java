package Week2JAVAPart2.Ex2;

public class DoorApplication {

    public static void main(String[] args) {
        Door door = new Door(2);
        Key key = new Key();
        key.open(door);
    }
}
