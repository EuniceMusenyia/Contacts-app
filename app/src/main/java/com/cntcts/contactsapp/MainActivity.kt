package com.cntcts.contactsapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.cntcts.contactsapp.databinding.ActivityMainBinding
import com.google.android.material.floatingactionbutton.FloatingActionButton

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val buttons = findViewById<FloatingActionButton>(R.id.ftButton)
        buttons.setOnClickListener{
            val intent = Intent(this, AddContactActivity::class.java)
            startActivity(intent)
        }
    }

    override fun onResume() {
        super.onResume()
        displayContacts()
    }
    fun displayContacts(){
        var contact1 = ContactsData("https://media.istockphoto.com/id/1432226243/photo/happy-young-woman-of-color-smiling-at-the-camera-in-a-studio.jpg?s=612x612&w=0&k=20&c=rk75Rl4PTtXbEyj7RgSz_pJPlgEpUEsgcJVNGQZbrMw=","Eunice","eunice@gmail.com","+254 710365365")
        var contact2 = ContactsData("https://media.istockphoto.com/id/1389348844/photo/studio-shot-of-a-beautiful-young-woman-smiling-while-standing-against-a-grey-background.jpg?s=612x612&w=0&k=20&c=anRTfD_CkOxRdyFtvsiPopOluzKbhBNEQdh4okZImQc=","Wimmers","wimmers@gmail.com","+254 710486055")
        var contact3 = ContactsData("https://media.istockphoto.com/id/1455764286/photo/celebration-black-woman-and-excited-person-showing-happiness-and-winner-feeling-winning.jpg?s=612x612&w=0&k=20&c=N-dauzi4f7w0_gR1WnF4OKDj1Q3U7E-N1pQTyg00Db0=","Jannisa","janissa@gmail.com","+254 710389563")
        var contact4 = ContactsData("https://media.istockphoto.com/id/1455211526/photo/young-woman-looking-away-contemplating-her-new-years-resolutions.jpg?s=612x612&w=0&k=20&c=GZo3I8IONHxwZsSrUEc7zsJh5zFf_Ck0LF4z6oCL_EE=","Gabby","gabby@gmail.com","+254 71678365")
        var contact5 = ContactsData("https://media.istockphoto.com/id/1394347360/photo/confident-young-black-businesswoman-standing-at-a-window-in-an-office-alone.jpg?s=612x612&w=0&k=20&c=tOFptpFTIaBZ8LjQ1NiPrjKXku9AtERuWHOElfBMBvY=","Lucas","lucas@gmail.com","+254 71965895")
        var contact6= ContactsData("https://media.istockphoto.com/id/1413765605/photo/portrait-of-successful-african-american-business-woman.jpg?s=612x612&w=0&k=20&c=7SssKFIuj7EYG_c2A0ZIJUqZpd3hmjQW8P_TMF1WJ5I=","Nelson","nelson@gmail.com","+254 71459665")
        var contact7 = ContactsData("https://media.istockphoto.com/id/1410538853/photo/young-man-in-the-public-park.jpg?s=612x612&w=0&k=20&c=EtRJGnNOFPJ2HniBSLWKzsL9Xf7GHinHd5y2Tx3da0E=","Marie","marie@gmail.com","+254 710374903")
        var contact8 = ContactsData("https://media.istockphoto.com/id/1405189858/photo/attractive-black-woman-with-curly-hair.jpg?s=612x612&w=0&k=20&c=GmDPWIwYpdv9JNCQw2pQaKZCXmoMDQXPI8HEGg4HPbM=","Amanda","amanda@gmail.com","+254 720254763")
        var contact9 = ContactsData("https://media.istockphoto.com/id/1477755705/photo/afro-hairstyle-woman-portrait-on-the-street.jpg?s=612x612&w=0&k=20&c=phoQjnflVu5-f1gPKW1Xqtaa964SoC8vpX3F3hH_U2k=","Leon","leo@gmail.com","+254 778405385")
        var contact10 = ContactsData("https://media.istockphoto.com/id/1386479313/photo/happy-millennial-afro-american-business-woman-posing-isolated-on-white.jpg?s=612x612&w=0&k=20&c=8ssXDNTp1XAPan8Bg6mJRwG7EXHshFO5o0v9SIj96nY=","Glen","glen@gmail.com","+254 7579496550")
        var contactList = listOf<ContactsData>(contact1,contact2, contact3, contact4,contact5,contact6,contact7,contact8,contact9,contact10)
        binding.rvContacts.layoutManager = LinearLayoutManager(this)
        var contactsAdapter = ContactsRVAdapter(contactList)
        binding.rvContacts.adapter = contactsAdapter
    }
}