package id.moviedb

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mail)

        val senders = listOf("Ahmad", "Eko", "Jeffri", "Fikri")
        val mailAdapter = MailAdapter(senders)

        val rv = findViewById<RecyclerView>(R.id.rv_mail)
        rv.adapter = mailAdapter
    }

}