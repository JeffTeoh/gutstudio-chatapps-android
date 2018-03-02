package com.example.android.chatapps_android;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.sendbird.android.UserMessage;

/**
 * Created by Jeffrey on 3/2/2018.
 */

public class SentMessageHolder extends RecyclerView.ViewHolder {

        TextView messageText, timeText;

public SentMessageHolder(View itemView) {
        super(itemView);
        messageText = (TextView) itemView.findViewById(R.id.text_message_body);
        timeText = (TextView) itemView.findViewById(R.id.text_message_time);
        }

        void bind(UserMessage message) {
        messageText.setText(message.getMessage());

        //Format the stored timestamp into a readable String using method
        //timeText.setText(Utils.formatDateTime(message.getCreatedAt()));
        //nameText.setText(message.getSender().getNickname());

        // Insert the profile image from the URL into the ImageView.
        //Utils.displayRoundImageFromUrl(mContext, message.getSender().getProfileUrl(), profileImage);
        }
}
