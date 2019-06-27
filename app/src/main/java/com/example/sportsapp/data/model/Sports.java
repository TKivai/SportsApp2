package com.example.sportsapp.data.model;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Sports {

    @SerializedName("data")
    private List<SportsData> sports;

    public Sports(List<SportsData> sports) {
        this.sports = sports;
    }

    public List<SportsData> getSportsData(){
        return sports;
    }

    public class SportsData{
        @SerializedName("name")
        private String name;
        @SerializedName("id")
        private int id;

        public SportsData(String name, int count) {
            this.name = name;
            this.id = count;
        }

        public String getSport(){
            return name;
        }

        public void setSport(String name) {
            this.name = name;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }
    }

}
