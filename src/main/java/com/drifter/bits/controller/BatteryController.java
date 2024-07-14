package com.drifter.bits.controller;

import com.drifter.bits.model.BatteryResource;
import com.drifter.bits.model.BatteryStatisticsResource;
import com.drifter.bits.service.BatteryService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class BatteryController {
    private final BatteryService batteryService;

    @PostMapping("/batteries")
    public List<BatteryResource> saveStudent(@RequestBody List<BatteryResource> batteryResources) {
        return batteryService.saveAll(batteryResources);
    }

    @GetMapping("/batteries")
    public BatteryStatisticsResource getBatteryStatistics(@RequestParam int lo, @RequestParam int hi) {

    }

}
