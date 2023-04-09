package io.renren.mq.listener;

import io.renren.modules.rffss.entity.NfRecordEntity;
import io.renren.mq.RffssMqConstant;
import lombok.extern.slf4j.Slf4j;
import org.apache.rocketmq.spring.annotation.ConsumeMode;
import org.apache.rocketmq.spring.annotation.RocketMQMessageListener;
import org.apache.rocketmq.spring.core.RocketMQListener;
import org.springframework.stereotype.Component;

/**
 * @author zhaoxiubin
 * @create 2022-11-14 16:11
 * @desc 外网备案申请消息监听类
 **/
@Slf4j
@Component
@RocketMQMessageListener(consumerGroup = "${rocketmq.producer.groupNameRecord}", topic = RffssMqConstant.TOPIC_OUT_APPLY, consumeMode = ConsumeMode.ORDERLY)
public class OutApplyMqListener implements RocketMQListener<NfRecordEntity> {

    @Override
    public void onMessage(NfRecordEntity nfRecordEntity) {
        log.info("接收到消息，开始消费..BusinId:" + nfRecordEntity.getBusin().getId() + ", RffsspId:" + nfRecordEntity.getRffssp().getId());
        // 一般真实环境这里消费前，得做幂等性判断，防止重复消费
        // 方法一：如果你的业务中有某个字段是唯一的，有标识性，如订单号，那就可以用此字段来判断
        // 方法二：新建一张消费记录表t_mq_consumer_log，字段consumer_key是唯一性，能插入则表明该消息还未消费，往下走，否则停止消费
        // 我个人建议用方法二，根据你的项目业务来定义key，这里我就不做幂等判断了，因为此案例只是模拟，重在分布式事务

    }
}
