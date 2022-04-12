package br.com.deyvidfernandes.emaildemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.DividerItemDecoration




class MainActivity : AppCompatActivity() {
    var emails = mutableListOf<Email>(
        Email(R.drawable.ic_user_male, "Nelson Paulo Márcio Mendes", "Mollis euismod duis proin sed in sagittis", "07-04-22", true),
        Email(R.drawable.ic_user_male, "Renato Marcelo Giovanni", "Augue sollicitudin suscipit posuere", "01-04-22", false),
        Email(R.drawable.ic_user_male, "Tomás Rafael Calebe da Mata", "Donec vestibulum varius eget eu tortor felis, sociosqu ligula ad risus lacinia", "29-03-22", false),
        Email(R.drawable.ic_user_female, "Milena Marlene Vera Nunes", "Sollicitudin vestibulum lectus ad leo class leo, eleifend auctor vestibulum sollicitudin himenaeos", "28-03-22", true),
        Email(R.drawable.ic_user_female, "Lúcia Bárbara Duarte", "Cubilia quis turpis neque etiam vivamus tristique, commodo pretium hendrerit sodales venenatis", "20-03-22", false),
        Email(R.drawable.ic_user_male, "Sérgio Victor da Costa", "Ante varius risus quis potenti lacus pellentesque, neque commodo ut sem imperdiet", "12-03-22", true),
        Email(R.drawable.ic_user_male, "Heitor Benjamin Nathan Araújo", "Donec augue luctus fames viverra aliquet libero, conubia imperdiet hac cras est", "11-02-22", true),
        Email(R.drawable.ic_user_female, "Cláudia Silvana Isabela", "Ut mollis platea habitant, ut euismod blandit lacus, habitant integer", "01-02-22", false),
        Email(R.drawable.ic_user_female, "Nair Priscila Jesus", "Fames facilisis enim suspendisse aliquam conubia", "01-01-22", true))

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = EmailAdapter(emails)

        val itemDecor = DividerItemDecoration(this, DividerItemDecoration.VERTICAL)
        recyclerView.addItemDecoration(itemDecor)
    }
}