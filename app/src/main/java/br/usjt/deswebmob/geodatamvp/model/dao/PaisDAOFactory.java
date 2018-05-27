package br.usjt.deswebmob.geodatamvp.model.dao;

import br.usjt.deswebmob.geodatamvp.view.Contexto;

/**
 * Created by carol on 27/05/2018.
 */

public class PaisDAOFactory {

    public static PaisDAO getPaisDAO(boolean onLine){
        if (onLine) {
            return new PaisDAORest();
        } else {
            return new PaisDAODb(Contexto.getValue());
        }
    }
}
