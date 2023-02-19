package com.tasks.octotasks.aggregation_interfaces;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

public interface IWealthPerCity {
    String getCity();

    Double getWealthPerCity();
}
