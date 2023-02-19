package com.tasks.octotasks.aggregation_interfaces;

import lombok.AllArgsConstructor;
import lombok.Data;

public interface IBusinessmanCountPerCity {
    String getCity();

    Integer getBusinessmanCountPerCity();
}
