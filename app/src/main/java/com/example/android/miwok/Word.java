package com.example.android.miwok;

/**
 * Created by andeladeveloper on 18/05/2017.
 */

class Word {

    private static final int NO_IMAGE_PROVIDED = -1;
    private String mDefaultTranslation;
    private String mMiwokTranslation;
    private int mImageResourceId = NO_IMAGE_PROVIDED;

    // Audio resource ID for the word
    private int mAudioResourceId;

    public Word(String defaultTranslation, String miwokTranslation, int audioResourceId){
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mAudioResourceId = audioResourceId;

    }
    public Word(String defaultTranslation, String miwokTranslation, int imageResourceId, int audioResourceId){
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mImageResourceId = imageResourceId;
        mAudioResourceId = audioResourceId;
    }

    public String getDefaultTranslation(){
        return mDefaultTranslation;
    }
    public String getMiwokTranslation() {
        return mMiwokTranslation;
    }


    public int getAudioResourceId() {
        return mAudioResourceId;
    }

    /**
     *
     * @return get image resource id of the word
     */
    public int getImageResourceId() {
        return mImageResourceId;
    }

    /**
     *
     * Returns whether or not there is an image for this word
     */
    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }
}