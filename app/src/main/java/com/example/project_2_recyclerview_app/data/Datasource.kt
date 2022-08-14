package com.example.project_2_recyclerview_app.data
import com.example.project_2_recyclerview_app.R
import com.example.project_2_recyclerview_app.model.Games

class Datasource() {
    fun loadGames():List<Games>{
        return listOf<Games>(
            Games(R.string.TOURNAMENT_1,R.drawable.pubg_mobile),
            Games(R.string.TOURNAMENT_2,R.drawable.rocket_league),
            Games(R.string.TOURNAMENT_3,R.drawable.fortnite),
            Games(R.string.TOURNAMENT_4,R.drawable.rainbow_six),
            Games(R.string.TOURNAMENT_5,R.drawable.dota_2))//end list
    }//End fun
}// end class