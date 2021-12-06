package com.galaxe.day6

import android.app.ProgressDialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AlertDialog

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun showAlert(v: View){
        var alert = AlertDialog.Builder(this)
        alert.setTitle("My Owner")
        alert.setMessage("Do you want to exit?")
        alert.setIcon(android.R.drawable.ic_dialog_alert)
        alert.setPositiveButton("Cancel"){dialog, which ->
            Toast.makeText(this, "Continue", Toast.LENGTH_LONG).show()
        }
        alert.setNegativeButton("Exit"){dialog, which ->
            finish()
        }
        var myalert : AlertDialog = alert.create()
        myalert.show()
    }
    fun showPD(v: View){
        var prg = ProgressDialog(this)
        prg.setTitle("Downloading file")
        prg.setMessage("Downloading...")
        prg.setProgressStyle(ProgressDialog.STYLE_HORIZONTAL)
        prg.setProgressStyle(ProgressDialog.STYLE_SPINNER)
        prg.setCancelable(true)
        prg.show()
    }

}