package Message.impl;

import Message.BaseMessage;
import Message.interf.IMessageHandler;
//import BaseMessage;

/**
 * Created by admin on 2017/7/20.
 */
public class MessageHandler implements IMessageHandler {


    @Override
    public boolean handlerMessage(BaseMessage message) {
        return false;
    }
}
