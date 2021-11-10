package br.com.devin.avengers.controllers.service;

import br.com.devin.avengers.model.dao.AvengerDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AvengerService {
    @Autowired
    private AvengerDao avengerDao;

    public List<String> listOldAvengers() {
        this.avengerDao.listOldAvengers()
        return null;
    }
}
