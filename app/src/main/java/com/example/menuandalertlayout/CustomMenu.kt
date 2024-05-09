package com.example.menuandalertlayout

import android.content.Context
import android.view.View
import android.widget.PopupMenu
import android.widget.Toast

class CustomMenu {

    fun showMenu(context : Context, view : View){
        val pop = PopupMenu(context, view)
        pop.inflate(R.menu.menu)
        pop.setOnMenuItemClickListener {
            when(it.itemId){
                R.id.share -> { Toast.makeText(context, "Shared", Toast.LENGTH_SHORT).show(); true}
                R.id.contact -> { Toast.makeText(context, "Contact Us", Toast.LENGTH_SHORT).show(); true }
                R.id.faqs -> { Toast.makeText(context, "FAQ's", Toast.LENGTH_SHORT).show(); true }
                R.id.about -> { Toast.makeText(context, "About Mee", Toast.LENGTH_SHORT).show(); true }
                else -> false
            }
        }

        try {
            val field = PopupMenu::class.java.getDeclaredField("mPopup")
            field.isAccessible = true
            val mPopup = field.get(pop)
            mPopup.javaClass.getDeclaredMethod("setForceShowIcon", Boolean::class.java).invoke(mPopup,true)
        }catch (e:Exception){
            e.printStackTrace()
        }finally {
            pop.show()
        }
    }
}