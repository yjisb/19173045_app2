package com.example.myapplication_number;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class PersonAdepter extends RecyclerView.Adapter<PersonAdepter.ViewHolder>{
    ArrayList<Person> items=new ArrayList<Person>();
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewgroup, int viewType) {
        LayoutInflater inflater=LayoutInflater.from(viewgroup.getContext())
        View itemView = inflater.inflate(R.layout.person_item, viewgroup, false);
        return new ViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewholder, int position) {
        Person item = items.get(position);
        ViewHolder.setItem(item);

    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    static class ViewHolder extends RecyclerView.ViewHolder{
        TextView textView;
        TextView textView2;

        public  ViewHolder(View itemView)
        {
            super(itemView);
            textView = itemView.findViewById(R.id.textView);
            textView2 =itemView.findViewById(R.id.textView2);
        }
        public void setItem(Person item){
            textView.setText(item.getName());
            textView2.setText(item.getMobile());
        }
    }
    public void addItem(Person item)
    {
        items.add(item);
    }
    public void setItems(ArrayList<Person>, items)
    {
        this.items = items;
    }
    public Person getItem(int position)
    {
        return items.get(position);
    }
    public  void setItem(int position, Person item)
    {
        items.set(position,item);
    }
}





