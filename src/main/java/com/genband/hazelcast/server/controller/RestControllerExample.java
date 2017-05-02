package com.genband.hazelcast.server.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.genband.hazelcast.server.model.ExampleModel;
import com.genband.hazelcast.server.service.ServiceExample;

import com.genband.util.log.slf4j.GbLogger;
import com.genband.util.log.slf4j.GbLoggerFactory;

@RestController
@RequestMapping("/datagrid/model")
public class RestControllerExample {
    private static GbLogger log = GbLoggerFactory.getGbLogger(RestControllerExample.class.getName());

    @Autowired
    private ServiceExample svc;

    @RequestMapping(value = "/map/{mapname}/key/{keyname}", method = RequestMethod.POST)
    public ResponseEntity<ExampleModel> setValue(@PathVariable("mapname") String mapName,
            @PathVariable("keyname") String keyName, @RequestBody ExampleModel model) {

        log.info(String.format("ExampleModel: %s .", model.toString()));

        svc.setValue(mapName, keyName, model);
        ResponseEntity<ExampleModel> response = new ResponseEntity<ExampleModel>(model, HttpStatus.ACCEPTED);

        return response;
    }

    @RequestMapping(value = "/map/{mapname}/key/{keyname}", method = RequestMethod.GET)
    public ResponseEntity<ExampleModel> getValue(@PathVariable("mapname") String mapName,
            @PathVariable("keyname") String keyName) {

        log.info(String.format("ExampleModel Query - <map : %s> | <key : %s> .", mapName, keyName));

        ExampleModel model = svc.getValue(mapName, keyName, ExampleModel.class);

        log.info(String.format("ExampleModel: %s .", model));
        ResponseEntity<ExampleModel> response = new ResponseEntity<ExampleModel>(model, HttpStatus.ACCEPTED);

        return response;
    }
}
