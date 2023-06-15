package com.cntcts.contactsapp

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.cntcts.contactsapp.databinding.ActivityMainBinding
import com.cntcts.contactsapp.databinding.ContactsListBinding
import com.squareup.picasso.Picasso
import jp.wasabeef.picasso.transformations.CropCircleTransformation

class ContactsRVAdapter(var contactList: List<ContactsData>): RecyclerView.Adapter<ContactsViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContactsViewHolder {
        var binding =ContactsListBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return ContactsViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ContactsViewHolder, position: Int) {
        var contact =contactList[position]
        var binding = holder.binding
        holder.binding.tvName.text =contact.name
        holder.binding.tvEmail.text =contact.email
        holder.binding.tvNumber.text=contact.number
        Picasso
            .get()
            .load(contact.avatar)
            .resize(80,80)
            .centerCrop()
            .transform(CropCircleTransformation())
            .into(binding.ivAvatar)
    }

    override fun getItemCount(): Int {
        return contactList.size
    }
}

class ContactsViewHolder(var binding: ContactsListBinding): RecyclerView.ViewHolder(binding.root)