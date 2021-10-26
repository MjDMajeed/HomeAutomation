package com.application.app.modules.splash.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.application.app.R
import com.application.app.databinding.RowSplash1Binding
import com.application.app.modules.splash.`data`.model.Splash1RowModel
import kotlin.Int
import kotlin.Unit
import kotlin.collections.List

public class RecyclerViewAdapter(
  public var list: List<Splash1RowModel>
) : RecyclerView.Adapter<RecyclerViewAdapter.RowSplash1VH>() {
  private var clickListener: OnItemClickListener? = null

  public fun updateData(newData: List<Splash1RowModel>): Unit {
    list = newData
    notifyDataSetChanged()
  }

  public fun setOnItemClickListener(clickListener: OnItemClickListener): Unit {
    this.clickListener = clickListener
  }

  public override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowSplash1VH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_splash1,parent,false)
    return RowSplash1VH(view)
  }

  public override fun onBindViewHolder(holder: RowSplash1VH, position: Int): Unit {
    val splash1RowModel = Splash1RowModel()
    // TODO uncomment following line after integration with data source
    // val splash1RowModel = list[position]
    holder.binding.splash1RowModel = splash1RowModel
  }

  public override fun getItemCount(): Int = 2
  // TODO uncomment following line after integration with data source
  // list.size

  public interface OnItemClickListener {
    public fun onItemClick(
      view: View,
      position: Int,
      item: Splash1RowModel
    ): Unit {
    }
  }

  public inner class RowSplash1VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    public val binding: RowSplash1Binding = RowSplash1Binding.bind(itemView)
  }
}
