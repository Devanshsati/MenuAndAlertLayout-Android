package com.example.menuandalertlayout

import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import cn.pedant.SweetAlert.SweetAlertDialog

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        findViewById<Button>(R.id.button).setOnClickListener {
            CustomMenu().showMenu(this, it)
        }

        findViewById<Button>(R.id.button2).setOnClickListener {
            val dialog = AlertDialog.Builder(this)
            dialog.setTitle(R.string.dialog_title)
            dialog.setMessage(R.string.dialog_message)
            dialog.setIcon(R.drawable.baseline_add_alert_24)
            dialog.setPositiveButton(R.string.dialog_positive) { _, _ ->
                Toast.makeText(this, "Clicked " + getString(R.string.dialog_positive), Toast.LENGTH_SHORT).show()
            }
            dialog.setNegativeButton(R.string.dialog_negative) { _, _ ->
                Toast.makeText(this, "Clicked " + getString(R.string.dialog_negative), Toast.LENGTH_SHORT).show()
            }
            dialog.setNeutralButton(R.string.dialog_neutral) { _, _ ->
                Toast.makeText(this, "Clicked " + getString(R.string.dialog_neutral), Toast.LENGTH_SHORT).show()
            }

            dialog.create().setCancelable(false)
            dialog.show()
        }

        findViewById<Button>(R.id.button3).setOnClickListener {
            SweetAlertDialog(this).setTitleText("Here's a Basic message!").show()
        }

        findViewById<Button>(R.id.button4).setOnClickListener {
            SweetAlertDialog(this).setTitleText("Here's a message with Title and Text!").setContentText("It's pretty, isn't it?").show()
        }

        findViewById<Button>(R.id.button5).setOnClickListener {
            SweetAlertDialog(this, SweetAlertDialog.ERROR_TYPE).setTitleText("Oops...").setContentText("Something went wrong!").show()
        }

        findViewById<Button>(R.id.button6).setOnClickListener {
            SweetAlertDialog(this, SweetAlertDialog.WARNING_TYPE).setTitleText("Are you sure?").setContentText("Won't be able to recover this file!").setConfirmText("Yes,delete it!").show()
        }

        findViewById<Button>(R.id.button7).setOnClickListener {
            SweetAlertDialog(this, SweetAlertDialog.SUCCESS_TYPE).setTitleText("Success!").setContentText("Your file has been deleted!").show()
        }

        findViewById<Button>(R.id.button7).setOnClickListener {
            SweetAlertDialog(this, SweetAlertDialog.CUSTOM_IMAGE_TYPE).setTitleText("Sweet!").setContentText("Here's a custom image.").setCustomImage(R.drawable.baseline_adb_24).show()
        }
    }
}