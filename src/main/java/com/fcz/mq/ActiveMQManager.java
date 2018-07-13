package com.fcz.mq;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsMessagingTemplate;
import org.springframework.stereotype.Component;

import javax.jms.Destination;


/**
 * @author FangChunZao
 * @Description:
 * @date 2018/7/6
 */
@Component
public class ActiveMQManager{

    @Autowired
    private JmsMessagingTemplate jmsMessagingTemplate;

    /**
     * 发送数据
     */
    public void send(Destination destination, Object date) {
        this.jmsMessagingTemplate.convertAndSend(destination,date);
    }

}
