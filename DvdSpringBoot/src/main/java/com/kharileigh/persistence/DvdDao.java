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
    
    // QUERY BY RELEASE DATE
    List<Dvd> findByReleaseDateGreaterThan(String releaseDate);
}
