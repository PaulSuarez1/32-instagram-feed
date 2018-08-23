package com.example.paulsuarez.downloadedimagelist;

import android.content.ContentResolver;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.koushikdutta.ion.Ion;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ButterKnife.bind(this);

        unsetImage();
    }

    @OnClick(R.id.unset)
    public void unsetImage() {
        Drawable loading = getResources().getDrawable(R.drawable.loading);
        mImageView.setImageDrawable(loading);
    }

    @OnClick(R.id.unsetWithIon)
    public void unsetImageWithIon() {
        // URI creation scheme found via StackOverflow
        // https://stackoverflow.com/a/27681417
        // And referenced from Steve's demo code
        int id = R.drawable.loading;
        Uri imageUri = Uri.parse(ContentResolver.SCHEME_ANDROID_RESOURCE +
                "://" + getResources().getResourcePackageName(id) +
                '/' + getResources().getResourceTypeName(id) +
                '/' + getResources().getResourceEntryName(id));

        Ion.with(mImageView)
                .load(imageUri.toString());
    }


}
