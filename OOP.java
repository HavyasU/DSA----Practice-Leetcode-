class KeyBoard {
    int keys;
    String color; // instance variables

    public KeyBoard() {
        keys = 100;
        color = "White";
    }

    public void pressed() {
        System.out.println("Key Pressed" + color);
    }

    public void throwIt() {

        System.out.println("Throw it!");
        keys = 85;
    }

}

class AdvncKeyBoard extends KeyBoard {
    public void hitNum() {
        System.out.print("Sent Num");
    }

    public void throwIt() {

        System.out.println("Throw it HAaard!");
        keys = 85;
    }

    public void throwIt(int key) {

        System.out.println("Throw it HAaard!");
        this.keys = key;
    }

}

public class OOP {
    public static void main(String args[]) {

        // int num = 8;

        KeyBoard newKeyBoard = new KeyBoard();

        newKeyBoard.pressed();
        System.out.println("Before Thowing " + newKeyBoard.keys);

        newKeyBoard.throwIt();
        System.out.println("After Thowing " + newKeyBoard.keys);

        // System.out.println("Hit Number ");
        // newKeyBoard.hitNum();newKeyBoard.setKeys(0);
    }

}
