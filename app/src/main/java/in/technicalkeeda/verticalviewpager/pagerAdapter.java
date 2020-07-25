package in.technicalkeeda.verticalviewpager;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.PagerAdapter;

import java.util.ArrayList;
import java.util.List;

public class pagerAdapter extends RecyclerView.Adapter<pagerAdapter.MyViewHolder> {

    private Context context;
    private List<Model> modelsList=new ArrayList<>();

    public pagerAdapter(Context context, List<Model> modelsList) {
        this.context = context;
        this.modelsList = modelsList;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.pager_item, parent, false);
        return new MyViewHolder(view);
    }



    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.tvName.setText(modelsList.get(position).getS());
    }

    @Override
    public int getItemCount() {
        return modelsList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        TextView tvName;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            tvName = itemView.findViewById(R.id.textview);
        }
    }
}