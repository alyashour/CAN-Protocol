/*******************************************************************
 Name: Aly Ashour
 Date: October 29, 2023,
 Description:
 Main class
 ********************************************************************/

public class Main {
    public static void main(String[] args) {
        Frame f = new Frame(ID.makeID(ID.debug, 3), new Data(-2, -3));
        System.out.println(f);
    }
}
