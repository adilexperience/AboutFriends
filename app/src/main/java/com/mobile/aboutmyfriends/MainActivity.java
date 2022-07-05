package com.mobile.aboutmyfriends;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.mobile.aboutmyfriends.adapter.FriendsAdapter;
import com.mobile.aboutmyfriends.model.FriendsModel;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    FriendsModel[] friends = new FriendsModel[] {
            new FriendsModel(
                    "Adil",
                    "Adil is myself studying bscs",
                    R.drawable.adil
            ),
            new FriendsModel(
                    "Adnan",
                    "Doing bachelors of computer science",
                    R.drawable.adil
            ),
            new FriendsModel(
                    "Zulkifil",
                    "Zulkifil is my batch mate",
                    R.drawable.adil
            ),
            new FriendsModel(
                    "Rehan",
                    "Rehan is my college friend",
                    R.drawable.adil
            ),
    };

    private RecyclerView mRVFriends;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        mRVFriends = findViewById(R.id.rv_friends);


        FriendsAdapter friendsAdapter = new FriendsAdapter(friends, getApplicationContext());
        mRVFriends.setHasFixedSize(true);
        mRVFriends.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
        mRVFriends.setAdapter(friendsAdapter);


    }
}