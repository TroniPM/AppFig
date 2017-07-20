package com.tronipm.festivaldeinvernodegaranhuns_fig.activities;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.tronipm.festivaldeinvernodegaranhuns_fig.R;
import com.tronipm.festivaldeinvernodegaranhuns_fig.entidades.Dia;

import java.util.List;

/**
 * Created by Mateus on 19/07/2017.
 * For project FestivaldeInvernodeGaranhuns-FIG. <https://github.com/TroniPM/AppFig>
 * Contact: <paulomatew@gmail.com>
 */
public class ListviewAdapterDia extends BaseAdapter {
    private static final String LOG = ListviewAdapterDia.class.getName() + " <LOG>";
    private Context context;
    private List<Dia> itens;

    public ListviewAdapterDia(Context context, List<Dia> itens) {
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
        final LayoutInflater inflater = ((PalcoActivity) context).getLayoutInflater();
        // final View dialogView = inflater.inflate(R.layout.confirm_item, null);
        //se a view estiver nula (nunca criada), inflamos o layout nela.
        if (convertView == null) {
            convertView = inflater.inflate(R.layout.itemlistviewlayout_dia, null);

            //cria um item de suporte para não precisarmos sempre
            //inflar as mesmas informacoes
            itemHolder = new ItemSuporte();


            itemHolder.imgIcon = ((ImageView) convertView.findViewById(R.id.imageView));
            itemHolder.txtDataCompleta = ((TextView) convertView.findViewById(R.id.textViewDataCompleta));
            itemHolder.txtDiaDaSemana = ((TextView) convertView.findViewById(R.id.textViewDiaSemana));

            //define os itens na view;
            convertView.setTag(itemHolder);
        } else {
            //se a view já existe pega os itens.
            itemHolder = (ItemSuporte) convertView.getTag();
        }

        //pega os dados da lista
        //e define os valores nos itens.
        final Dia item = itens.get(position);
        itemHolder.imgIcon.setImageResource(item.image);
        itemHolder.txtDataCompleta.setText(item.dataCompleta);
        itemHolder.txtDiaDaSemana.setText(item.diaDaSemana);

        //retorna a view com as informações
        return convertView;
    }


    /**
     * Classe de suporte para os itens do layout.
     */
    private class ItemSuporte {

        ImageView imgIcon;
        TextView txtDataCompleta;
        TextView txtDiaDaSemana;
    }
}
