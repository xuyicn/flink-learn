package com.ns.bdp.flink.kafka.commons.operators;

import lombok.extern.slf4j.Slf4j;
import org.apache.flink.streaming.api.functions.sink.SinkFunction;

@Slf4j
public class SinkString implements SinkFunction<String> {

    @Override
    public void invoke(String value, Context context) throws Exception {
        log.info("sink print:" + value);
    }
}
