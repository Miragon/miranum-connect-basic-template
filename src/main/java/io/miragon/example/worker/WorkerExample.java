package io.miragon.example.worker;

import io.miragon.miranum.connect.worker.api.Worker;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class WorkerExample {

    @Worker(type = "greet")
    public WorkerOutput greet(WorkerInput input) {
        String greeting = "Hello " + input.getName() + "!";
        log.info(greeting);
        return new WorkerOutput(greeting);
    }
}