package com.webcode.firebasefirestorecrudapp

import android.app.ProgressDialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.firebase.firestore.FirebaseFirestore
import com.webcode.firebasefirestorecrudapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    val pd = ProgressDialog(this)
    val db = FirebaseFirestore.getInstance()
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)



        binding.SaveBTN.setOnClickListener {

         binding.IdEDTXT.text.toString().trim()
         binding.NameEDTXT.text.toString().trim()
         binding.EmailEDTXT.text.toString().trim()
         binding.BirthdayEDTXT.text.toString().trim()

            uploadData(Id, Name, Email,Birthyay)


        }

    }
    private fun uploadData(Id: String, Name: String, Email: String, Birthyay:String):String {

        pd.Id("Adding Data to Firebase")
        pd.show()
    }
}