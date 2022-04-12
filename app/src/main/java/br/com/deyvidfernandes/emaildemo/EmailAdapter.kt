package br.com.deyvidfernandes.emaildemo

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class EmailAdapter (private val dataSet: List<Email>): RecyclerView.Adapter<EmailAdapter.ViewHolder>(){

    class ViewHolder(view: View): RecyclerView.ViewHolder(view){
        val imageViewPerfil: ImageView
        val textViewUser: TextView
        val textViewTitle: TextView
        val textViewDate: TextView
        val imageButtonFavorite: ImageButton

        init {
            imageViewPerfil = view.findViewById(R.id.imageViewPerfil)
            textViewUser = view.findViewById(R.id.textViewUser)
            textViewTitle = view.findViewById(R.id.textViewTitle)
            textViewDate = view.findViewById(R.id.textViewDate)
            imageButtonFavorite = view.findViewById(R.id.imageButtonFavorite)
        }
    }

    //Define o layout
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
                        .inflate(R.layout.recyclerview_email, parent, false)

        return ViewHolder(view)
    }

    //De/Para Objeto para o layout
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val email = dataSet[position]
        holder.imageViewPerfil.setImageResource(email.image)
        holder.textViewUser.text = email.user
        holder.textViewTitle.text = email.title
        holder.textViewDate.text = email.date

        if(email.favorite){
            holder.imageButtonFavorite.setImageResource(R.drawable.ic_star_on);
        }
    }

    //Retorna o tamanho da lista
    override fun getItemCount(): Int {
        return dataSet.size
    }
}