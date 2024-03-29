package com.github.thriveframework.core.detection.model.dto;

import lombok.Value;
import lombok.experimental.Accessors;

import java.util.Set;

@Value
public class ThriveInstance {
    String name;
    String address;
    @Accessors(fluent = true)
    boolean hasApi;
    @Accessors(fluent = true)
    boolean hasSwagger;
    Set<String> websocketPaths;

    public boolean hasWebsocket(){
        return !websocketPaths.isEmpty();
    }
}
