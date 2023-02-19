package com.tasks.octotasks.repositories;

import com.tasks.octotasks.aggregation_interfaces.IMinMaxWealthPerCity;
import com.tasks.octotasks.entities.Businessman;
import com.tasks.octotasks.aggregation_interfaces.IBusinessmanCountPerCity;
import com.tasks.octotasks.aggregation_interfaces.IWealthPerCity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface BusinessmanRepository extends JpaRepository<Businessman,Long> {

    // Skolko biznesmenov  po kajdomu gorodu
    @Query("SELECT b.city as city, COUNT(b.id) AS businessmanCountPerCity " +
            "FROM Businessman as b " +
            "GROUP BY b.city")
    List<IBusinessmanCountPerCity> businessmanCountPerCity();

    // Summa bogatstv biznesmenov po kajdomu gorodu
    @Query("SELECT b.city as city, SUM(b.wealth) as wealthPerCity " +
            "FROM Businessman as b " +
            "GROUP BY b.city")
    List<IWealthPerCity> wealthPerCity();

    // Samiy bogatiy  biznesmen po kajdomu gorodu
    @Query("SELECT b.city as city,b.fullName as fullName, MAX(b.wealth)  as wealth " +
            "FROM Businessman as b " +
            "GROUP BY b.city")
    List<IMinMaxWealthPerCity> maxWealthPerCity();

    //Samiy bedniy biznesmen po kajdomu gorodu
    @Query("SELECT b.city as city ,b.fullName as fullName, MIN(b.wealth) as wealth " +
            "FROM Businessman as b " +
            "GROUP BY b.city")
    List<IMinMaxWealthPerCity> minWealthPerCity();

   // Sredniy pokazatel bogatstv po kajdomu gorodu
    @Query("SELECT b.city as city, AVG(b.wealth) AS wealthPerCity " +
            "FROM Businessman as b " +
            "GROUP BY b.city")
    List<IWealthPerCity> averageWealthPerCity();
}
