package com.mahmoud_ashraf.myapplicationhelp;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;
import java.util.ArrayList;

/**
 * Created by mahmoud_ashraf on 7/22/2017.
 */

public class postsAdapter extends RecyclerView.Adapter<postsAdapter.MyViewHolder> {

    ArrayList<String>  arr;
    Context context;

    public postsAdapter(ArrayList<String> arr  , Context context) {
        this.arr = arr;
        this.context = context;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView =LayoutInflater.from(context).inflate(R.layout.row_item, parent, false);

        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
      holder.name_tv.setText(arr.get(position));
    }

    @Override
    public int getItemCount() {
        return arr.size();
    }





    class MyViewHolder extends RecyclerView.ViewHolder {
        TextView name_tv;



        public MyViewHolder(final View itemView) {
            super(itemView);
          name_tv = (TextView) itemView.findViewById(R.id.name_);


        }
    }

}
