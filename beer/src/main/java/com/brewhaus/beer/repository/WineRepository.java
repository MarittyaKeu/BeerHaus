package com.brewhaus.beer.repository;
import com.brewhaus.beer.entity.Wine;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface  WineRepository extends JpaRepository<Wine, Long>{
    public Wine getWineById(int id);
    public void removeWineById(int id);
    //testing
}
