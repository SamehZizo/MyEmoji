package com.vanniktech.emoji.sample;

import android.content.Context;

import androidx.annotation.NonNull;

import com.vanniktech.emoji.EmojiProvider;
import com.vanniktech.emoji.emoji.EmojiCategory;
import com.vanniktech.emoji.ios.category.SmileysAndPeopleCategory;

public class MyEmojis implements EmojiProvider {

    @NonNull
    @Override
    public EmojiCategory[] getCategories() {
        return new EmojiCategory[]{
                new SmileysAndPeopleCategory(),
                new MyEmojiCategory()
        };
    }
}
