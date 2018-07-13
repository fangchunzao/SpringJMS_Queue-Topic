package com.fcz.rest;

import com.fcz.model.People;
import com.fcz.mq.ActiveMQManager;
import org.apache.activemq.command.ActiveMQQueue;
import org.apache.activemq.command.ActiveMQTopic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.jms.Destination;
import java.util.HashMap;
import java.util.Map;

/**
 * @author FangChunZao
 * @Description:
 * @date 2018/7/6
 */
@RestController
@RequestMapping(value = "/test/producer", produces = "application/json")
public class ProducerRest {

    @Autowired
    private ActiveMQManager activeMQManager;

    @RequestMapping(value = "/add/queue", method = RequestMethod.GET)
    public void addQueue() {
        // 设置队列
        Destination destination = new ActiveMQQueue("MessageQueueTest1");
        // 初始化一个类
        People people = new People();
        people.setEmail("1123@email.com");
        people.setName("Name");
        // 加入队列
        activeMQManager.send(destination, people);
    }

    @RequestMapping(value = "/add/topic", method = RequestMethod.GET)
    public void addTopic() {
        Destination destination = new ActiveMQTopic("MessageTopicTest1");
        // 初始化一个类
        People people = new People();
        people.setEmail("1123@email.com");
        people.setName("Name");
        // 加入队列
        activeMQManager.send(destination, people);
    }
}
