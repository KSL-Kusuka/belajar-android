package io.github.sendz.hitungluas;

public class MainPresenter {
    private MainView view;
    private MainModel model;

    public MainPresenter(MainView view) {
        this.view = view;
    }

    public void hitungLuas(int panjang, int lebar) {
        int luas = luasPersegi(panjang, lebar);
        model = new MainModel(luas);
        view.tampilkanLuas(model);
    }

    public int luasPersegi(int panjang, int lebar) {
        return panjang * lebar;
    }
}
