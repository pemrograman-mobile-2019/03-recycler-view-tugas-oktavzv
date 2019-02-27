package com.oktavianyudha.recycleview_tugas.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.oktavianyudha.recycleview_tugas.R;

import java.util.ArrayList;

import static com.oktavianyudha.recycleview_tugas.R.id.image1;


public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> {

    private static final String TAG = "MyAdapter";

    private ArrayList<String> mImage = new ArrayList<>();
    private ArrayList<Integer> mHeaders = new ArrayList<>();
    private ArrayList<Integer> mFooters = new ArrayList<>();
    private Context mContext;

    public MyAdapter(Context mContext, ArrayList<String> mImage, ArrayList<Integer> mHeaders, ArrayList<Integer> mFooters) {
        this.mImage = mImage;
        this.mHeaders = mHeaders;
        this.mFooters = mFooters;
        this.mContext = mContext;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        LayoutInflater inflater = LayoutInflater.from(viewGroup.getContext());
        View view = inflater.inflate(R.layout.row_layout, viewGroup ,false);
        ViewHolder holder = new ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder,int i) {
        Log.d(TAG, "onBindViewHolder: called.");

       viewHolder.imagee.getId();
       viewHolder.textHeader.setText("Nama");
       viewHolder.textFooter.setText("Deskripsi");
    }

    @Override
    public int getItemCount() {
        return mImage.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
            ImageView imagee;
            TextView textHeader;
            TextView textFooter;
            RelativeLayout parentLayout;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            imagee = itemView.findViewById(image1);
            textHeader = itemView.findViewById(R.id.firstLine);
            textFooter = itemView.findViewById(R.id.secondLine);
            parentLayout = itemView.findViewById(R.id.parent_layout);
        }
    }

//    private List<String> values;
//
//
//    public class ViewHolder extends RecyclerView.ViewHolder {
//
//        public T
//        public
//        public View layout;
//
//        public ViewHolder(View v) {
//            super(v);
//            layout = v;
//            txtHeader = (TextView) v.findViewById(R.id.firstLine);
//            txtFooter = (TextView) v.findViewById(R.id.secondLine);
//        }
//    }
//
//    public void add(int position, String item) {
//        values.add(position, item);
//        notifyItemInserted(position);
//    }
//
//    public void remove(int position) {
//        values.remove(position);
//        notifyItemRemoved(position);
//    }
//
//
//    public MyAdapter(List<String> myDataset) {
//        values = myDataset;
//    }
//
//
//    @Override
//    public MyAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
//
//        LayoutInflater inflater = LayoutInflater.from(
//                parent.getContext());
//        View v =
//                inflater.inflate(R.layout.row_layout, parent, false);
//
//        ViewHolder vh = new ViewHolder(v);
//        return vh;
//    }
//
//
//    @Override
//    public void onBindViewHolder(ViewHolder holder, final int position) {
//
//        final String name = values.get(position);
//        holder.txtHeader.setText(name);
//        holder.txtHeader.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                remove(position);
//            }
//        });
//
//        holder.txtFooter.setText("Descriptions: " + name);
//    }
//
//
//    @Override
//    public int getItemCount() {
//        return values.size();
//    }

}