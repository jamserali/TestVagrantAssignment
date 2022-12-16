package com.testvagrant;

import java.io.FileNotFoundException;
import java.io.FileReader;

import com.google.gson.Gson;
import com.google.gson.JsonIOException;
import com.google.gson.JsonObject;
import com.google.gson.JsonSyntaxException;

/**
 * This class contains JSON related Utility Methods
 */
public class JsonUtils 
{
  
  // This Method used to read Json file
    public static JsonObject readJsonFile(String path) throws JsonSyntaxException, JsonIOException, FileNotFoundException{
        return new Gson().fromJson(new FileReader(path), JsonObject.class);
    }

}
