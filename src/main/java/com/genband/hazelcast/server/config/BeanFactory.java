package com.genband.hazelcast.server.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.genband.util.hazelcastclient.service.ReplicateDataAccessServiceFactory;
import com.genband.util.hazelcastclient.service.ReplicateDataService;
import com.genband.util.hazelcastclient.service.ReplicateDataServiceType;

@Configuration
public class BeanFactory {

    @Bean
    public ReplicateDataService getReplicateDataService() {
        ReplicateDataService service = null;
        try {
            service = ReplicateDataAccessServiceFactory.getService(ReplicateDataServiceType.HAZELCAST_DATA_CLUSTER);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return service;
    }

}
