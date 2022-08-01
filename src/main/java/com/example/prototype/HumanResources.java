package com.example.prototype;

import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.stereotype.Component;

@Component
public abstract class HumanResources {

    @Lookup
    public MyWorker getWorker(String uniqueParameter) {
        return null;
    }
}
