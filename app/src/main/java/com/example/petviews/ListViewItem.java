package com.example.petviews;

public class ListViewItem {

    private int textpastvideo_image ;
    private String textpastvideo_ago ;
    private String textpastvideo_videotitle ;

    public void setTitle(String title) {
        textpastvideo_videotitle = title ;
    }
    public void setIcon(int icon) {
        textpastvideo_image = icon ;
    }
    public void setContent(String content) {
        textpastvideo_ago = content ;
    }


    public int getIcon() {
        return this.textpastvideo_image ;
    }
    public String getContent() {
        return this.textpastvideo_ago ;
    }
    public String getTitle() {
        return this.textpastvideo_videotitle ;
    }
}
