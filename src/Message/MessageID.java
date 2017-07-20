package Message;

/**
 * Created by admin on 2017/7/20.
 */
public class MessageID {

    /**
     * 增加售卖条目请求
     */
    public static final int C_CMD_ADD_SELL_REQ=100;
    /**
     * 增加售卖条目应答
     */
    public static final int C_CMD_ADD_SELL_BAK=101;

    /**
     * 购买请求
     */
    public static final int C_CMD_BUY_REQ=102;
    /**
     * 购买请求应答
     */
    public static final int C_CMD_BUY_BAK=103;
    /**
     * 获取售卖条目请求
     */
    public static final int C_CMD_GET_LIST_REQ=104;
    /**
     * 获取售卖条目请求应答
     */
    public static final int C_CMD_GET_LIST_BAK=105;

    /**
     * 撤回寄售请求
     */
    public static final int C_CMD_RECALL_REQ=106;
    /**
     * 撤回寄售请求应答
     */
    public static final int C_CMD_RECALL_BAK=107;

    /**
     * 添加用户请求
     */
    public static final int C_CMD_ADD_USER_REQ=108;

    /**
     * 添加用户请求应答
     */
    public static final int C_CMD_ADD_USER_BAK=108;

}
