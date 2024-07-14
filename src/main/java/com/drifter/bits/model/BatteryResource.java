package com.drifter.bits.model;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
public class BatteryResource {
    @NotBlank
    private String name;
    @NotBlank
    private String postcode;
    @Min(1)
    private int wattCapacity;
}
