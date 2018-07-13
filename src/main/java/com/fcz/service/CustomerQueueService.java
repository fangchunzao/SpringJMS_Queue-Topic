package com.fcz.service;

import com.fcz.model.People;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Service;


/**
 * @author FangChunZao
 * @Description:
 * @date 2018/7/6
 */
@Service
public class CustomerQueueService {

    @JmsListener(destination = "MessageQueueTest1",containerFactory = "queueListenerFactory")
    public void sendPeople(People people) {
        System.out.println("成功监听MessageQueueTest1消息队列，准备发送信息1");
        System.out.println("监控People --- Name : " + people.getName() + " Email : " + people .getEmail());
    }

    @JmsListener(destination = "MessageQueueTest1", containerFactory = "queueListenerFactory")
    public void sendEmail(People  people) {
        System.out.println("成功监听MessageQueueTest1消息队列，准备发送信息2");
        System.out.println("监控People --- Name : " + people.getName() + " Email : " + people .getEmail());
    }

}
