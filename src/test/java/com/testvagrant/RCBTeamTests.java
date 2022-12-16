package com.testvagrant;

import java.io.FileNotFoundException;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.google.gson.Gson;
import com.google.gson.JsonIOException;
import com.google.gson.JsonSyntaxException;

public class RCBTeamTests {
    private  Player[] players;

    @BeforeClass
    public void prepareTestData() throws JsonSyntaxException, JsonIOException, FileNotFoundException{
        players = new Gson().fromJson(JsonUtils.readJsonFile("./RCBTeam.json").get("player"),Player[].class);
    }

    @Test
    public void verifyForeignPlayerInTeam(){
        Assert.assertEquals(RCBTeamData.getNumberOfForeignPlayers(players), 4,"Foreign Players are not 4 in RCB Team."); 
    }

    @Test
    public void verifyNoOfWicketKeeperInTeam(){
        Assert.assertTrue(RCBTeamData.validateAtleastOneWicketKeeperInTeam(players)>=1 ,"There are no wicket Keepers in RCB Team.");   
    }

}
