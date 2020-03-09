package com.ibsplc.consumer.jmsconsumer;

import org.springframework.jms.annotation.EnableJms;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
@EnableJms
public class JmsMessageConsumer {

    @JmsListener(destination = "notification.queue")
    public void listener(String message){
    	System.out.println("Consumed Message from Queue - notification.queue -->"+message);
    }
}
