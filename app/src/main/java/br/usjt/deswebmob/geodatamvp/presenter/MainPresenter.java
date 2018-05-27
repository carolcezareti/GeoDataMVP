package br.usjt.deswebmob.geodatamvp.presenter;


/**
 * Created by carol on 27/05/2018.
 */

public class MainPresenter implements Presenter {
    private MainView view;

    public MainPresenter(MainView view) {
        this.view = view;
    }

    @Override
    public void onCreate() {

    }

    @Override
    public void onPause() {

    }

    @Override
    public void onResume() {

    }

    @Override
    public void onDestroy() {

    }

    private class MainView {
    }
}
