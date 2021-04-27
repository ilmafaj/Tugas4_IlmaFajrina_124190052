package com.example.tugas4_ilmafaajrina_124190052;

package com.example.tugas4_altrariqwelfareyubaidi_124190054;

import java.util.ArrayList;

public class PlayerData {
    private static  String[] namaData = new String[]{"Edouard Mendy",
            "Antonio Rudiger", "Thiago Silva", "Cesar Azpilicueta",
            "N'Golo Kante", "Mason Mount", "Kai Havertz", "Christian Pulisic", "Timo Werner"};

    private static int[] gambarData = new int[]{R.drawable.chelsea_1, R.drawable.chelsea_2, R.drawable.chelsea_3,
            R.drawable.chelsea_4, R.drawable.chelsea_5, R.drawable.chelsea_6, R.drawable.chelsea_7,
            R.drawable.chelsea_8, R.drawable.chelsea_9};

    public static ArrayList<PlayerModel> getListDataModel(){
        PlayerModel teamModel = null;
        ArrayList<PlayerModel> playersList = new ArrayList<PlayerModel>();
        for ( int i = 0; i < namaData.length; i++){
            teamModel = new PlayerModel();
            teamModel.setGambarItem(gambarData[i]);
            teamModel.setNamaItem(namaData[i]);
            playersList.add(teamModel);
        }
        return playersList;
    }
}