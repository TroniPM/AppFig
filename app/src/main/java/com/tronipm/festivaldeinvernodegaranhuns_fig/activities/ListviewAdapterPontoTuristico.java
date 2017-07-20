package com.tronipm.festivaldeinvernodegaranhuns_fig.activities;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.tronipm.festivaldeinvernodegaranhuns_fig.R;
import com.tronipm.festivaldeinvernodegaranhuns_fig.entidades.Palco;
import com.tronipm.festivaldeinvernodegaranhuns_fig.entidades.PontoTuristico;

import java.util.List;

/**
 * Created by Mateus on 19/07/2017.
 * For project FestivaldeInvernodeGaranhuns-FIG. <https://github.com/TroniPM/AppFig>
 * Contact: <paulomatew@gmail.com>
 */
public class ListviewAdapterPontoTuristico extends BaseAdapter {
    private static final String LOG = ListviewAdapterPontoTuristico.class.getName() + " <LOG>";
    private Context context;
    private List<PontoTuristico> itens;

    public ListviewAdapterPontoTuristico(Context context, List<PontoTuristico> itens) {
        //Itens do listview
        this.itens = itens;
        //Objeto responsável por pegar o Layout do item.
        this.context = context;
    }

    @Override
    public int getCount() {
        return itens.size();
    }

    @Override
    public Object getItem(int position) {
        return itens.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {
        final ItemSuporte itemHolder;
        final LayoutInflater inflater = ((PontoTuristicoActivity) context).getLayoutInflater();
        // final View dialogView = inflater.inflate(R.layout.confirm_item, null);
        //se a view estiver nula (nunca criada), inflamos o layout nela.
        if (convertView == null) {
            convertView = inflater.inflate(R.layout.itemlistviewlayout_pontoturistico, null);

            //cria um item de suporte para não precisarmos sempre
            //inflar as mesmas informacoes
            itemHolder = new ItemSuporte();


            itemHolder.imgIcon = ((ImageView) convertView.findViewById(R.id.imageView));
            itemHolder.txtPalcoNome = ((TextView) convertView.findViewById(R.id.textViewNome));

            //define os itens na view;
            convertView.setTag(itemHolder);
        } else {
            //se a view já existe pega os itens.
            itemHolder = (ItemSuporte) convertView.getTag();
        }

        //pega os dados da lista
        //e define os valores nos itens.
        final PontoTuristico item = itens.get(position);
        itemHolder.imgIcon.setImageResource(item.imagem);
        itemHolder.txtPalcoNome.setText(item.nome);

        //retorna a view com as informações
        return convertView;
    }

    /**
     * Classe de suporte para os itens do layout.
     */
    private class ItemSuporte {

        ImageView imgIcon;
        TextView txtPalcoNome;
    }
}
