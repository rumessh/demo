package com.example;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by rpalaniappan on 5/2/17.
 */
@Component
@ConfigurationProperties
public class ClusterConfiguration {

    private Map<String, ClusterDetail> clusterDetail = new HashMap<>();

    public Map<String, ClusterDetail> getClusterDetail() {
        return clusterDetail;
    }
}
