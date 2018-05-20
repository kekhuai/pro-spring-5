package xyz.kekhuay.prospring5.ch3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import xyz.kekhuay.prospring5.ch2.MessageProvider;

@Service("provider")
public class ConfigurableMessageProvider implements MessageProvider {

    private final String message;

    @Autowired
    public ConfigurableMessageProvider(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }

}
