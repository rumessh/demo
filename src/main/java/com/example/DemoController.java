package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by rpalaniappan on 5/2/17.
 */
@RestController
public class DemoController {

    @Autowired
    ClusterConfiguration clusterConfiguration;

    @GetMapping(path = "/test")
    public ResponseEntity<String> triggerPurchaseOrderImportJob() {

        System.out.println(clusterConfiguration.getClusterDetail().get("cluster1").getServerIp());
        return ResponseEntity.ok("Success");
    }

}
