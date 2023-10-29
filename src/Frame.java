/*******************************************************************
 Name: Aly Ashour
 Student Number: 251 292 647
 Date: October 29, 2023,
 Description:
 ********************************************************************/

public class Frame {
    private final BitField id, data;

    public Frame(int id, Data data){
        //this.id = id.toBitField();
        this.id = new BitField(ID.getTotalBitCount(), id);
        this.data = data.toBitField();
    }

    @Override
    public String toString(){
        return String.format(
                "Frame Binary | id: %s, data: %s",
                id, data
        );
    }
}
