package com.tronipm.festivaldeinvernodegaranhuns_fig.repo;

import android.content.Context;
import android.content.SharedPreferences;

/**
 * Created by Mateus on 14/06/2017.
 * For project NutriCampus.
 * Contact: <paulomatew@gmail.com>
 */
public class SharedPreferencesManager {
    /*
    http://randomkeygen.com/
    TODO trocar keys a cada versão do app
     */
    private final String UNIQ_KEY = "p_I9yQ4L";

    // Shared Preferences
    private SharedPreferences pref;
    private SharedPreferences.Editor editor;
    private Context _context;

    // Shared pref mode
    public final int PRIVATE_MODE_SHARED_PREF = 0;

    // Shared preferences file name
    public final String PREF_NAME = UNIQ_KEY + "FIG";

    /*KEYS para o sharedpreferences*/
    private final String KEY_USUARIONC = PREF_NAME + "setup";

    public SharedPreferencesManager(Context context) {
        this._context = context;

        removerBdVersoesAnteriores();

        pref = _context.getSharedPreferences(PREF_NAME, PRIVATE_MODE_SHARED_PREF);
        editor = pref.edit();
    }

    /**
     * NUNCA remover essa chamada. Isso fara com que seja apagado o bd anterior do usuário.
     * Isso pq o usuário pode não ter a versão atual. Quando tiver, o bd anterior sera limpado.
     */
    public void removerBdVersoesAnteriores() {
        final String bd1 = "s@ap6j?";

        if (PREF_NAME.equals(bd1)) {
            _context.getSharedPreferences(bd1, 0).edit().clear().commit();
        }

    }

    public void close() {
        editor = null;
        pref = null;
    }

    public boolean getSetup() {
        return pref.getBoolean(KEY_USUARIONC, false);
    }

    public void setSetup() {
        editor.putBoolean(KEY_USUARIONC, true);
        editor.apply();
    }

}
