/*
 * Copyright (c) $today.year.kareem elsayed aly,no one has the authority to edit,delete,copy any part without my permission
 */

package com.hossam.devloper.meplacedesign.Interfaces;

import android.app.Activity;
import android.support.v7.widget.RecyclerView;

/**
 * Created by kareem on 9/28/2016.
 */

/**
 * Copyright (c) $today.year.kareem elsayed aly,no one has the authority to edit,delete,copy any part without my permission
 */

public interface RecyclerAdapterListener<T, E extends RecyclerView.ViewHolder> {
    public void RecyclerAdapterListener(E ViewHolder, T Holder, int position, int ID);
    public Activity getMyActivity();
}
