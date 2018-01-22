package com.example.michielglibert.runescapegptracker.data

import com.example.michielglibert.runescapegptracker.models.Flip

/**
 * Created by Michiel Glibert on 22/01/2018.
 */

class DummyData {
    companion object {
        fun getFlips():List<Flip> {
            return mutableListOf(
                    Flip("Zamorak godsword", 4432548, 4480912, 5),
                    Flip("Ahrim's robetop", 1220378, 1227662, 10),
                    Flip("Wine of zamorak", 1902,1951,5000),
                    Flip("Wine of zamorak", 1902,1851,5000),
                    Flip("Zamorak godsword", 4432548, 4480912, 5),
                    Flip("Ahrim's robetop", 1220378, 1227662, 10),
                    Flip("Wine of zamorak", 1902,1951,5000),
                    Flip("Wine of zamorak", 1902,1851,5000),
                    Flip("Zamorak godsword", 4432548, 4480912, 5),
                    Flip("Ahrim's robetop", 1220378, 1227662, 10),
                    Flip("Wine of zamorak", 1902,1951,5000),
                    Flip("Wine of zamorak", 1902,1851,5000)
            )
        }
    }
}