package com.application.app.modules.signup4.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.application.app.R
import com.application.app.databinding.RowSignup5Binding
import com.application.app.modules.signup4.`data`.model.Signup5RowModel
import kotlin.Int
import kotlin.Unit
import kotlin.collections.List

public class RecyclerViewAdapter(
  public var list: List<Signup5RowModel>
) : RecyclerView.Adapter<RecyclerViewAdapter.RowSignup5VH>() {
  private var clickListener: OnItemClickListener? = null

  public fun updateData(newData: List<Signup5RowModel>): Unit {
    list = newData
    notifyDataSetChanged()
  }

  public fun setOnItemClickListener(clickListener: OnItemClickListener): Unit {
    this.clickListener = clickListener
  }

  public override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowSignup5VH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_signup_5,parent,false)
    return RowSignup5VH(view)
  }

  public override fun onBindViewHolder(holder: RowSignup5VH, position: Int): Unit {
    val signup5RowModel = Signup5RowModel()
    // TODO uncomment following line after integration with data source
    // val signup5RowModel = list[position]
    holder.binding.signup5RowModel = signup5RowModel
  }

  public override fun getItemCount(): Int = 2
  // TODO uncomment following line after integration with data source
  // list.size

  public interface OnItemClickListener {
    public fun onItemClick(
      view: View,
      position: Int,
      item: Signup5RowModel
    ): Unit {
    }
  }

  public inner class RowSignup5VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    public val binding: RowSignup5Binding = RowSignup5Binding.bind(itemView)
  }
}
