package io.renren.mq;

/**
 * @author zhaoxiubin
 * @create 2022-11-14 11:37
 * @desc 消息中间件常量
 **/
public class RffssMqConstant {
    /**
     * 主题：外网申请
     */
    public final static String TOPIC_OUT_APPLY = "TOPIC_OUT_APPLY";

    /**
     * 主题：外网变更
     */
    public final static String TOPIC_OUT_CHANGE = "TOPIC_OUT_CHANGE";

    /**
     * 主题：外网注销
     */
    public final static String TOPIC_OUT_CANCEL = "TOPIC_OUT_CANCEL";

    /**
     * 主题：内网申请
     */
    public final static String TOPIC_IN_APPLY = "TOPIC_IN_APPLY";

    /**
     * 主题：内网变更
     */
    public final static String TOPIC_IN_CHANGE = "TOPIC_IN_CHANGE";

    /**
     * 主题：内网注销
     */
    public final static String TOPIC_IN_CANCEL = "TOPIC_IN_CANCEL";

    /**
     * 主题：内网受理
     */
    public final static String TOPIC_IN_ACCEPT = "TOPIC_IN_ACCEPT";

    /**
     * 主题：内网审核
     */
    public final static String TOPIC_IN_CHECK = "TOPIC_IN_CHECK";

}
