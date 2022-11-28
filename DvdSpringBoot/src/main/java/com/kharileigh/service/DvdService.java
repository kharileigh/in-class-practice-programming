/**
 *
 * @author kharileigh
 */

package com.kharileigh.service;

import com.kharileigh.entity.Dvd;
import java.util.Collection;
import java.util.List;


public interface DvdService {
    
    Collection<Dvd> getAllDvds();
    
    Dvd searchDvdById(int id);
    
    boolean addDvd(Dvd dvd);
    
    List<Dvd> getDvdsByReleaseDate(String releaseDate);
    
}
