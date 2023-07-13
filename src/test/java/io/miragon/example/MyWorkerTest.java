package io.miragon.example;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

@Slf4j
public class MyWorkerTest {

    @Test
    public void testDoSomething() {
        MyWorker myWorker = new MyWorker();

        DoSomethingCommand doSomethingCommand = new DoSomethingCommand("test");
        DoSomethingResult expectedDoSomethingResult = new DoSomethingResult("test result");

        DoSomethingResult actualDoSomethingResult = myWorker.doSomething(doSomethingCommand);

        assertEquals(expectedDoSomethingResult.getResult(), actualDoSomethingResult.getResult());
    }
}