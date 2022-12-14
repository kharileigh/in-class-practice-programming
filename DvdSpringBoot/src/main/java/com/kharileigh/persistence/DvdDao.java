/**
 *
 * @author kharileigh
 */

package com.kharileigh.persistence;

import com.kharileigh.entity.Dvd;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DvdDao extends JpaRepository<Dvd, Integer>{
    
    /*------ NAMING CONVENTION QUERIES -------*/
    // QUERY BY RELEASE DATE
    List<Dvd> findByReleaseDateGreaterThan(String releaseDate);
    
    // QUERY - COUNTING NUMBER OF DVDS
    int countByReleaseDate(String releaseDate);
    
    /*------ JPQL QUERIES -------*/
}
