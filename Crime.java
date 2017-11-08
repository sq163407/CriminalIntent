package com.knight.android.criminalintent;

import java.util.Date;
import java.util.UUID;

/**
 * Created by Qi on 2017/11/3.
 */

public class Crime {

    private UUID mId;
    private String mTitle;
    private Date mDate;
    private boolean mSloved;

    public Crime(){
        //Generate unique identifier
        mId=UUID.randomUUID();
        mDate=new Date();
    }

    public UUID getId() {
        return mId;
    }

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String title) {
        mTitle = title;
    }

    public Date getDate() {
        return mDate;
    }

    public void setDate(Date date) {
        mDate = date;
    }

    public boolean isSloved() {
        return mSloved;
    }

    public void setSloved(boolean sloved) {
        mSloved = sloved;
    }
}
