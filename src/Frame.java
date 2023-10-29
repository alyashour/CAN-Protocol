/*******************************************************************
 Name: Aly Ashour
 Date: October 29, 2023,
 Description:
 ********************************************************************/

/**
 * A data class representing a CAN frame
 */
public class Frame {
    private final BitField id, data;

    /**
     * Constructor takes two arguments
     * @param id    in integer id
     * @param data  a data field containing data
     */
    public Frame(int id, Data data){
        this.id = new BitField(ID.getTotalBitCount(), id);
        this.data = data.toBitField();
    }

    /**
     * String bb
     * @return
     */
    @Override
    public String toString(){
        return String.format(
                "Frame Binary | id: %s, data: %s",
                id, data
        );
    }
}
