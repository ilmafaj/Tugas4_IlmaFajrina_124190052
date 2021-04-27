package com.example.tugas4_ilmafaajrina_124190052;

        import android.content.Context;
        import android.view.LayoutInflater;
        import android.view.View;
        import android.view.ViewGroup;
        import android.widget.ImageView;
        import android.widget.TextView;

        import androidx.annotation.NonNull;
        import androidx.recyclerview.widget.RecyclerView;
        import com.bumptech.glide.Glide;

        import java.util.ArrayList;

public class PlayerAdapter extends RecyclerView.Adapter<PlayerAdapter.ViewHolder> {
    private Context context;
    ArrayList catModels = new ArrayList<PlayerModel>();

    public PlayerAdapter(ArrayList<PlayerModel> listDataM, Context context) {
        this.catModels = listDataM;
        this.context = context;
    }

    public Context getContext(){
        return context;
    }

    public void setContext(Context context){
        this.context = context;
    }

    public ArrayList<PlayerModel> getCatModels() {
        return catModels;
    }

    public void setCatModels(ArrayList<PlayerModel> catModels) {
        this.catModels = catModels;
    }

    @NonNull
    @Override
    public PlayerAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemRow = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_player_list, parent,false);
        return new ViewHolder(itemRow);
    }

    @Override
    public void onBindViewHolder(@NonNull PlayerAdapter.ViewHolder holder, int position) {
        Glide.with(context).load(getCatModels().get(position).getGambarItem()).into(holder.gambar);
        holder.text.setText(getCatModels().get(position).getNamaItem());
    }

    @Override
    public int getItemCount() {
        return getCatModels().size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private ImageView gambar;
        private TextView text;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            gambar = itemView.findViewById(R.id.rv_gambar);
            text = itemView.findViewById(R.id.rv_nama);
        }
    }
}