package com.example.petviews;

public class foreignnotiitem{

    private int foreignnoti_image ;
    private String foreignnoti_dt ;
    private String foreignnoti_text ;

    public void setTitle(String title) {
        foreignnoti_text = title ;
    }
    public void setIcon(int icon) {
        foreignnoti_image = icon ;
    }
    public void setContent(String content) {
        foreignnoti_dt = content ;
    }


    public int getIcon() {
        return this.foreignnoti_image ;
    }
    public String getContent() {
        return this.foreignnoti_dt ;
    }
    public String getTitle() {
        return this.foreignnoti_text ;
    }
}
