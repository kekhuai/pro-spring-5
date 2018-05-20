package xyz.kekhuay.prospring5.ch3;

import org.springframework.context.support.GenericXmlApplicationContext;

import xyz.kekhuay.prospring5.ch2.MessageProvider;

public class DeclareSpringComponents {

    public static void main(String... args) {
        GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
        ctx.load("classpath:spring/app-context-annotation.xml");
        ctx.refresh();

        MessageProvider messageProvider = ctx.getBean("provider", MessageProvider.class);
        System.out.println(messageProvider.getMessage());
        ctx.close();
    }

}
