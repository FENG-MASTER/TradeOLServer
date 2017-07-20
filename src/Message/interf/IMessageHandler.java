package Message.interf;

//import BaseMessage;

import Message.BaseMessage;

/**
 * Created by admin on 2017/7/20.
 */
public interface IMessageHandler {

    boolean handlerMessage(BaseMessage message);

}
