/**
 *
 * @author kharileigh
 */

package com.kharileigh.service;

import com.kharileigh.entity.Dvd;
import com.kharileigh.persistence.DvdDao;
import java.util.Collection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("service")
public class DvdServiceImpl implements DvdService {
    
    @Autowired
    private DvdDao dao;

    @Override
    public Collection<Dvd> getAllDvds() {
        return dao.findAll();
    }

    @Override
    public Dvd searchDvdById(int id) {
        return dao.findById(id).orElse(null);
    }

    @Override
    public boolean addDvd(Dvd dvd) {
        
        if(searchDvdById(dvd.getDvdId()) == null) {
            dao.save(dvd);
            return true;
        } else {
            return false;
        }
    }
    
}
