package com.example.prototype;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@RequiredArgsConstructor
@Component
@Scope("prototype")
public class MyWorker {
    @Autowired
    private ServiceA serviceA;
    @Autowired
    private ServiceB serviceB;
    @Autowired
    private ServiceC serviceC;

    private final String uniqueParameter;

    public void doJob() {
        System.out.println("WITH PARAMETER: " + uniqueParameter);
        serviceA.doAstuff();
        serviceB.doBstuff();
        serviceC.doCstuff();
    }
}
