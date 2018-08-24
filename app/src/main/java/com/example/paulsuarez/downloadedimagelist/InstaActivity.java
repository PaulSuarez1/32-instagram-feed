package com.example.paulsuarez.downloadedimagelist;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import butterknife.BindView;
import butterknife.ButterKnife;

public class InstaActivity extends AppCompatActivity {
    @BindView(R.id.recycler) public RecyclerView mRecyclerView;
    private LinearLayoutManager mLinearLayoutManager;
    private InstaAdapter mInstaAdapter;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_insta_feed);

        ButterKnife.bind(this);

        mLinearLayoutManager = new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(mLinearLayoutManager);

        mInstaAdapter = new InstaAdapter(InstaData.hearthstoneCards);
        mRecyclerView.setAdapter(mInstaAdapter);
    }
}
