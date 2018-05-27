package br.usjt.deswebmob.geodatamvp.view;

import android.content.Context;

/**
 * Created by carol on 27/05/2018.
 */

public class Contexto {
    private static Context contexto;

    public static Context getValue(){
        return contexto;
    }

    public static void setValue(Context c){
        contexto = c;
    }
}
