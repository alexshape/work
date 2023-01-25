package ru.sema.proj1;

import java.util.concurrent.TimeUnit;

public class CrptApi {

    private TimeUnit timeUnit;
    private int requestLimit;


    public CrptApi(TimeUnit timeUnit, int requestLimit) {
        this.timeUnit = timeUnit;
        this.requestLimit = requestLimit;
    }


}
