package com.example.michielglibert.runescapegptracker.models

/**
 * Created by Michiel Glibert on 22/01/2018.
 */
class Flip(val name: String, val buyPrice: Int, val sellPrice: Int, val quantity: Int) {
    val id: Int = 0
    val itemId: Int = 0

    fun calculateProfit(): Int {
        return sellPrice - buyPrice
    }
}