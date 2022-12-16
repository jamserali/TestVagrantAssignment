package com.testvagrant;

import java.util.Arrays;

public class RCBTeamData {

    public static long getNumberOfForeignPlayers(Player[] player){
        return Arrays.stream(player).filter(players -> !players.getCountry().equals("India")).count();
    }

    public static long validateAtleastOneWicketKeeperInTeam(Player[] player){
       return Arrays.stream(player).filter(players -> players.getRole().equals("Wicket-keeper")).count();
    }
    
}
