package com.feichuang.ipush.server.config;

import com.feichuang.ipush.server.service.impl.CxfServiceImpl;
import org.apache.cxf.bus.spring.SpringBus;
import org.apache.cxf.jaxws.EndpointImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.xml.ws.Endpoint;

/**
 * Created by wenzhiwei on 17-3-21.
 */
@Configuration
public class CxfServiceConfig {

    @Autowired
    private SpringBus bus;

    @Bean
    public Endpoint endpoint() {
        EndpointImpl endpoint = new EndpointImpl(bus, new CxfServiceImpl());
        endpoint.publish("/cxf");
        return endpoint;
    }

}
