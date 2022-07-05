package com.mobile.aboutmyfriends.adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.mobile.aboutmyfriends.DetailsActivity;
import com.mobile.aboutmyfriends.R;
import com.mobile.aboutmyfriends.model.FriendsModel;
import com.squareup.picasso.Picasso;

public class FriendsAdapter extends RecyclerView.Adapter<FriendsAdapter.MainViewHolder>{
    private FriendsModel[] friends;
    private Context context;

    public FriendsAdapter(FriendsModel[] friends, Context context) {
        this.friends = friends;
        this.context = context;
    }

    @NonNull
    @Override
    public FriendsAdapter.MainViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View listItem = layoutInflater.inflate(R.layout.layout_item, parent, false);
        MainViewHolder viewHolder = new MainViewHolder(listItem);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull FriendsAdapter.MainViewHolder holder, int position) {
        final FriendsModel friend = friends[position];

        holder.mTVName.setText(friend.getFriendName());
        holder.mTVDetails.setText(friend.getFriendDetails());

        Picasso.get()
                .load(friend.getImage())
                .into(holder.mIVHeader);

        holder.mCVFriend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, DetailsActivity.class);
                intent.putExtra("friends", friend);
                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return friends.length;
    }

    public static class MainViewHolder extends RecyclerView.ViewHolder {
        private TextView mTVName, mTVDetails;
        private CardView mCVFriend;
        private ImageView mIVHeader;

        public MainViewHolder(@NonNull View itemView) {
            super(itemView);
            this.mTVName = itemView.findViewById(R.id.tvFriendName);
            this.mCVFriend = itemView.findViewById(R.id.cvFriend);
            this.mTVDetails = itemView.findViewById(R.id.tvFriendDetails);
            this.mIVHeader = itemView.findViewById(R.id.ivFriendImage);
        }

    }
}
