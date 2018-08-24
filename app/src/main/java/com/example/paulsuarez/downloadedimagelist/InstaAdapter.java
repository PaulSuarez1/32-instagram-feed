package com.example.paulsuarez.downloadedimagelist;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.koushikdutta.ion.Ion;

import java.util.ArrayList;
import java.util.List;

public class InstaAdapter extends RecyclerView.Adapter<InstaAdapter.MyViewHolder> {

    private List<InstaPost> mFeed;

    public InstaAdapter() {
        mFeed = new ArrayList<>();
    }

    public InstaAdapter(List<InstaPost> feed) {
        mFeed = feed;
    }


    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.insta_feed_post, parent, false);

        MyViewHolder vh = new MyViewHolder(view);
        return vh;
    }

    // reference
    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        InstaPost post = mFeed.get(position);
        holder.bind(post);
    }


    @Override
    public int getItemCount() {
        return mFeed.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        View mView;

        public ImageView mImage;
        public TextView mTitle;
        public TextView mDescription;

        private InstaPost mPost;

        public MyViewHolder(View view) {
            super(view);
            mView = view;

            mImage = view.findViewById(R.id.image);
            mTitle = view.findViewById(R.id.title);
            mDescription = view.findViewById(R.id.description);
        }

        public void bind(InstaPost post) {
            mPost = post;
            mTitle.setText(post.title);
            mDescription.setText(post.description);

            Ion.with(mImage)
                    .placeholder(R.drawable.loading)
                    .load(mPost.imageUrl);
        }
    }

}
