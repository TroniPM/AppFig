package com.tronipm.festivaldeinvernodegaranhuns_fig.activities;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.tronipm.festivaldeinvernodegaranhuns_fig.R;
import com.tronipm.festivaldeinvernodegaranhuns_fig.entidades.Hotel;
import com.tronipm.festivaldeinvernodegaranhuns_fig.entidades.Palco;

import java.util.List;

/**
 * Created by Mateus on 19/07/2017.
 * For project FestivaldeInvernodeGaranhuns-FIG. <https://github.com/TroniPM/AppFig>
 * Contact: <paulomatew@gmail.com>
 */
public class ListviewAdapterHotel extends BaseAdapter {
    private static final String LOG = ListviewAdapterHotel.class.getName() + " <LOG>";
    private Context context;
    private List<Hotel> itens;

    public ListviewAdapterHotel(Context context, List<Hotel> itens) {
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
        final LayoutInflater inflater = ((HotelActivity) context).getLayoutInflater();
        // final View dialogView = inflater.inflate(R.layout.confirm_item, null);
        //se a view estiver nula (nunca criada), inflamos o layout nela.
        if (convertView == null) {
            convertView = inflater.inflate(R.layout.itemlistviewlayout_hotel, null);

            //cria um item de suporte para não precisarmos sempre
            //inflar as mesmas informacoes
            itemHolder = new ItemSuporte();


            itemHolder.imgIcon = ((ImageView) convertView.findViewById(R.id.imageView));
            itemHolder.txtNome = ((TextView) convertView.findViewById(R.id.textViewNome));
            itemHolder.txtEndereco = ((TextView) convertView.findViewById(R.id.textViewEndereco));
            itemHolder.txtTelefone = ((TextView) convertView.findViewById(R.id.textViewTelefone));
            itemHolder.txtTrip = ((TextView) convertView.findViewById(R.id.textViewTripAdvisor));
            itemHolder.txtBook = ((TextView) convertView.findViewById(R.id.textViewBooking));
            itemHolder.txtTriv = ((TextView) convertView.findViewById(R.id.textViewTrivago));

            //define os itens na view;
            convertView.setTag(itemHolder);
        } else {
            //se a view já existe pega os itens.
            itemHolder = (ItemSuporte) convertView.getTag();
        }

        //pega os dados da lista
        //e define os valores nos itens.
        final Hotel item = itens.get(position);
        //itemHolder.imgIcon.setImageResource(item.image);
        itemHolder.txtNome.setText(item.nome);
        itemHolder.txtEndereco.setText(item.endereco);
        itemHolder.txtTelefone.setText(item.telefone);

        if (item.tripadvisor == -1 && item.trivago == -1 && item.booking == -1) {
            ((TextView) convertView.findViewById(R.id.textViewAval)).setVisibility(View.GONE);
        }

        if (item.tripadvisor != -1) {
            itemHolder.txtTrip.setVisibility(View.VISIBLE);
            itemHolder.txtTrip.setText(context.getString(R.string.tripadvisor)
                    + " " + String.valueOf(item.tripadvisor));
        } else {
            //itemHolder.txtTrip.setText("");
            itemHolder.txtTrip.setVisibility(View.GONE);
        }
        if (item.booking != -1) {
            itemHolder.txtBook.setVisibility(View.VISIBLE);
            itemHolder.txtBook.setText(context.getString(R.string.booking)
                    + " " + String.valueOf(item.booking));
        } else {
            //itemHolder.txtBook.setText("");
            itemHolder.txtBook.setVisibility(View.GONE);
        }
        if (item.trivago != -1) {
            itemHolder.txtTriv.setVisibility(View.VISIBLE);
            itemHolder.txtTriv.setText(context.getString(R.string.trivago)
                    + " " + String.valueOf(item.trivago));
        } else {
            //itemHolder.txtTriv.setText("");
            itemHolder.txtTriv.setVisibility(View.GONE);
        }

        //retorna a view com as informações
        return convertView;
    }


    /**
     * Classe de suporte para os itens do layout.
     */
    private class ItemSuporte {

        ImageView imgIcon;
        TextView txtNome;
        TextView txtEndereco;
        TextView txtTelefone;
        TextView txtTrip;
        TextView txtBook;
        TextView txtTriv;
    }
}
