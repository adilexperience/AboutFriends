package com.mobile.aboutmyfriends;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import com.mobile.aboutmyfriends.model.FriendsModel;

public class DetailsActivity extends AppCompatActivity {

    private FriendsModel friend;
    private TextView mTVDetails;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        friend = (FriendsModel) getIntent().getSerializableExtra("friends");
        mTVDetails = findViewById(R.id.tv_details);

        mTVDetails.setText(friend.getFriendDetails());



    }
}