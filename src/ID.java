import java.util.ArrayList;
import java.util.Arrays;

/*******************************************************************
 Name: Aly Ashour
 Student Number: 251 292 647
 Date: October 29, 2023,
 Description:
 ********************************************************************/

public class ID {
    public final static int active = 0b00_000_000_000; // = 0 = 2^0
    public final static int charging = 0b01_000_000_000; // = 512 = 2^9
    public final static int idle = 0b10_000_000_000; // = 1024 = 2^10
    public final static int debug = 0b11_000_000_000; // = 1536 = 2^9 + 2^10
    private static final ArrayList<Integer> states = new ArrayList<>(Arrays.asList(active, charging, idle, debug));
    protected BitField state, command;
    final private static int STATE_NUM_BITS = 2, COMMAND_NUM_BITS = 9; // this must add to 11 or 29

    public static int makeID(int state, int command){
        if (states.contains(state)) return state + command;
        else throw new IllegalArgumentException("State parameter not valid. " + state + " is not a valid state");
    }

    public static int getTotalBitCount(){
        return STATE_NUM_BITS + COMMAND_NUM_BITS;
    }
}
