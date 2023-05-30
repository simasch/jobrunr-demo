package ch.martinelli.demo.jobrunr;

import org.jobrunr.scheduling.JobScheduler;
import org.jobrunr.scheduling.cron.Cron;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class JobStarter implements ApplicationRunner {

    private final JobScheduler jobScheduler;
    private final HelloService helloService;

    public JobStarter(JobScheduler jobScheduler, HelloService helloService) {
        this.jobScheduler = jobScheduler;
        this.helloService = helloService;
    }

    @Override
    public void run(ApplicationArguments args) {
        jobScheduler.scheduleRecurrently(Cron.every15seconds(), helloService::printHello);
    }
}
