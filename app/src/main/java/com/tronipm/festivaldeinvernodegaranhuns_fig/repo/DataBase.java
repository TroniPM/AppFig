package com.tronipm.festivaldeinvernodegaranhuns_fig.repo;

import android.util.Log;

import com.tronipm.festivaldeinvernodegaranhuns_fig.R;
import com.tronipm.festivaldeinvernodegaranhuns_fig.entidades.Artista;
import com.tronipm.festivaldeinvernodegaranhuns_fig.entidades.Dia;
import com.tronipm.festivaldeinvernodegaranhuns_fig.entidades.Hospital;
import com.tronipm.festivaldeinvernodegaranhuns_fig.entidades.Hotel;
import com.tronipm.festivaldeinvernodegaranhuns_fig.entidades.Mercado;
import com.tronipm.festivaldeinvernodegaranhuns_fig.entidades.Palco;
import com.tronipm.festivaldeinvernodegaranhuns_fig.entidades.Polo;
import com.tronipm.festivaldeinvernodegaranhuns_fig.entidades.PoloProgramacao;
import com.tronipm.festivaldeinvernodegaranhuns_fig.entidades.PontoTuristico;
import com.tronipm.festivaldeinvernodegaranhuns_fig.entidades.Restaurante;

import java.util.ArrayList;

/**
 * Created by Mateus on 19/07/2017.
 * For project FestivaldeInvernodeGaranhuns-FIG. <https://github.com/TroniPM/AppFig>
 * Contact: <paulomatew@gmail.com>
 */

public class DataBase {
    public ArrayList<Palco> palcos = new ArrayList<>();
    public ArrayList<Dia> dias = new ArrayList<>();
    public ArrayList<Artista> artistas = new ArrayList<>();
    public ArrayList<Hotel> hoteis = new ArrayList<>();
    public ArrayList<Restaurante> restaurantes = new ArrayList<>();
    public ArrayList<Hospital> hospitais = new ArrayList<>();
    public ArrayList<PontoTuristico> pontosTuristicos = new ArrayList<>();
    public ArrayList<Mercado> mercados = new ArrayList<>();
    public ArrayList<Polo> polos = new ArrayList<>();

