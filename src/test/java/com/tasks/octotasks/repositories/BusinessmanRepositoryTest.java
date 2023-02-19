package com.tasks.octotasks.repositories;

import com.tasks.octotasks.aggregation_interfaces.IBusinessmanCountPerCity;
import com.tasks.octotasks.aggregation_interfaces.IMinMaxWealthPerCity;
import com.tasks.octotasks.aggregation_interfaces.IWealthPerCity;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class BusinessmanRepositoryTest {

    @Autowired
    private BusinessmanRepository repository;

    @Test
    public void businessmanCountPerCity() {
        List<IBusinessmanCountPerCity> countPerCity =
                repository.businessmanCountPerCity();
        for (IBusinessmanCountPerCity element:countPerCity) {
            System.out.println(element.getCity()+":"+element.getBusinessmanCountPerCity());
        }
    }

    @Test
    public void wealthPerCity() {
        List<IWealthPerCity> result =
                repository.wealthPerCity();
        for (IWealthPerCity element:result) {
            System.out.println(element.getCity()+":"+element.getWealthPerCity());
        }
    }

    @Test
    public void maxWealthPerCity() {
        List<IMinMaxWealthPerCity> result =
                repository.maxWealthPerCity();
        for (IMinMaxWealthPerCity element:result) {
            System.out.println(element.getCity()+":"+element.getFullName()+":"+element.getWealth());
        }
    }

    @Test
    public void minWealthPerCity() {
        List<IMinMaxWealthPerCity> result =
                repository.minWealthPerCity();
        for (IMinMaxWealthPerCity element:result) {
            System.out.println(element.getCity()+":"+element.getFullName()+":"+element.getWealth());
        }
    }

    @Test
    public void averageWealthPerCity() {
        List<IWealthPerCity> result =
                repository.averageWealthPerCity();
        for (IWealthPerCity element:result) {
            System.out.println(element.getCity()+":"+element.getWealthPerCity());
        }
    }

}

