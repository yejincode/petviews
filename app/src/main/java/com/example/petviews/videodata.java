package com.example.petviews;

public class videodata {

    private int image_video;
    private String video_title;

    public videodata(int image_video, String video_title) {
        this.image_video = image_video;
        this.video_title = video_title;
    }

    public int getImage_video() {
        return image_video;
    }

    public void setImage_video(int image_video) {
        this.image_video = image_video;
    }

    public String getVideo_title() {
        return video_title;
    }

    public void setVideo_title(String video_title) {
        this.video_title = video_title;
    }
}