    public DataBase() {
        Log.d(this.getClass().getSimpleName(), "init()");
        /*TODO PALCOS*/
        Palco palco1 = new Palco("Palco Mestre Dominguinhos", "Praça Mestre Dominguinhos", "11111", "2222222", 1, R.drawable.guadalajara1);
        palcos.add(palco1);
        Palco palco2 = new Palco("Palco Cultura Popular", "Sem descrição", "11111", "2222222", 2, R.drawable.guadalajara1);
        palcos.add(palco2);
        Palco palco3 = new Palco("Palco Instrumental", "Parque Ruber Van Der Linden ", "11111", "2222222", 3, R.drawable.paupombo1);
        palcos.add(palco3);
        Palco palco4 = new Palco("Palco Pop", "Parque Euclides Dourado", "11111", "2222222", 4, R.drawable.edourado1);
        palcos.add(palco4);
        Palco palco5 = new Palco("Palco Forró", "Parque Euclides Dourado", "11111", "2222222", 5, R.drawable.edourado1);
        palcos.add(palco5);
        Palco palco6 = new Palco("Palco Som na Rural", "Parque Euclides Dourado", "11111", "2222222", 6, R.drawable.edourado1);
        palcos.add(palco6);
        Palco palco7 = new Palco("Palco Mamulengos e Pontos de Cultura", "Parque Euclides Dourado", "11111", "2222222", 7, R.drawable.edourado1);
        palcos.add(palco7);
        Palco palco8 = new Palco("Palco Catedral", "Igreja de Santo Antônio", "11111", "2222222", 8, R.drawable.catedral1);
        palcos.add(palco8);
        /*TODO DIAS*/
        Dia dia1 = new Dia("21/07/2017", "Sexta-feira", 1, R.drawable.i21);
        dias.add(dia1);
        Dia dia2 = new Dia("22/07/2017", "Sábado", 2, R.drawable.i22);
        dias.add(dia2);
        Dia dia3 = new Dia("23/07/2017", "Domingo", 3, R.drawable.i23);
        dias.add(dia3);
        Dia dia4 = new Dia("24/07/2017", "Segunda-feira", 4, R.drawable.i24);
        dias.add(dia4);
        Dia dia5 = new Dia("25/07/2017", "Terça-feira", 5, R.drawable.i25);
        dias.add(dia5);
        Dia dia6 = new Dia("26/07/2017", "Quarta-feira", 6, R.drawable.i26);
        dias.add(dia6);
        Dia dia7 = new Dia("27/07/2017", "Quinta-feira", 7, R.drawable.i27);
        dias.add(dia7);
        Dia dia8 = new Dia("28/07/2017", "Sexta-feira", 8, R.drawable.i28);
        dias.add(dia8);
        Dia dia9 = new Dia("29/07/2017", "Sábado", 9, R.drawable.i29);
        dias.add(dia9);
        /*TODO PALCOS e DIAS*/
        palco1.arrayDias.add(dia1);
        palco1.arrayDias.add(dia2);
        palco1.arrayDias.add(dia3);
        palco1.arrayDias.add(dia4);
        palco1.arrayDias.add(dia5);
        palco1.arrayDias.add(dia6);
        palco1.arrayDias.add(dia7);
        palco1.arrayDias.add(dia8);
        palco1.arrayDias.add(dia9);
        palco2.arrayDias.add(dia2);
        palco2.arrayDias.add(dia3);
        palco2.arrayDias.add(dia4);
        palco2.arrayDias.add(dia5);
        palco2.arrayDias.add(dia6);
        palco2.arrayDias.add(dia7);
        palco2.arrayDias.add(dia8);
        palco2.arrayDias.add(dia9);
        palco3.arrayDias.add(dia5);
        palco3.arrayDias.add(dia6);
        palco3.arrayDias.add(dia7);
        palco3.arrayDias.add(dia8);
        palco3.arrayDias.add(dia9);
        palco4.arrayDias.add(dia5);
        palco4.arrayDias.add(dia6);
        palco4.arrayDias.add(dia7);
        palco4.arrayDias.add(dia8);
        palco4.arrayDias.add(dia9);
        palco5.arrayDias.add(dia5);
        palco5.arrayDias.add(dia6);
        palco5.arrayDias.add(dia7);
        palco5.arrayDias.add(dia8);
        palco5.arrayDias.add(dia9);
        palco6.arrayDias.add(dia1);
        palco6.arrayDias.add(dia2);
        palco6.arrayDias.add(dia3);
        palco6.arrayDias.add(dia4);
        palco6.arrayDias.add(dia5);
        palco6.arrayDias.add(dia6);
        palco6.arrayDias.add(dia7);
        palco6.arrayDias.add(dia8);
        palco6.arrayDias.add(dia9);
        palco7.arrayDias.add(dia5);
        palco7.arrayDias.add(dia6);
        palco7.arrayDias.add(dia7);
        palco7.arrayDias.add(dia8);
        palco7.arrayDias.add(dia9);
        palco8.arrayDias.add(dia1);
        palco8.arrayDias.add(dia2);
        palco8.arrayDias.add(dia3);
        palco8.arrayDias.add(dia4);
        palco8.arrayDias.add(dia5);
        palco8.arrayDias.add(dia6);
        palco8.arrayDias.add(dia7);
        palco8.arrayDias.add(dia8);
        palco8.arrayDias.add(dia9);
        /*TODO artistas*/
        //Palco1
        //dia1
        Artista artista = new Artista("Amanda Back", "20h", dia1.id, palco1.id);
        artistas.add(artista);
        artista = new Artista("Mundo Livre", "21h", dia1.id, palco1.id);
        artistas.add(artista);
        artista = new Artista("Geraldo Azevedo", "22h30", dia1.id, palco1.id);
        artistas.add(artista);
        artista = new Artista("Tributo a Belchior", "0h", dia1.id, palco1.id);
        artistas.add(artista);
        //dia2
        artista = new Artista("Rogério e os Cabras", "20h", dia2.id, palco1.id);
        artistas.add(artista);
        artista = new Artista("Maciel Salu", "21h", dia2.id, palco1.id);
        artistas.add(artista);
        artista = new Artista("Cantos Rurais", "22h", dia2.id, palco1.id);
        artistas.add(artista);
        artista = new Artista("Alice Caymmi (RJ)", "23h", dia2.id, palco1.id);
        artistas.add(artista);
        artista = new Artista("Baby do Brasil (RJ)", "0h30", dia2.id, palco1.id);
        artistas.add(artista);
        //dia3
        artista = new Artista("Cafuringa e Banda", "20h", dia3.id, palco1.id);
        artistas.add(artista);
        artista = new Artista("Donas", "21h", dia3.id, palco1.id);
        artistas.add(artista);
        artista = new Artista("Zé Brown", "22h", dia3.id, palco1.id);
        artistas.add(artista);
        artista = new Artista("Ifá (BA)", "23h", dia3.id, palco1.id);
        artistas.add(artista);
        artista = new Artista("Tom Zé (BA)", "0h30", dia3.id, palco1.id);
        artistas.add(artista);
        //dia4
        artista = new Artista("Still Living", "21h", dia4.id, palco1.id);
        artistas.add(artista);
        artista = new Artista("Herbert Lucena", "22h", dia4.id, palco1.id);
        artistas.add(artista);
        artista = new Artista("Cantoria Agreste", "23h", dia4.id, palco1.id);
        artistas.add(artista);
        artista = new Artista("MPB4 (RJ)", "0h30", dia4.id, palco1.id);
        artistas.add(artista);
        //dia5
        artista = new Artista("Lucas Santana", "21h", dia5.id, palco1.id);
        artistas.add(artista);
        artista = new Artista("Banda Eddie, com participação da Orquestra Henrique Dias", "22h", dia5.id, palco1.id);
        artistas.add(artista);
        artista = new Artista("Baiana System", "0h30", dia5.id, palco1.id);
        artistas.add(artista);
        //dia6
        artista = new Artista("Belinha Lisboa", "20h", dia6.id, palco1.id);
        artistas.add(artista);
        artista = new Artista("Arthur Spindolla", "21h", dia6.id, palco1.id);
        artistas.add(artista);
        artista = new Artista("Lia Sophia e Pinduca", "22h", dia6.id, palco1.id);
        artistas.add(artista);
        artista = new Artista("Fafá de Belém", "23h30", dia6.id, palco1.id);
        artistas.add(artista);
        //dia7
        artista = new Artista("Mourinha do Forró", "20h", dia7.id, palco1.id);
        artistas.add(artista);
        artista = new Artista("Projeto Setenta com Sete, Waldonys, Chambinho, Meninão, Adelson Viana, " +
                "Agostinho do Acordeon, Mahatma e Terezinha do Acordeon", "21h", dia7.id, palco1.id);
        artistas.add(artista);
        artista = new Artista("Lucy Alves", "22h20", dia7.id, palco1.id);
        artistas.add(artista);
        artista = new Artista("Chico César", "23h30", dia7.id, palco1.id);
        artistas.add(artista);
        //dia8
        artista = new Artista("Kiara Ribeiro", "20h", dia7.id, palco1.id);
        artistas.add(artista);
        artista = new Artista("Grupo Terra", "21h", dia7.id, palco1.id);
        artistas.add(artista);
        artista = new Artista("Gerlane Lops", "22h", dia7.id, palco1.id);
        artistas.add(artista);
        artista = new Artista("Marienne de Castro", "23h", dia7.id, palco1.id);
        artistas.add(artista);
        artista = new Artista("Mart’nália", "030", dia7.id, palco1.id);
        artistas.add(artista);
        //dia9
        artista = new Artista("Andrea Amorim", "20h", dia9.id, palco1.id);
        artistas.add(artista);
        artista = new Artista("Jr. Black", "21h", dia9.id, palco1.id);
        artistas.add(artista);
        artista = new Artista("Spok Frevo Orquestra", "22h", dia9.id, palco1.id);
        artistas.add(artista);
        artista = new Artista("Zé Ricardo, com participação especial de Toni Garrido", "23h", dia9.id, palco1.id);
        artistas.add(artista);
        artista = new Artista("Fernanda Abreu", "0h30", dia9.id, palco1.id);
        artistas.add(artista);
        /*Palco2*/
        //dia2
        artista = new Artista("Reisado Garanhuns Cultural", "12h", dia2.id, palco2.id);
        artistas.add(artista);
        artista = new Artista("Aria Social", "13h", dia2.id, palco2.id);
        artistas.add(artista);
        artista = new Artista("Coco Miudinho da Xambá", "14h", dia2.id, palco2.id);
        artistas.add(artista);
        artista = new Artista("Maracatu Nação Raízes de Pai Adão", "15h", dia2.id, palco2.id);
        artistas.add(artista);
        artista = new Artista("Boi Milagroso do Engenho Trapuá", "16h", dia2.id, palco2.id);
        artistas.add(artista);
        artista = new Artista("Grupo Xaxado Cabras de Lampião", "17h", dia2.id, palco2.id);
        artistas.add(artista);
        artista = new Artista("Ciranda Bela Rosa", "18h", dia2.id, palco2.id);
        artistas.add(artista);
        //dia3
        artista = new Artista("Valdir Mariano", "12h", dia3.id, palco2.id);
        artistas.add(artista);
        artista = new Artista("Reisado Mestre Joao Tibúrcio", "13h", dia3.id, palco2.id);
        artistas.add(artista);
        artista = new Artista("Boi Tá Tá Tá", "14h", dia3.id, palco2.id);
        artistas.add(artista);
        artista = new Artista("Tribo Indígena Carijós do Recife", "15h", dia3.id, palco2.id);
        artistas.add(artista);
        artista = new Artista("Coco dos Pretos", "16h", dia3.id, palco2.id);
        artistas.add(artista);
        artista = new Artista("Bloco Compositores e Foliões", "17h", dia3.id, palco2.id);
        artistas.add(artista);
        artista = new Artista("Maracatu de Baque Solto Leão Vencedor de Carpina", "18h", dia3.id, palco2.id);
        artistas.add(artista);
        artista = new Artista("Afoxé Omolu Pa Kerú Awo", "19h", dia3.id, palco2.id);
        artistas.add(artista);
        //dia4
        artista = new Artista("Reisado Santíssimo Redentos", "12h", dia4.id, palco2.id);
        artistas.add(artista);
        artista = new Artista("Grupo Negra'Atitude (Quilombo Estivas)", "13h", dia4.id, palco2.id);
        artistas.add(artista);
        artista = new Artista("Mendes e Sua Orquestra", "14h", dia4.id, palco2.id);
        artistas.add(artista);
        artista = new Artista("Bloco de Samba Turma do Sabaré", "15h", dia4.id, palco2.id);
        artistas.add(artista);
        artista = new Artista("Urso Cangaçá de Água Fria", "16h", dia4.id, palco2.id);
        artistas.add(artista);
        artista = new Artista("Maracatu de Baque Solto Leão da Fortaleza", "17h", dia4.id, palco2.id);
        artistas.add(artista);
        artista = new Artista("Coco Bojo da Macaíba", "18h", dia4.id, palco2.id);
        artistas.add(artista);
        artista = new Artista("Linguarudo de Ouro Preto", "19h", dia4.id, palco2.id);
        artistas.add(artista);
        //dia5
        artista = new Artista("Banda da Polícia Militar de Pernambuo", "12h", dia5.id, palco2.id);
        artistas.add(artista);
        artista = new Artista("Coco Mestre Juarez (Quilombo Timbó)", "13h", dia5.id, palco2.id);
        artistas.add(artista);
        artista = new Artista("Caboclinhos Kapinawá", "14h", dia5.id, palco2.id);
        artistas.add(artista);
        artista = new Artista("Maracatu Piaba de Ouro", "15h", dia5.id, palco2.id);
        artistas.add(artista);
        artista = new Artista("Coco Castelo Branco (Quilombo Castainho)", "16h", dia5.id, palco2.id);
        artistas.add(artista);
        artista = new Artista("Clube de Bonecos Seus Malaquias (Patrimônio Vivo)", "17h", dia5.id, palco2.id);
        artistas.add(artista);
        artista = new Artista("Grupo Afro Estrela (Quilombo Estrela)", "18h", dia5.id, palco2.id);
        artistas.add(artista);
        artista = new Artista("Bloco de Samba Anarquista Bole Bole", "19h", dia5.id, palco2.id);
        artistas.add(artista);
        //dia6
        artista = new Artista("Roda de Sanfona I", "12h às 14h", dia6.id, palco2.id);
        artistas.add(artista);
        artista = new Artista("Cortejo Quadrilhas", "13h", dia6.id, palco2.id);
        artistas.add(artista);
        artista = new Artista("Quadrilha Junina Luminar (Garanhuns)", "14h", dia6.id, palco2.id);
        artistas.add(artista);
        artista = new Artista("Quadrilha Junina Os Filhos de Lampião (Correntes)", "14h30", dia6.id, palco2.id);
        artistas.add(artista);
        artista = new Artista("Quadrilha Junina Xamego na Roça (Canhotinho)", "15h", dia6.id, palco2.id);
        artistas.add(artista);
        artista = new Artista("Bloco C. M. Lira da Noite", "16h", dia6.id, palco2.id);
        artistas.add(artista);
        artista = new Artista("Coco de Pneu", "17h", dia6.id, palco2.id);
        artistas.add(artista);
        artista = new Artista("Maracatu de Baque Solto Leão Misterioso", "18h", dia6.id, palco2.id);
        artistas.add(artista);
        artista = new Artista("Afoxé Filhos de Dandalunda", "19h", dia6.id, palco2.id);
        artistas.add(artista);
        //dia7
        artista = new Artista("Roda de Sanfona II", "12h às 14h", dia7.id, palco2.id);
        artistas.add(artista);
        artista = new Artista("Caboclinhos Canindé de Camaragibe", "14h", dia7.id, palco2.id);
        artistas.add(artista);
        artista = new Artista("Boi Dourado de Limoeiro", "15h", dia7.id, palco2.id);
        artistas.add(artista);
        artista = new Artista("Maracatu Feminino Coração Nazareno", "16h", dia7.id, palco2.id);
        artistas.add(artista);
        artista = new Artista("Boi Maracatu", "17h", dia7.id, palco2.id);
        artistas.add(artista);
        artista = new Artista("Coco Raízes do Capibaribe", "18h", dia7.id, palco2.id);
        artistas.add(artista);
        artista = new Artista("Forró do Matulão do Mestre Grimário", "19h", dia7.id, palco2.id);
        artistas.add(artista);
        //dia8
        artista = new Artista("Sandoval Ferreira", "12h", dia8.id, palco2.id);
        artistas.add(artista);
        artista = new Artista("Orquestra Metais do Frevo", "13h", dia8.id, palco2.id);
        artistas.add(artista);
        artista = new Artista("Coco de Selma", "14h", dia8.id, palco2.id);
        artistas.add(artista);
        artista = new Artista("Maracatu Aurora Africana", "15h", dia8.id, palco2.id);
        artistas.add(artista);
        artista = new Artista("Coco Canavial do Valmir e Mestre Biô", "16h", dia8.id, palco2.id);
        artistas.add(artista);
        artista = new Artista("Damas e Valetes de Olinda", "17h", dia8.id, palco2.id);
        artistas.add(artista);
        artista = new Artista("T.C.M. Cariri Olindese (Patrimônio Vivo)", "18h", dia8.id, palco2.id);
        artistas.add(artista);
        artista = new Artista("Afoxé Oyá Takole Owô", "19h", dia8.id, palco2.id);
        artistas.add(artista);
        //dia9
        artista = new Artista("Reisado Os 3 Reis do Oriente", "13h", dia9.id, palco2.id);
        artistas.add(artista);
        artista = new Artista("Boi Diamante de Arcoverde", "14h", dia9.id, palco2.id);
        artistas.add(artista);
        artista = new Artista("Severino dos Oito Baixados", "15h", dia9.id, palco2.id);
        artistas.add(artista);
        artista = new Artista("Dona Glorinha do Coco", "16h", dia9.id, palco2.id);
        artistas.add(artista);
        artista = new Artista("O Bonde", "17h", dia9.id, palco2.id);
        artistas.add(artista);
        artista = new Artista("Afoxé Omo Nilê Ogunjá", "18h", dia9.id, palco2.id);
        artistas.add(artista);
        artista = new Artista("Orquestra Filarmônica Euterpina de Timbaúba (Patrimônio Vivo)", "19h", dia9.id, palco2.id);
        artistas.add(artista);
        /*Palco3*/
        //dia5
        artista = new Artista("Marcos Cabral", "17h", dia5.id, palco3.id);
        artistas.add(artista);
        artista = new Artista("Banda Tercina", "18h", dia5.id, palco3.id);
        artistas.add(artista);
        artista = new Artista("Dom Angelo", "19h", dia5.id, palco3.id);
        artistas.add(artista);
        artista = new Artista("Amaro Freitas", "20h", dia5.id, palco3.id);
        artistas.add(artista);
        //dia6
        artista = new Artista("Roberto Lima e Banda", "17h", dia6.id, palco3.id);
        artistas.add(artista);
        artista = new Artista("Danda e seu regional de ouro", "18h", dia6.id, palco3.id);
        artistas.add(artista);
        artista = new Artista("Rafael Marques", "19h", dia6.id, palco3.id);
        artistas.add(artista);
        artista = new Artista("Betto do Bandolim, com participação de Mestre Chocho", "20h", dia6.id, palco3.id);
        artistas.add(artista);
        //dia7
        artista = new Artista("Estação Brasil", "17h", dia7.id, palco3.id);
        artistas.add(artista);
        artista = new Artista("Aglaia Costa", "18h", dia7.id, palco3.id);
        artistas.add(artista);
        artista = new Artista("Hugo Linns", "19h", dia7.id, palco3.id);
        artistas.add(artista);
        artista = new Artista("Nicolas Krassik (RJ)", "20h", dia7.id, palco3.id);
        artistas.add(artista);
        //dia8
        artista = new Artista("Street Jazz Band", "17h", dia8.id, palco3.id);
        artistas.add(artista);
        artista = new Artista("Henrique Albino Trio", "18h", dia8.id, palco3.id);
        artistas.add(artista);
        artista = new Artista("Renato Bandeira e o Som da Madeira", "19h", dia8.id, palco3.id);
        artistas.add(artista);
        artista = new Artista("Noise Viola", "20h", dia8.id, palco3.id);
        artistas.add(artista);
        //dia9
        artista = new Artista("Salomão Miranda", "17h", dia9.id, palco3.id);
        artistas.add(artista);
        artista = new Artista("Poruu", "18h", dia9.id, palco3.id);
        artistas.add(artista);
        artista = new Artista("Claudio Rebeca", "19h", dia9.id, palco3.id);
        artistas.add(artista);
        artista = new Artista("Renato Borghetti e Quarteto", "20h", dia9.id, palco3.id);
        artistas.add(artista);
        /*Palco4*/
        //dia5
        artista = new Artista("Banda Gold Hits", "17h", dia5.id, palco4.id);
        artistas.add(artista);
        artista = new Artista("Barro", "18h", dia5.id, palco4.id);
        artistas.add(artista);
        artista = new Artista("Zé da Flauta e Banda Psicoativa", "19h", dia5.id, palco4.id);
        artistas.add(artista);
        artista = new Artista("Curumin (SP)", "20h20", dia5.id, palco4.id);
        artistas.add(artista);
        //dia6
        artista = new Artista("Milena Rimer", "17h", dia6.id, palco4.id);
        artistas.add(artista);
        artista = new Artista("João Fênix", "18h", dia6.id, palco4.id);
        artistas.add(artista);
        artista = new Artista("Ava Rocha (SP)", "19h", dia6.id, palco4.id);
        artistas.add(artista);
        artista = new Artista("Não Recomendados (SP)", "20h20", dia6.id, palco4.id);
        artistas.add(artista);
        //dia7
        artista = new Artista("Neander", "17h", dia7.id, palco4.id);
        artistas.add(artista);
        artista = new Artista("Alkymenia", "18h", dia7.id, palco4.id);
        artistas.add(artista);
        artista = new Artista("Banda Sinaya (SP)", "19h", dia7.id, palco4.id);
        artistas.add(artista);
        artista = new Artista("Devotos", "20h20", dia7.id, palco4.id);
        artistas.add(artista);
        //dia8
        artista = new Artista("Alexandre Revoredo", "17h", dia8.id, palco4.id);
        artistas.add(artista);
        artista = new Artista("Marsa", "18h", dia8.id, palco4.id);
        artistas.add(artista);
        artista = new Artista("Tibério Azul", "19h", dia8.id, palco4.id);
        artistas.add(artista);
        artista = new Artista("Mariana Aydar (SP)", "20h20", dia8.id, palco4.id);
        artistas.add(artista);
        //dia9
        artista = new Artista("Hercinho Gouveia", "17h", dia9.id, palco4.id);
        artistas.add(artista);
        artista = new Artista("Flaira Ferro", "18h", dia9.id, palco4.id);
        artistas.add(artista);
        artista = new Artista("Simone Mazzer (PR)", "19h", dia9.id, palco4.id);
        artistas.add(artista);
        artista = new Artista("Marina Lina (RJ)", "20h20", dia9.id, palco4.id);
        artistas.add(artista);
        /*Palco5*/
        //dia5
        artista = new Artista("Nando Azevedo", "22h", dia5.id, palco5.id);
        artistas.add(artista);
        artista = new Artista("Banda Segnos", "23h", dia5.id, palco5.id);
        artistas.add(artista);
        artista = new Artista("Assisão", "0h", dia5.id, palco5.id);
        artistas.add(artista);
        //dia6
        artista = new Artista("Mateus Cordeiro", "22h", dia6.id, palco5.id);
        artistas.add(artista);
        artista = new Artista("Truvinca", "23h", dia6.id, palco5.id);
        artistas.add(artista);
        artista = new Artista("Agostinho do Acordeon", "0h", dia6.id, palco5.id);
        artistas.add(artista);
        //dia7
        artista = new Artista("Zelyto Madeira", "22h", dia7.id, palco5.id);
        artistas.add(artista);
        artista = new Artista("Terezinha do Acordeon", "23h", dia7.id, palco5.id);
        artistas.add(artista);
        artista = new Artista("Cesar Amaral", "0h", dia7.id, palco5.id);
        artistas.add(artista);
        //dia8
        artista = new Artista("Forró Pesado de Garanhuns", "23h", dia8.id, palco5.id);
        artistas.add(artista);
        artista = new Artista("As Severinas", "0h", dia8.id, palco5.id);
        artistas.add(artista);
        artista = new Artista("Flávio Leandro", "1h", dia8.id, palco5.id);
        artistas.add(artista);
        //dia9
        artista = new Artista("Ivan Maceió", "23h", dia9.id, palco5.id);
        artistas.add(artista);
        artista = new Artista("Azulinho", "0h", dia9.id, palco5.id);
        artistas.add(artista);
        artista = new Artista("Banda Coruja e Seus Tangarás", "1h", dia9.id, palco5.id);
        artistas.add(artista);
        /*Palco6*/
        //dia1
        artista = new Artista("Kleber Araújo", "19h", dia1.id, palco6.id);
        artistas.add(artista);
        artista = new Artista("Zé de Tete", "20h20", dia1.id, palco6.id);
        artistas.add(artista);
        artista = new Artista("Luizinho Calixto", "22h30", dia1.id, palco6.id);
        artistas.add(artista);
        artista = new Artista("DJ Renato da Mata", "Intervalos e fim de noite", dia1.id, palco6.id);
        artistas.add(artista);
        //dia2
        artista = new Artista("Aganjú | Circo Coletivo Bartira", "18h", dia2.id, palco6.id);
        artistas.add(artista);
        artista = new Artista("Ganga Barreto", "19h", dia2.id, palco6.id);
        artistas.add(artista);
        artista = new Artista("Ylana Queiroga", "20h20", dia2.id, palco6.id);
        artistas.add(artista);
        artista = new Artista("Angela Ro Ro (RJ)", "22h30", dia2.id, palco6.id);
        artistas.add(artista);
        artista = new Artista("DJ Renato da Mata", "Intervalos e fim de noite", dia2.id, palco6.id);
        artistas.add(artista);
        //dia3
        artista = new Artista("Diablo Angel", "19h", dia3.id, palco6.id);
        artistas.add(artista);
        artista = new Artista("Bruno Souto", "20h20", dia3.id, palco6.id);
        artistas.add(artista);
        artista = new Artista("Graxa", "22h30", dia3.id, palco6.id);
        artistas.add(artista);
        //dia3
        artista = new Artista("As Bodas de Umbigolina Goiabenta (Teatro | BA)", "18h", dia4.id, palco6.id);
        artistas.add(artista);
        artista = new Artista("Projeto Armazém", "19h", dia4.id, palco6.id);
        artistas.add(artista);
        artista = new Artista("Mestre Lourimbau (BA)", "20h20", dia4.id, palco6.id);
        artistas.add(artista);
        artista = new Artista("Francisco, El Hombre (SP)", "22h30", dia4.id, palco6.id);
        artistas.add(artista);
        //dia5
        artista = new Artista("Cosmo Grão", "21h20", dia5.id, palco6.id);
        artistas.add(artista);
        //dia6
        artista = new Artista("Edmilson do Pífano", "21h20", dia6.id, palco6.id);
        artistas.add(artista);
        //dia7
        artista = new Artista("Camarones Orquestra Guitarrística (RN)", "21h20", dia7.id, palco6.id);
        artistas.add(artista);
        //dia8
        artista = new Artista("Rabecado", "21h20", dia8.id, palco6.id);
        artistas.add(artista);
        //dia9
        artista = new Artista("Jornada MCs | Edição FIG", "10h às 17h", dia9.id, palco6.id);
        artistas.add(artista);
        artista = new Artista("Mamelungos", "22h20", dia9.id, palco6.id);
        artistas.add(artista);
        /*palco7*/
        //dia5
        artista = new Artista("Mamulengo Teatro Riso – Mestre Zé Lopes (Patrimônio Vivo)", "16h", dia5.id, palco7.id);
        artistas.add(artista);
        artista = new Artista("Mamulengo Alegria", "17h", dia5.id, palco7.id);
        artistas.add(artista);
        //dia6
        artista = new Artista("Mamulengo Nova Geração", "15h", dia6.id, palco7.id);
        artistas.add(artista);
        artista = new Artista("O Grão Circo Mamulengo", "16h", dia6.id, palco7.id);
        artistas.add(artista);
        artista = new Artista("Coco de Roda do Cabo de Santo Agostinho " +
                "(Ponto de Cultura Farol da Vila - Coco de Pontezinha)", "17h", dia6.id, palco7.id);
        artistas.add(artista);
        //dia7
        artista = new Artista("Sementes da Brincadeira: As Presepadas de Benedito" +
                " brincando de Babau nos domingos de João" +
                "Redondo", "15h", dia7.id, palco7.id);
        artistas.add(artista);
        artista = new Artista("Mamulengo Riso das Crianças", "16h", dia7.id, palco7.id);
        artistas.add(artista);
        artista = new Artista("Sertão Maracatu - Batuque Nagô (Ponto de Cultura Orquestra Sertão)", "17h", dia7.id, palco7.id);
        artistas.add(artista);
        //dia8
        artista = new Artista("O Auto da Compadecida (Ponto de Cultura Teatro Experimental de Arte - TEA)", "16h", dia8.id, palco7.id);
        artistas.add(artista);
        //dia9
        artista = new Artista("Boi Tira Teima - Um Boi que Canta e Encanta (Ponto de Cultura Tira Teima)", "17h", dia9.id, palco7.id);
        artistas.add(artista);
        /*palco8*/
        //dia1
        artista = new Artista("Orquestra de Câmara de Pernambuco e Guinga", "16h30 - Solistas: Guilherme Calzavar (violão)," +
                " Cláudio Moura (violão) e Roberta Belo (oboé) |Regência: José Renato Accioly", dia1.id, palco8.id);
        artistas.add(artista);
        artista = new Artista("Cida Moreira – 'Soledade'", "21h", dia1.id, palco8.id);
        artistas.add(artista);
        //dia2
        artista = new Artista("Quinteto Danilo Brito", "16h30 - Danilo Brito (bandolim) | Carlos Moura (violão de 7 cordas) | Guilherme Girardi (violão) | Lucas Arantes" +
                "(cavaquinho) | Xelina Barros (pandeiro)", dia2.id, palco8.id);
        artistas.add(artista);
        artista = new Artista("Francis Hime e Olivia Hime – 'Sem Mais Adeus'", "21h", dia2.id, palco8.id);
        artistas.add(artista);
        //dia3
        artista = new Artista("Orquestra de Câmara de Pernambuco", "16h30 - Coro de Câmara do Conservatório Pernambucano de Música\n" +
                "Solistas: Leonardo Neiva (Barítono – SP) |Gleyce Melo (Soprano –PE) | Mônica Muniz (Mezzo-soprano – PE) | " +
                "Participações Especiais: Rodrigo Cruz (Barítono), Natália Duarte (Soprano) e Flávio Soares (Tenor)." +
                "Ópera e Musicais | Regência: José Renato Accioly", dia3.id, palco8.id);
        artistas.add(artista);
        artista = new Artista("Ellyana Caldas (Piano)", "21h", dia3.id, palco8.id);
        artistas.add(artista);
        artista = new Artista("Participações especiais", "Bozó (violão 7 Cordas) e Júnior Teles (percussão)", dia3.id, palco8.id);
        artistas.add(artista);
        //dia4
        artista = new Artista("Kristina Miller (Rússia) | Recital e piano", "16h", dia4.id, palco8.id);
        artistas.add(artista);
        artista = new Artista("Victor Assuncion (Piano)", "21h", dia4.id, palco8.id);
        artistas.add(artista);
        //dia5
        artista = new Artista("Show 'Em Casa com Luiz Eça'", "16h30 - Toninho Horta (violão e guitarra), Itamar Assiere (piano), Mauro Senise (sopros), Ricardo Costa (bateria), Zé" +
                " Renato (voz), Igor Eça (baixo e direção musical)", dia5.id, palco8.id);
        artistas.add(artista);
        artista = new Artista("Toninho Ferragutti e Bebê Kramer (Duo de Acordeon)", "21h - 'Como Manda o Figurino'", dia5.id, palco8.id);
        artistas.add(artista);
        //dia6
        artista = new Artista("SaGRAMA e Yamandu Costa", "16h30", dia6.id, palco8.id);
        artistas.add(artista);
        artista = new Artista("Libertango – 'Tangos Hermanos'", "21h - Estela Caldi (Piano), Alexandre Caldi (Saxofones e Flautas), Marcelo Caldi (Acordeon)", dia6.id, palco8.id);
        artistas.add(artista);
        //dia7
        artista = new Artista("Grupo Instrumental Brasil", "16h", dia7.id, palco8.id);
        artistas.add(artista);
        artista = new Artista("Duo Paula Bujes & Pedro Huff (CD Afluências)", "21h", dia7.id, palco8.id);
        artistas.add(artista);
        //dia8
        artista = new Artista("Orquestra Jovem de Pernambuco, com o contratenor Edson Cordeiro", "16h", dia8.id, palco8.id);
        artistas.add(artista);


        Hotel hotel = new Hotel("Tavares Correia", "Av. Rui Barbosa, 296 - Heliópolis, Garanhuns - PE, 55296-300", "(87) 3762-8700", 4, 8.1, 81, -8.8862707, -36.4845737);
        hoteis.add(hotel);
        hotel = new Hotel("Centro de Turismo e Lazer Sesc Garanhuns", "R. Manoel Clemente, 136 - Santo Antônio, Garanhuns - PE", "(87) 3762-8300", 4.5, -1, -1, -8.8920178, -36.4938565);
        hoteis.add(hotel);
        hotel = new Hotel("Palace Hotel", "Av. Rui Barbosa, 626 - Heliópolis, Garanhuns - PE", "(87) 3762-8750", 3.5, -1, 76, -8.8847141, -36.4819518);
        hoteis.add(hotel);
        hotel = new Hotel("Hotel Permanente", "Av. Santo Antônio, 179 - Centro, Garanhuns - PE, 55290-000", "(87) 3762-9080", 4.0, 7.5, 78, -8.8910673, -36.5630901);
        hoteis.add(hotel);
        hotel = new Hotel("Hotel Kamei", "R. Treze de Maio, 85 - Centro, Garanhuns - PE, 55295-040", "(87) 3761-3664", 4.0, 8.5, -1, -8.8900072, -36.5640859);
        hoteis.add(hotel);
        hotel = new Hotel("Mael Plaza", "Av. Júlio Brasileiro, 651 - Heliópolis, Garanhuns - PE, 55295-475", "(87) 3762-1222", -1, -1, 76, -8.8836255, -36.5527935);
        hoteis.add(hotel);
        hotel = new Hotel("Fazenda Alvorada", " R. Duarte Coelho, 110 - José Maria Dourado, Garanhuns - PE, 55297-800", "(87) 3761-0601", 4.0, -1, -1, -8.8735085, -36.5442196);
        hoteis.add(hotel);
        hotel = new Hotel("Hotel Maria Eliza", " Praça Dom Moura, 322 - Centro, Garanhuns ", "(87) 3762-0057", -1, -1, -1, -8.8882094, -8.8882094);
        hoteis.add(hotel);
        hotel = new Hotel("Hotel Rodrigues", "Av. Rui Barbosa, 688 - Heliópolis, Garanhuns - PE, 55298-000", "(87) 3761-0441", -1, -1, -1, -8.8842747, -36.5515324);
        hoteis.add(hotel);
        hotel = new Hotel("Hotel Real", "Av. Júlio Brasileiro, 1473 - Heliópolis, Garanhuns - PE, 55297-010", "(87) 3761-2160", -1, -1, -1, -8.8787065, -36.5460265);
        hoteis.add(hotel);
        hotel = new Hotel("Hotel Azevedo", " R. Coronel Antonio Souto, 57 - São José, Garanhuns - PE, 55295-270", "(87) 3762-6969", -1, -1, -1, -8.8876022, -36.5625132);
        hoteis.add(hotel);
        hotel = new Hotel("Figueiredo Hotel", "Av. Oliveira Lima, 337 - Heliópois, Garanhuns - PE, 55290-000", "(87) 3762-3237", -1, -1, -1, -8.8837995, -36.5501617);
        hoteis.add(hotel);
        hotel = new Hotel("Hotel D'Nyl", "Praça Dom Moura, 302 - Centro, Garanhuns - PE, 55295-220", "(87) 3761-0998", -1, -1, -1, -8.8885306, -36.5615544);
        hoteis.add(hotel);
        hotel = new Hotel("Ipanema Hotel", "Praça Dr.Manoel Jardim, 42 - Santo Antônio, Garanhuns - PE, 55293-280", "(87) 3763-1232", -1, -1, -1, -8.8923975, -36.5656956);
        hoteis.add(hotel);
        hotel = new Hotel("Diplomata Hotel", " R. Dr. José Mariano, 194 - Santo Antônio, Garanhuns - PE, 55295-335", "(87) 3761-0539", -1, -1, -1, -8.8896705, -36.5624596);
        hoteis.add(hotel);
        hotel = new Hotel("Hotel Village Confort Garanhuns", "Avenida Santo Antônio, 149 - Centro, Garanhuns - PE, 55293-000", "(87) 3761-3624", -1, -1, -1, -8.8911078, -36.5628319);
        hoteis.add(hotel);

        Restaurante rest = new Restaurante("Restaurante O Relojoeiro", " Av. Euclídes Dourado, 277 - Heliópolis, Garanhuns - PE, 55296-500", "(87) 3763-7095", -8.8816219, -36.5486978);
        restaurantes.add(rest);
        rest = new Restaurante("Tagliateli Ristorante", "Av. Euclídes Dourado, 250 - Heliópolis, Garanhuns - PE, 55296-500", "(87) 3761-6491", -8.881602, -36.4812377);
        restaurantes.add(rest);
        rest = new Restaurante("Terraço Churrascaria e Chopperia", "Av. Rui Barbosa, 1070 - Heliópolis, Garanhuns - PE", "(87) 3762-9032", -8.8824527, -36.4800572);
        restaurantes.add(rest);
        rest = new Restaurante("Chez Pascal", "Av. Rui Barbosa, 891 - Heliópolis, Garanhuns - PE, 55295-530", "telefone", -8.8824527, -36.4800572);
        restaurantes.add(rest);
        rest = new Restaurante("China Pólo", "Av. Euclídes Dourado, 309 - Heliópolis, Garanhuns - PE, 55296-500", "(87) 3761-3125", -8.8828445, -36.4790894);
        restaurantes.add(rest);
        rest = new Restaurante("Restaurante Fogo na Telha", "Av. Rui Barbosa - Heliópolis, Garanhuns - PE, 55290-000", "telefone", -8.8828445, -36.4802351);
        restaurantes.add(rest);
        rest = new Restaurante("Casa Café", "Av. Rui Barbosa, 574 - Heliópolis, Garanhuns - PE, 55296-300", "(87) 3762-5603", -8.8846456, -36.4824068);
        restaurantes.add(rest);
        rest = new Restaurante("Amazônia Mix", "Av. Rui Barbosa, 730 - Heliópolis, Garanhuns - PE", "(87) 99982-5176", -8.8846456, -36.4824068);
        restaurantes.add(rest);
        rest = new Restaurante("Mercearia Rui Barbosa Delicatessen", "Av. Rui Barbosa, 400 - Heliópolis, Garanhuns - PE", "(87) 3762-6667", -8.8853426, -36.4836692);
        restaurantes.add(rest);
        rest = new Restaurante("República - Coffee e Beer", "Av. Rui Barbosa, 522 - Heliópolis, Garanhuns - PE", "(87) 99961-3509", -8.8850591, -36.4830887);
        restaurantes.add(rest);
        rest = new Restaurante("Restaurante Na Sala", "Av. Rui Barbosa, 488 - Heliópolis, Garanhuns - PE, 55290-000", "telefone", -8.8850591, -36.4830887);
        restaurantes.add(rest);
        rest = new Restaurante("Madoska Garanhuns", "Av. Rui Barbosa, 522 - Heliópolis, Garanhuns - PE", "telefone", -8.8850591, -36.4830887);
        restaurantes.add(rest);
        rest = new Restaurante("Lanzhou Oriental Food e Pizzaria", "Av. Rui Barbosa, 605 - Heliópolis, Garanhuns - PE, 55295-530", "(87) 3762-5618", -8.8845125, -36.4827803);
        restaurantes.add(rest);
        rest = new Restaurante("D'Trigos", "Av. Rui Barbosa, 555 - Heliópolis, Garanhuns - PE, 55295-530", "(87) 3762-2811", -8.8845125, -36.4827803);
        restaurantes.add(rest);
        rest = new Restaurante("Gulla's Pastéis", "Av. Júlio Brasileiro, 661 - Heliópolis, Garanhuns - PE, 55295-475", "telefone", -8.8844625, -36.4830879);
        restaurantes.add(rest);
        rest = new Restaurante("Restaurante e Pizzaria Varanda", "Av. Euclídes Dourado, 498 - Heliópolis, Garanhuns - PE, 55296-500", "(87) 3761-1644", -8.8832435, -36.4812211);
        restaurantes.add(rest);
        rest = new Restaurante("Hox - Gourmet Burgers", "Av. Rui Barbosa, 793 - Heliópolis, Garanhuns - PE", "(87) 3763-4458", -8.8832435, -36.4812211);
        restaurantes.add(rest);
        rest = new Restaurante("Big Burguer Lanches", "endereco", "telefone", 888888, 9999999);
        restaurantes.add(rest);
        rest = new Restaurante("Restaurante Changai Express", "Av. Euclídes Dourado, 257 - Heliópolis, Garanhuns - PE, 55295-610", "(87) 3762-0080", -8.8814856, -36.4798741);
        restaurantes.add(rest);
        rest = new Restaurante("Pizzaria Due Fratelli", "R. Júlio Brasileiro, 89 - Heliópolis, Garanhuns - PE, 55297-010", "(87) 3761-0626", -8.886118, -36.4878584);
        restaurantes.add(rest);
        rest = new Restaurante("Soul Music Bar", "R. Joaquim Távora, 212 - Heliópolis, Garanhuns - PE, 55295-410", "telefone", -8.886118, -36.4878584);
        restaurantes.add(rest);
        rest = new Restaurante("Temak House", "Praça Souto Filho - 100 - Heliópilis, Garanhuns - PE, 55295-400", "(87) 3761-2238", -8.886782, -36.4882863);
        restaurantes.add(rest);
        rest = new Restaurante("Zanzibah", "R. Quinze de Novembro, 973 - São José, Garanhuns - PE, 55295-230", "(87) 3761-4822", -8.886782, -36.4882863);
        restaurantes.add(rest);
        rest = new Restaurante("Pizzaria Happy", "R. Amauri de Medeiros, 482 - Heliópolis, Garanhuns - PE, 55295-430", "(87) 3762-2199", -8.886782, -36.4882863);
        restaurantes.add(rest);
        rest = new Restaurante("Vitória Doceria & Café", "R. Dr. José Mariano, 677 - Santo Antônio, Garanhuns - PE, 55296-000", "(87) 3762-9219", -8.886782, -36.4882863);
        restaurantes.add(rest);
        rest = new Restaurante("Bebelu Sanduíches", "Av. Júlio Brasileiro, 55 - Heliópolis, Garanhuns - PE, 55290-000", "(87) 3761-7495", -8.8866686, -36.4870019);
        restaurantes.add(rest);
        rest = new Restaurante("Du Vin Bistrô", "R. Amauri de Medeiros, 182 - Heliópolis, Garanhuns - PE, 55295-430", "(87) 3761-6408", -8.8861855, -36.4884697);
        restaurantes.add(rest);
        rest = new Restaurante("Subway", "R. Amauri de Medeiros, 521 - Heliópolis, Garanhuns - PE, 55295-430", "(87) 3762-9752", -8.8865136, -36.4877979);
        restaurantes.add(rest);
        rest = new Restaurante("Açaí Concept", "R. Dr. José Mariano, 825 - Santo Antônio, Garanhuns - PE", "telefone", -8.8865136, -36.4877979);
        restaurantes.add(rest);
        rest = new Restaurante("Da Terra Sopas E Petiscos Restaurante", "Av. Júlio Brasileiro, 57 - Heliópolis, Garanhuns - PE", "(87) 3761-0814", -8.8865136, -36.4877979);
        restaurantes.add(rest);
        rest = new Restaurante("Pizza House Express", "R. Amauri de Medeiros, 450-482 - Heliópolis, Garanhuns - PE, 55295-430", "(87) 3762-1775", -8.8861855, -36.4884697);
        restaurantes.add(rest);
        rest = new Restaurante("Restaurante Maria Rita", "Av. Caruaru, 2051 - Heliópolis, Garanhuns - PE", "telefone", -8.8861855, -36.4884697);
        restaurantes.add(rest);
        rest = new Restaurante("Hashi Restaurante e Pizzaria", "R. São Vicente, 99 - Heliópolis, Garanhuns - PE, 55295-590", "(87) 3762-5366", -8.8854594, -36.4895748);
        restaurantes.add(rest);
        rest = new Restaurante("Bon Appétit Restaurante", "Av. Caruaru, 279 - Heliópolis, Garanhuns - PE", "(87) 99681-7173", -8.8854594, -36.4895748);
        restaurantes.add(rest);
        rest = new Restaurante("One Açaí", "Av. Caruaru, 693 - Heliópolis, Garanhuns - PE, 55268-380", "(87) 3762-5878", -8.8806682, -36.488062);
        restaurantes.add(rest);
        rest = new Restaurante("Sandro Pizzaria", "Rua Gal. Dantas Barreto, nº 19 & - Rua São Domingos, nº 164. - Centro, Garanhuns - PE, 55295-080", "(87)3762-1409", -8.8893803, -36.4965601);
        restaurantes.add(rest);
        rest = new Restaurante("Don Pastello", "Av. Santo Antônio, 281 - Santo Antônio, Garanhuns - PE, 55293-000", "(87) 3761-1511", -8.8911362, -36.4939585);
        restaurantes.add(rest);
        rest = new Restaurante("Kitinet Doceria", "Av. Santo Antônio, 117 - Santo Antônio, Garanhuns - PE, 55290-000", "telefone", -8.8911362, -36.4939585);
        restaurantes.add(rest);
        rest = new Restaurante("Chocolate Sete Colinas", "Av. Santo Antônio, 209 - Centro, Garanhuns - PE, 55293-000", "(87) 3763-2530", -8.8911362, -36.4939585);
        restaurantes.add(rest);
        rest = new Restaurante("Restaurante Pisa na Fulô", "Av. Santo Antônio, 190 - Santo Antônio, Garanhuns - PE", "telefone", -8.8911362, -36.4939585);
        restaurantes.add(rest);
        rest = new Restaurante("Padaria San Trigo", "R. Melo Peixoto, 106 - Santo Antônio, Garanhuns - PE, 55293-190", "(87) 3761-3440", -8.8923238, -36.4969357);
        restaurantes.add(rest);
        rest = new Restaurante("Sorveteria Conserva", "R. Ari Barroso, 139 - São José, Garanhuns - PE, 55290-000", "(87) 3762-3310", -8.889782, -36.494536);
        restaurantes.add(rest);
        rest = new Restaurante("Dona Antonia Restaurante", "R. Ari Barroso, 133 - São José, Garanhuns - PE", "(87) 99602-5209", -8.889782, -36.494536);
        restaurantes.add(rest);
        rest = new Restaurante("Tapioca do Matuto", "Rua Dantas Barreto, 78-A - Santo Antônio, Garanhuns - PE, 55295-080", "telefone", -8.8891536, -36.4945128);
        restaurantes.add(rest);
        rest = new Restaurante("Lanchonete e Confeitaria Doce De Mãe.", "R. Dantas Barreto, 228 - São José, Garanhuns - PE, 55295-230", "(87) 99614-7132", -8.8892252, -36.496194);
        restaurantes.add(rest);
        rest = new Restaurante("A Budega de Zé", "R. Barão do Rio Branco, s/n - Magano, Garanhuns - PE, 55290-000", "(87) 3762-0504", 8 - 8.8892252, -36.496194);
        restaurantes.add(rest);
        rest = new Restaurante("Don Fernandes", "R. São Miguel, 21 - Boa Vista, Garanhuns - PE, 55292-640", "(87) 99613-0664", -8.8955825, -36.4948588);
        restaurantes.add(rest);
        rest = new Restaurante("Azevedo - Hot Dog", "R. Cel. Antônio Vítor, 127 - São José, Garanhuns - PE, 55295-270", "telefone", -8.8874591, -36.49215);
        restaurantes.add(rest);
        rest = new Restaurante("Toca do Pastel", "Av. Afonso Pena - Santo Antônio, Garanhuns - PE, 55295-290", "telefone", -8.8865807, -36.4903993);
        restaurantes.add(rest);
        rest = new Restaurante("Churrascaria e Bar da Perua", "Rua Jerônimo Gueiros, 417-483 - Magano, Garanhuns - PE, 55294-590", "telefone", -8.8788478, -36.4963343);
        restaurantes.add(rest);
        rest = new Restaurante("Syd Esfiha", "R. Capitão Pedro Rodrigues, 67 - São José, Garanhuns - PE, 55295-110", "(87) 3762-9578", -8.8823504, -36.5025331);
        restaurantes.add(rest);
        rest = new Restaurante("Alladin Esfirra", "Av. Sátiro Ivo, 226 - Magano, Garanhuns - PE, 55294-270", "(87) 99902-6318", -8.8823504, -36.5025331);
        restaurantes.add(rest);
        rest = new Restaurante("Churrascaria Sabor Do Meio Dia", "Severiano Moraes Filho, Garanhuns - PE, 55297-690", "(87) 3762-0417", -8.8751107, -36.4697068);
        restaurantes.add(rest);
        rest = new Restaurante("Chocolate Sete Colinas", "R. Ernesto Dourado, 582 - Heliópolis, Garanhuns - PE, 55296-280", "(87) 3761-2530", -8.8823503, -36.5069105);
        restaurantes.add(rest);
        rest = new Restaurante("Estação Doçura II", "Av. Rui Barbosa, 1081 - Heliópolis, Garanhuns - PE, 55297-050", "3762-4013", -8.8823503, -36.5069105);
        restaurantes.add(rest);

        Hospital hosp = new Hospital("Hospital Regional Dom Moura", " Av. Simoa Gomes, s/n - Heliópolis", -8.8817735, -36.4862706);
        hospitais.add(hosp);
        hosp = new Hospital("Hospital Monte Sinai", "Av. Djalma Dutra, 222 - Heliópolis", -8.8856944, -36.4826372);
        hospitais.add(hosp);
        hosp = new Hospital("Hospital Infantil Palmira Sales", "R. Cap. João Leite, 146 - Santo Antônio", -8.8976389, -36.4980231);
        hospitais.add(hosp);
        hosp = new Hospital("Casa de Saúde e Maternidade Nossa Senhora do Perpétuo Socorro", "Av. Simoa Gomes, 33 - Heliópolis", -8.8868697, -36.4849051);
        hospitais.add(hosp);
        hosp = new Hospital("UPAE Garanhuns", "Rodovia BR 423 - Km 96,8 - Magano", -8.8787169, -36.4960134);
        hospitais.add(hosp);
        hosp = new Hospital("Clínica Dr. José Walter", "Av. Rui Barbosa, 631 - Heliópolis", -8.8817734, -36.4928367);
        hospitais.add(hosp);
        hosp = new Hospital("Memorial Clinic", "R. Ernesto Dourado, 654 - Heliópolis", -8.8817734, -36.4928367);
        hospitais.add(hosp);

        PontoTuristico ptur = new PontoTuristico("PontoTuristico A", 888888, 9999999, R.drawable.guadalajara1);
        pontosTuristicos.add(ptur);
        ptur = new PontoTuristico("PontoTuristico B", 888888, 9999999, R.drawable.guadalajara1);
        pontosTuristicos.add(ptur);
        ptur = new PontoTuristico("PontoTuristico C", 888888, 9999999, R.drawable.guadalajara1);
        pontosTuristicos.add(ptur);
        ptur = new PontoTuristico("PontoTuristico D", 888888, 9999999, R.drawable.guadalajara1);
        pontosTuristicos.add(ptur);
        ptur = new PontoTuristico("PontoTuristico E", 888888, 9999999, R.drawable.guadalajara1);
        pontosTuristicos.add(ptur);

        Mercado merc = new Mercado("Bonanza Supermercados", "R. Quinze de Novembro, 214 - Santo Antônio", -8.8875394, -36.4879443);
        mercados.add(merc);
        merc = new Mercado("Bonanza Supermercados", "R. Barão do Rio Branco, 5 - Santo Antônio", -8.891949, -36.493695);
        mercados.add(merc);
        merc = new Mercado("Supermercado Bonanza", "Av. Rui Barbosa, 996 - Heliópolis", -8.8875394, -36.4879443);
        mercados.add(merc);
        merc = new Mercado("Hiper Todo Dia", "R. Dr. José Mariano, 562-650 - Santo Antônio", -8.8875394, -36.4879443);
        mercados.add(merc);
        merc = new Mercado("Assaí Atacadista", "Avenida Irga, s/n - Severiano Moraes Filho", -8.8814338, -36.4782455);
        mercados.add(merc);
        merc = new Mercado("Supermercado Ipiranga", "Av. Júlio Brasileiro, 1061 - Heliópolis", -8.8844132, -36.4792867);
        mercados.add(merc);
        merc = new Mercado("CEAGA - Central de Abastecimento de Garanhuns", "R. Dom Mario Vilas Boa, 120 - São José", -8.8863601, -36.4904877);
        mercados.add(merc);
        merc = new Mercado("Supermercado TodoDia", "R. Melo Peixoto, 208 - Santo Antônio", -8.8921015, -36.4979003);
        mercados.add(merc);

        Polo polo = new Polo("Artes Cênicas", "Parque Euclides Dourado");
        PoloProgramacao programacao = new PoloProgramacao("Rosa Choque", "18h", "TEATRO ADULTO");
        polo.programacoes.add(programacao);
        programacao = new PoloProgramacao("Cena Circo: Mostra de Números Circenses", "16h", "CIRCO");
        polo.programacoes.add(programacao);
        programacao = new PoloProgramacao("Cabaret Brecht, canções de Kurt Weill e Bertolt Brecht", "17h", "PROGRAMAÇÃO ESPECIAL");
        polo.programacoes.add(programacao);
        programacao = new PoloProgramacao("A Erudita", "18h30", "TEATRO ADULTO");
        polo.programacoes.add(programacao);
        programacao = new PoloProgramacao("Bate-papo \"A influência dos contos de Caio Fernando Abreu e Marcelino Freire\"", "20h", "LITERATURA NA CENA");
        polo.programacoes.add(programacao);
        programacao = new PoloProgramacao("Réquiem para um rapaz triste", "22h", "LITERATURA NA CENA");
        polo.programacoes.add(programacao);
        programacao = new PoloProgramacao("Bicha Oca", "23h30", "LITERATURA NA CENA");
        polo.programacoes.add(programacao);
        polos.add(polo);
        polo = new Polo("Artesanato", "Parque Euclides Dourado");
        polos.add(polo);
        polo = new Polo("Artes Visuais", "Av. Dantas Barreto, 34");
        polos.add(polo);
        polo = new Polo("Audiovisual", "Cine Eldorado");
        polos.add(polo);
        polo = new Polo("Design e Moda", "Av. Dantas Barreto, 34");
        polos.add(polo);
        polo = new Polo("Fotografia", "Av. Dantas Barreto, 34");
        polos.add(polo);
        polo = new Polo("Gastronomia", "Praça Souto Filho");
        polos.add(polo);
        polo = new Polo("Literatura", "Sem local específico");
        polos.add(polo);
        polo = new Polo("Pontos de Cultura", "Escola Estadual Henrique Dias");
        polos.add(polo);
        polo = new Polo("Projetos Especiais", "Sem local espefífico");
        polos.add(polo);
    }
}
