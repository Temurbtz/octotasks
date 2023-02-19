package com.tasks.octotasks.aggregation_interfaces;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

public interface IMinMaxWealthPerCity {

     String getCity();

    String getFullName();

    Double getWealth();
}
