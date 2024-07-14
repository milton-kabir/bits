package com.drifter.bits.service;

import com.drifter.bits.model.BatteryResource;

import java.util.List;

public interface BatteryService {
    List<BatteryResource> saveAll(List<BatteryResource> batteryResources);

    List<BatteryResource> findAllByWattCapacityRangeOrderByName(int lo, int hi);

}
