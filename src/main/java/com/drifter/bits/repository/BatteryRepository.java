package com.drifter.bits.repository;

import com.drifter.bits.model.Battery;
import com.drifter.bits.model.BatteryResource;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BatteryRepository extends JpaRepository<Battery, Integer> {

    @Query("SELECT new com.drifter.bits.model.BatteryStatisticsResource(b.name, b.postcode, b.wattCapacity) FROM Battery b WHERE b.wattCapacity BETWEEN :minWattCapacity AND :maxWattCapacity ORDER BY b.name")
    List<BatteryResource> findAllByWattCapacityRangeOrderByName(
            @Param("minWattCapacity") int minWattCapacity,
            @Param("maxWattCapacity") int maxWattCapacity);
}
