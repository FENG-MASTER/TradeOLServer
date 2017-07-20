package Message;

import java.io.Serializable;

/**
 * Created by admin on 2017/7/19.
 */
public class BaseMessage implements Serializable {


    private static final long serialVersionUID = 2777793869584338873L;

    private int ID;

    private byte[] data;


    public BaseMessage(int ID, byte[] data) {
        this.ID = ID;
        this.data = data;
    }

    public BaseMessage() {
    }


    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public byte[] getData() {
        return data;
    }

    public void setData(byte[] data) {
        this.data = data;
    }
}
