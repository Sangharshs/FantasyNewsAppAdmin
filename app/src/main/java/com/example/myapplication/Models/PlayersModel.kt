package com.example.myapplication.Models

class PlayersModel (playerName: String?, playerImage: String?, creditPoint: String?,points : String?){
    private var playerName: String
    private var playerImage : String
    private var creditPoint : String
    private var points : String

    init {
        this.playerName = playerName!!
        this.playerImage = playerImage!!
        this.creditPoint = creditPoint!!
        this.points = points!!
    }




}