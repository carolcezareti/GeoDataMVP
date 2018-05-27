package br.usjt.deswebmob.geodatamvp.model.service;


import java.io.IOException;

import br.usjt.deswebmob.geodatamvp.model.dao.PaisDAO;
import br.usjt.deswebmob.geodatamvp.model.dao.PaisDAOFactory;
import br.usjt.deswebmob.geodatamvp.model.entity.Pais;
import br.usjt.deswebmob.geodatamvp.model.entity.Regiao;

/**
 * Created by carol on 27/05/2018.
 */

public class PaisService {
    PaisDAO dao;

    public PaisService(boolean onLine){
        dao = PaisDAOFactory.getPaisDAO(onLine);
    }
    public Pais[] buscarPaises(Regiao regiao) throws IOException {
        return dao.buscarPaises(regiao);
    }
}
