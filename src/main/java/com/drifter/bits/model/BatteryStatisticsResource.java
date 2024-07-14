package com.drifter.bits.model;

import lombok.Builder;
import lombok.Getter;

import java.util.List;

@Builder
@Getter
public class BatteryStatisticsResource {
    private List<String> batteryNames;
    private int totalCapacity;
    private double averageCapacity;
}
