package com.example.myapplication.Models

class MatchModel {
    lateinit var category :String
    lateinit var match_name :String
    lateinit var team1_name :String
    lateinit var team1_full :String
    lateinit var team2_full :String
    lateinit var team2_name :String
     val team_status : Int = 0
     val match_rating : Int = 0
     val match_status : Int = 0
     val mytextarea : Int = 0
     val date_time : Int = 0
     val team1_players : Int = 0
     val subcategory : Int = 0
     //Images
    lateinit var team_preview: String
    lateinit var file : String
    lateinit var file2 : String

    constructor(
        category: String,
        match_name: String,
        team1_name: String,
        team1_full: String,
        team2_full: String,
        team2_name: String,
        team_preview: String,
        file: String,
        file2: String
    ) {
        this.category = category
        this.match_name = match_name
        this.team1_name = team1_name
        this.team1_full = team1_full
        this.team2_full = team2_full
        this.team2_name = team2_name
        this.team_preview = team_preview
        this.file = file
        this.file2 = file2
    }
}