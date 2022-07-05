package com.mobile.aboutmyfriends.model;

import java.io.Serializable;

public class FriendsModel implements Serializable {

    String friendName;
    String friendDetails;
    int image;

    public FriendsModel() {
    }

    public FriendsModel(String friendName, String friendDetails, int image) {
        this.friendName = friendName;
        this.friendDetails = friendDetails;
        this.image = image;
    }

    public String getFriendName() {
        return friendName;
    }

    public void setFriendName(String friendName) {
        this.friendName = friendName;
    }

    public String getFriendDetails() {
        return friendDetails;
    }

    public void setFriendDetails(String friendDetails) {
        this.friendDetails = friendDetails;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}
