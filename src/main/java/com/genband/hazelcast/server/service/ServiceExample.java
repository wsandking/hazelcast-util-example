package com.genband.hazelcast.server.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.genband.hazelcast.server.model.ExampleModel;
import com.genband.util.hazelcastclient.service.ReplicateDataService;

@Service
public class ServiceExample {

    @Autowired
    private ReplicateDataService rdService;

    public void setValue(String mapName, String keyName, ExampleModel model) {
        rdService.storeValue(mapName, keyName, model);
    }

    public <T> T getValue(String mapName, String keyName, Class<T> dataType) {
        T model = null;
        model = rdService.getValueFromMap(keyName, mapName, dataType);
        System.out.println("Model: " + model);
        return model;
    }

}
