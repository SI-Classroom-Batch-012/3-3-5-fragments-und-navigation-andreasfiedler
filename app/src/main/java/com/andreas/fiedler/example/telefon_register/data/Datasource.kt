package com.andreas.fiedler.example.telefon_register.data

class Datasource {

    fun loadContacts(): MutableList<Adress> {
        return mutableListOf(
            Adress("Uwe Birnbaum", "+49 162 6544672", "Leipzig"),
            Adress("Karsten Hummels", "+49 173 30423354", "Dortmund")

        )
    }
}