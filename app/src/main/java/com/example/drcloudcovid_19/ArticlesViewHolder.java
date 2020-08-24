package com.example.drcloudcovid_19;


import android.view.View;
import android.widget.TextView;

import com.thoughtbot.expandablerecyclerview.viewholders.ChildViewHolder;

public class ArticlesViewHolder extends ChildViewHolder {
    TextView txtArticle;

    public ArticlesViewHolder(View itemView) {
        super(itemView);

        txtArticle = itemView.findViewById(R.id.txt_articles);
    }

    public void setArticlesTitle(String name) {
        txtArticle.setText(name);
    }
}
