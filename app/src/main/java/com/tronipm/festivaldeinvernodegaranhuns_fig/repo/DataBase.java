package com.tronipm.festivaldeinvernodegaranhuns_fig.repo;

import android.util.Log;

import com.tronipm.festivaldeinvernodegaranhuns_fig.R;
import com.tronipm.festivaldeinvernodegaranhuns_fig.entidades.Artista;
import com.tronipm.festivaldeinvernodegaranhuns_fig.entidades.Dia;
import com.tronipm.festivaldeinvernodegaranhuns_fig.entidades.Palco;

import java.util.ArrayList;

/**
 * Created by Mateus on 19/07/2017.
 * For project FestivaldeInvernodeGaranhuns-FIG.
 * Contact: <paulomatew@gmail.com>
 */

public class DataBase {
    public ArrayList<Palco> palcos = new ArrayList<>();
    public ArrayList<Dia> dias = new ArrayList<>();
    public ArrayList<Artista> artistas = new ArrayList<>();

    public DataBase() {
        Log.d(this.getClass().getSimpleName(), "init()");
        /*TODO PALCOS*/
        Palco palco1 = new Palco("Palco Mestre Dominguinhos", "Praça Mestre Dominguinhos", "11111", "2222222", 1, R.drawable.guadalajara1);
        palcos.add(palco1);
        Palco palco2 = new Palco("Palco Cultura Popular", "Sem descrição", "11111", "2222222", 2, R.drawable.guadalajara1);
        palcos.add(palco2);
        Palco palco3 = new Palco("Palco Instrumental", "Parque Ruber Van Der Linden ", "11111", "2222222", 3, R.drawable.guadalajara1);
        palcos.add(palco3);
        Palco palco4 = new Palco("Palco Pop", "Sem descrição", "11111", "2222222", 4, R.drawable.guadalajara1);
        palcos.add(palco4);
        Palco palco5 = new Palco("Palco Forró", "Sem descrição", "11111", "2222222", 5, R.drawable.guadalajara1);
        palcos.add(palco5);
        Palco palco6 = new Palco("Palco Som na Rural", "Parque Euclides Dourado", "11111", "2222222", 6, R.drawable.guadalajara1);
        palcos.add(palco6);
        Palco palco7 = new Palco("Palco Mamulengos e Pontos de Cultura", "Parque Euclides Dourado", "11111", "2222222", 7, R.drawable.guadalajara1);
        palcos.add(palco7);
        Palco palco8 = new Palco("Palco Catedral", "Igreja de Santo Antônio", "11111", "2222222", 8, R.drawable.guadalajara1);
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

    }
}
