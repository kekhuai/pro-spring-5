package xyz.kekhuay.prospring5.ch4;

import org.springframework.context.ApplicationListener;

public class MessageEventListener implements ApplicationListener<MessageEvent> {
    
    @Override
    public void onApplicationEvent(MessageEvent event) {
        System.out.println("Received: " + event.getMsg());
    }
    
}
