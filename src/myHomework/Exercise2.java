package myHomework;

public class Exercise2 {

    public static void main(String[] args) {

        Box littleBox = new Box(5, 10, 15);
        Box box = new Box(15, 15, 15);
        Box largeBox = new Box(30, 30, 40);
        Box envelope = new Box(3, 4, 0);

        System.out.println(littleBox.getBoxType());
        System.out.println(box.getBoxType());
        System.out.println(largeBox.getBoxType());
        System.out.println(envelope.getBoxType());


    }
}
