package br.usjt.deswebmob.geodatamvp.model.dao;

import java.io.IOException;

import br.usjt.deswebmob.geodatamvp.model.entity.Pais;
import br.usjt.deswebmob.geodatamvp.model.entity.Regiao;

/**
 * Created by carol on 27/05/2018.
 */

public interface PaisDAO {

    Pais[] buscarPaises(Regiao regiao) throws IOException;
}
