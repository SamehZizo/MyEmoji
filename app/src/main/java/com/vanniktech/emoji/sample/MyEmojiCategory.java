package com.vanniktech.emoji.sample;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.vanniktech.emoji.emoji.Emoji;
import com.vanniktech.emoji.emoji.EmojiCategory;
import com.vanniktech.emoji.ios.IosEmoji;

public class MyEmojiCategory implements EmojiCategory {

    @NonNull
    @Override
    public Emoji[] getEmojis() {
        return DATA;
    }

    @Override
    public int getIcon() {
        return R.drawable.emoji_ios_category_smileysandpeople;
    }

    @Override
    public int getCategoryName() {
        return com.vanniktech.emoji.ios.R.string.emoji_ios_category_smileysandpeople;
    }

    private static final Emoji[] DATA = new Emoji[]{
            new IosEmoji(0x1F900, 0, 0, false),
            new IosEmoji(0x1F383, 8, 17, false),
            new Emoji(0x1e001, R.drawable.emoji_1f748, false)
    };
}
