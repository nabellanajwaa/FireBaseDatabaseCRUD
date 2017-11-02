package com.example.asus.firebasedatabasecrud;

/**
 * Created by Asus on 2/11/2017.
 */

public class Artist {

    String srtidtID;
    String artistName;

    public Artist() {

    }
    public Artist(String srtidtID, String artistName) {
        this.srtidtID = srtidtID;
        this.artistName = artistName;
    }


    public String getSrtidtID() {
        return srtidtID;
    }

    public String getArtistName() {
        return artistName;
    }

    public void setSrtidtID(String srtidtID) {
        this.srtidtID = srtidtID;
    }

    public void setArtistName(String artistName) {
        this.artistName = artistName;
    }



  }

