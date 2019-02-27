package com.oktavianyudha.recycleview_tugas.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.oktavianyudha.recycleview.R;
import com.oktavianyudha.recycleview.models.Contact;

import java.util.List;

public class ContactsAdapter extends RecyclerView.Adapter<ContactsAdapter.ViewHolder> {

    //attribut
    private List<Contact> mContacts;

    //constructor
    public ContactsAdapter(List<Contact> mContacts){

        this.mContacts = mContacts;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        Context context = viewGroup.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);
        View contactView = inflater.inflate(R.layout.item_contact, viewGroup, false);

        ViewHolder viewHolder = new ViewHolder(contactView);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {
        Contact itemContact = mContacts.get(i);
        TextView textView = viewHolder.nameTextView;
        textView.setText(itemContact.getName());

        Button buttonContact = viewHolder.messageButton;
        buttonContact.setText(itemContact.isOnline()?"message" : "offline");
        buttonContact.setEnabled(itemContact.isOnline());
    }

    @Override
    public int getItemCount() {
        return mContacts.size();
    }


    public class ViewHolder extends RecyclerView.ViewHolder {

        private TextView nameTextView;
        private Button messageButton;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            nameTextView = itemView.findViewById(R.id.contact_name);
            messageButton = itemView.findViewById(R.id.message_button);
        }
    }
}