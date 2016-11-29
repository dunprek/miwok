package iak.don.beginner.miwok.adapter;

import android.content.Context;
import android.content.Intent;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Build;
import android.support.v4.content.ContextCompat;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;


import java.util.List;

import iak.don.beginner.miwok.R;
import iak.don.beginner.miwok.model.Colors;


/**
 * Created by don on 11/29/2016.
 */
public class ColorsAdapter extends RecyclerView.Adapter<ColorsAdapter.ViewHolder> {
    private Context context;
    private List<Colors> data;
    private int mColorResourceId;

    private MediaPlayer mMediaPlayer;

    /**
     * Handles audio focus when playing a sound file
     */
    private AudioManager mAudioManager;





    private MediaPlayer.OnCompletionListener mCompletionListener = new MediaPlayer.OnCompletionListener() {
        @Override
        public void onCompletion(MediaPlayer mediaPlayer) {
            // Now that the sound file has finished playing, release the media player resources.
            releaseMediaPlayer();
        }
    };

    public ColorsAdapter(Context context, List<Colors> data, int colorResourceId) {
        this.context = context;
        this.data = data;
        this.mColorResourceId = colorResourceId;

        mAudioManager = (AudioManager) context.getSystemService(Context.AUDIO_SERVICE);
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        TextView tvMiwok;
        TextView tvEnglish;
        ImageView iv;
        LinearLayout linearLayout;

        public ViewHolder(View view) {
            super(view);
            tvMiwok = (TextView) itemView.findViewById(R.id.tvEn);
            tvEnglish = (TextView) itemView.findViewById(R.id.tvMi);
            iv = (ImageView) itemView.findViewById(R.id.iv);
            linearLayout = (LinearLayout) itemView.findViewById(R.id.llBackground);


        }


    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int type) {
        View viewItem = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.list_item_menu, viewGroup, false);
        return new ViewHolder(viewItem);
    }

    @Override
    public void onBindViewHolder(ViewHolder viewHolder, final int position) {

        if (mColorResourceId == R.color.colorPhrases){
            viewHolder.iv.setVisibility(View.GONE);
            viewHolder.tvMiwok.setText(data.get(position).getMiwok());
            viewHolder.tvEnglish.setText(data.get(position).getEnglish());
            viewHolder.linearLayout.setBackgroundResource(mColorResourceId);
        }else{
            viewHolder.tvMiwok.setText(data.get(position).getMiwok());
            viewHolder.tvEnglish.setText(data.get(position).getEnglish());
            viewHolder.linearLayout.setBackgroundResource(mColorResourceId);
            viewHolder.iv.setImageResource(data.get(position).getImage());
        }



        viewHolder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {

                Log.d("HELLOW", "" + position);

                releaseMediaPlayer();

                int result = mAudioManager.requestAudioFocus(mOnAudioFocusChangeListener,
                        AudioManager.STREAM_MUSIC, AudioManager.AUDIOFOCUS_GAIN_TRANSIENT);

                if (result == AudioManager.AUDIOFOCUS_REQUEST_GRANTED) {
                    // We have audio focus now.

                    // Create and setup the {@link MediaPlayer} for the audio resource associated
                    // with the current word
                    mMediaPlayer = MediaPlayer.create(context, data.get(position).getAudio());

                    // Start the audio file
                    mMediaPlayer.start();

                    // Setup a listener on the media player, so that we can stop and release the
                    // media player once the sound has finished playing.
                    mMediaPlayer.setOnCompletionListener(mCompletionListener);
                }

            }
        });

    }

    private void releaseMediaPlayer() {
        // If the media player is not null, then it may be currently playing a sound.
        if (mMediaPlayer != null) {
            // Regardless of the current state of the media player, release its resources
            // because we no longer need it.
            mMediaPlayer.release();

            // Set the media player back to null. For our code, we've decided that
            // setting the media player to null is an easy way to tell that the media player
            // is not configured to play an audio file at the moment.
            mMediaPlayer = null;

            // Regardless of whether or not we were granted audio focus, abandon it. This also
            // unregisters the AudioFocusChangeListener so we don't get anymore callbacks.
            mAudioManager.abandonAudioFocus(mOnAudioFocusChangeListener);
        }
    }

    private AudioManager.OnAudioFocusChangeListener mOnAudioFocusChangeListener = new AudioManager.OnAudioFocusChangeListener() {
        @Override
        public void onAudioFocusChange(int focusChange) {
            if (focusChange == AudioManager.AUDIOFOCUS_LOSS_TRANSIENT ||
                    focusChange == AudioManager.AUDIOFOCUS_LOSS_TRANSIENT_CAN_DUCK) {
                // The AUDIOFOCUS_LOSS_TRANSIENT case means that we've lost audio focus for a
                // short amount of time. The AUDIOFOCUS_LOSS_TRANSIENT_CAN_DUCK case means that
                // our app is allowed to continue playing sound but at a lower volume. We'll treat
                // both cases the same way because our app is playing short sound files.

                // Pause playback and reset player to the start of the file. That way, we can
                // play the word from the beginning when we resume playback.
                mMediaPlayer.pause();
                mMediaPlayer.seekTo(0);
            } else if (focusChange == AudioManager.AUDIOFOCUS_GAIN) {
                // The AUDIOFOCUS_GAIN case means we have regained focus and can resume playback.
                mMediaPlayer.start();
            } else if (focusChange == AudioManager.AUDIOFOCUS_LOSS) {
                // The AUDIOFOCUS_LOSS case means we've lost audio focus and
                // Stop playback and clean up resources
                releaseMediaPlayer();
            }
        }
    };
}


