package com.jyotsna.appbar

import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main) }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.custom_menu,menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId){
            R.id.Search -> {
                Toast.makeText(this,"you clicked search!",Toast.LENGTH_LONG ).show()
                return  true
            }
            R.id.Favorite -> {
                Toast.makeText(this,"you clicked Favorite!",Toast.LENGTH_LONG ).show()
                return  true
            }
            R.id.Share -> {
                Toast.makeText(this,"you clicked Share!",Toast.LENGTH_LONG ).show()
                return  true
            }
            R.id.Whatsapp -> {
                Toast.makeText(this,"you clicked Whatsapp!",Toast.LENGTH_LONG ).show()
                return  true
            }
            R.id.Instagram -> {
                Toast.makeText(this,"you clicked Instagram!",Toast.LENGTH_LONG ).show()
                return  true
            }

            else -> super.onOptionsItemSelected(item)
        }

    }
    }
