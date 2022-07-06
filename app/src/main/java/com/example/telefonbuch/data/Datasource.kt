package com.example.telefonbuch.data

import com.example.telefonbuch.data.model.Contact

class Datasource {

    fun loadContacts(): MutableList<Contact> {
        return mutableListOf(

            Contact(
                "Alfred Apfel",
                "07127122354"
            ),

            Contact(
                "Bastian Schweinsteiger",
                "07127567834"
            ),

            Contact(
                "Bernhard Reichert",
                "07127982365"
            ),

            Contact(
                "Christian Hummel",
                "07127891234"
            ),

            Contact(
                "Doris Westerheim",
                "07127127834"
            ),

            Contact(
                "Elias Riehm",
                "01257865457"
            ),

            Contact(
                "Friedrich Vogel",
                "073445356545"
            ),

            Contact(
                "Gustav Graf",
                "073343534563"
            ),

            Contact(
                "Heinz Hermann",
                "07223456645"
            ),

            Contact(
                "Katrin Reich",
                "07454366534"
            )

        )
    }

}