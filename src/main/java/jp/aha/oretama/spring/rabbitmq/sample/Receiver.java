package jp.aha.oretama.spring.rabbitmq.sample;

import java.util.concurrent.CountDownLatch;

import org.springframework.stereotype.Component;

/**
 * @author aha-oretama on 2018/03/15.
 */
@Component
public class Receiver {

    private CountDownLatch latch = new CountDownLatch(1);

    public void receiveMessage(String message) {
        System.out.println("Received <" + message + ">");
        latch.countDown();
    }

    public CountDownLatch getLatch() {
        return latch;
    }

}
