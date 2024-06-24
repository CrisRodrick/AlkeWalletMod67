package com.example.alkewalletandroid.Home_page


import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.MutableLiveData
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.alkewalletandroid.data.remote.FromInternet.TransactionView
import com.example.alkewalletandroid.databinding.RvTransactionItemBinding


class TraansaccionsAdapter : RecyclerView.Adapter<TraansaccionsAdapter.TransactionViewHolder>() {

    private var listTransaction = listOf<TransactionView>()
    private val selectedTransaction= MutableLiveData<TransactionView>()

    private val transactions: MutableList<TransactionView>
        get() = mutableListOf()

    fun addData(list: List<TransactionView>) {
        val size = transactions.size
        transactions.addAll(list)
        notifyItemRangeInserted(size, list.size)
    }
    //rvTransaction es el nombre del archivo que pasa el formato al recycleview
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TransactionViewHolder {
        val binding = RvTransactionItemBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return TransactionViewHolder(binding)
    }

    override fun onBindViewHolder(holder: TransactionViewHolder, position: Int) {
        val transaction = transactions[position]
        holder.bind(transaction)
    }

    override fun getItemCount(): Int {
        return transactions.count()
    }
//aqui solo uno a la Transaction Local, debiera ser a la Remota.
    inner class TransactionViewHolder(val binding: RvTransactionItemBinding) :
        RecyclerView.ViewHolder(binding.root), View.OnClickListener {
        fun bind(transaction: TransactionView) {
            Glide.with(binding.imagePerson).load(transaction.type).centerCrop().into(binding.imagePerson)
            binding.textviewName.text = transaction.name
            binding.textviewDate.text = transaction.date
            binding.textviewAmount.text = transaction.amount
            itemView.setOnClickListener(this)
        }

    override fun onClick(v: View?) {
        selectedTransaction.value = listTransaction[adapterPosition]
        Log.d("ONCLICK", adapterPosition.toString())
    }
}

}



//private fun <TransactionView> View.setOnClickListener(viewHolder: TransactionViewHolder) {

//}


//profe
/*inner class CourseVH(private val mbinding: CoursesListBinding) :
    RecyclerView.ViewHolder(mbinding.root), View.OnClickListener {

    fun bin(course: CoursesEntity) {
        Glide.with(mbinding.ivLogo).load(course.image).centerCrop().into(mbinding.ivLogo)
        mbinding.tvname.text = course.title
        mbinding.tvdescription.text = course.previewDescription
        mbinding.tvduration.text = "duracion:" + course.weeks.toString() + "semanas"
        mbinding.tvstart.text = "Inicio" + course.start
        itemView.setOnClickListener(this)



    @SuppressLint("SuspiciousIndentation")
    override fun onClick(v: View?) {
        selectedCourse.value = listCourses[adapterPosition]
        Log.d("ONCLICK", adapterPosition.toString())
    }*/



