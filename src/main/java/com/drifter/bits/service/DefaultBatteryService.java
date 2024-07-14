package com.drifter.bits.service;

import com.drifter.bits.model.Battery;
import com.drifter.bits.model.BatteryResource;
import com.drifter.bits.repository.BatteryRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class DefaultBatteryService implements BatteryService {
    private final BatteryRepository batteryRepository;
    private final ModelMapper modelMapper;

    @Override
    @Transactional
    public List<BatteryResource> saveAll(List<BatteryResource> batteryResources) {
        List<Battery> batteries = batteryResources.stream()
                .map(batteryResource -> modelMapper.map(batteryResource, Battery.class))
                .collect(Collectors.toList());
        batteryRepository.saveAll(batteries);
        return batteryResources;
    }

    @Override
    @Transactional
    public List<String> findAllNamesByWattCapacityRangeOrderByName(int lo, int hi) {
        return batteryRepository.findAllNamesByWattCapacityRangeOrderByName(lo, hi);
    }
}
