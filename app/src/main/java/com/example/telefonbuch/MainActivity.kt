package com.example.telefonbuch

import android.content.Context
import android.graphics.Insets.add
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.inputmethod.InputMethodManager
import android.widget.Toast
import androidx.core.graphics.Insets.add
import androidx.core.view.OneShotPreDrawListener.add
import com.example.telefonbuch.adapter.ItemAdapter
import com.example.telefonbuch.data.Datasource
import com.example.telefonbuch.data.model.Contact
import com.example.telefonbuch.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


    val contacts = Datasource().loadContacts()

        binding.TBRecycler.adapter = ItemAdapter(this, contacts)
        binding.buttonHinzufGen.setOnClickListener {
        val name = binding.EditTextName.text.toString()
        val nummer = binding.EditTextTelefonnummer.text.toString()



            val newName = binding.EditTextName.text.toString()
            val newNumber = binding.EditTextTelefonnummer.text.toString()

            if (newNumber != "") {
                val newContact = Contact(newNumber, newName)
                contacts.add(0, newContact)
                binding.TBRecycler.adapter?.notifyItemInserted(0)
                binding.EditTextName.setText("")
                Toast.makeText(this, "Contact has been added", Toast.LENGTH_SHORT).show()
            }

            val imm = this.getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
            imm.hideSoftInputFromWindow(currentFocus?.windowToken, 0)

        }

    }
}