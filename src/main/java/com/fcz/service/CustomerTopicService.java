package com.fcz.service;

import com.fcz.model.People;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Service;


/**
 * @author FangChunZao
 * @Description: topic 消费者
 * @date 2018/7/6
 */
@Service
public class CustomerTopicService {

    @JmsListener(destination = "MessageTopicTest1", containerFactory = "topicListenerFactory")
    public void receiveTopic(People people) {
        System.out.println("成功监听MessageTopicTest1消息队列，准备发送信息1");
        System.out.println("监控People --- Name : " + people.getName() + " Email : " + people .getEmail());
    }

    @JmsListener(destination = "MessageTopicTest1", containerFactory = "topicListenerFactory")
    public void sendEmail(People  people) {
        System.out.println("成功监听MessageTopicTest1消息队列，准备发送信息2");
        System.out.println("监控People --- Name : " + people.getName() + " Email : " + people .getEmail());
    }

}
