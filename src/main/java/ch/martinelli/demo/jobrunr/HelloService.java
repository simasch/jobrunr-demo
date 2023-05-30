package ch.martinelli.demo.jobrunr;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class HelloService {

    private static final Logger LOGGER = LoggerFactory.getLogger(HelloService.class);

    public void printHello() {
        LOGGER.info("Hello, world!");
    }
}
