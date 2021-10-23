package com.example.petviews;

public class interestdata2 {

    private int image_interest;
    private String text_interesting;

    public interestdata2(int image_interest, String text_interesting){

        this.image_interest = image_interest;
        this.text_interesting = text_interesting;
    }

    public int getImage_interest(){return image_interest;}

    public void setImage_interest(int image_interest){this.image_interest=image_interest;}

    public String getText_interesting(){return text_interesting;}

    public void setText_interesting(String text_interesting){this.text_interesting=text_interesting;}

}
