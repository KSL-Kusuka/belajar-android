package io.github.sendz.hitungluas;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class MainPresenterTest {

    private MainPresenter presenter;
    private MainView view;

    @Before
    public void setUp() throws Exception {
        view = mock(MainView.class);
        presenter = new MainPresenter(view);
    }

    @Test
    public void testHitungLuasPersegi() throws Exception {
        int luas = presenter.luasPersegi(4, 3);
        assertEquals(12, luas);
    }

    @Test
    public void testHitungLuasDanCekApakahHasilDitampilkanDiActivity() throws Exception {
        presenter.hitungLuas(4, 3);
        verify(view).tampilkanLuas(any(MainModel.class));
    }
}