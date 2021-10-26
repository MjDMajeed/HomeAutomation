package com.application.app.modules.profile2.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.application.app.R
import com.application.app.databinding.RowProfile3Binding
import com.application.app.modules.profile2.`data`.model.Profile3RowModel
import kotlin.Int
import kotlin.Unit
import kotlin.collections.List

public class RecyclerListAdapter(
  public var list: List<Profile3RowModel>
) : RecyclerView.Adapter<RecyclerListAdapter.RowProfile3VH>() {
  private var clickListener: OnItemClickListener? = null

  public fun updateData(newData: List<Profile3RowModel>): Unit {
    list = newData
    notifyDataSetChanged()
  }

  public fun setOnItemClickListener(clickListener: OnItemClickListener): Unit {
    this.clickListener = clickListener
  }

  public override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowProfile3VH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_profile_3,parent,false)
    return RowProfile3VH(view)
  }

  public override fun onBindViewHolder(holder: RowProfile3VH, position: Int): Unit {
    val profile3RowModel = Profile3RowModel()
    // TODO uncomment following line after integration with data source
    // val profile3RowModel = list[position]
    holder.binding.profile3RowModel = profile3RowModel
  }

  public override fun getItemCount(): Int = 5
  // TODO uncomment following line after integration with data source
  // list.size

  public interface OnItemClickListener {
    public fun onItemClick(
      view: View,
      position: Int,
      item: Profile3RowModel
    ): Unit {
    }
  }

  public inner class RowProfile3VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    public val binding: RowProfile3Binding = RowProfile3Binding.bind(itemView)
  }
}
