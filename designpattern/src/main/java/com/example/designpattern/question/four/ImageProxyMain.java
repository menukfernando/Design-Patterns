package com.example.designpattern.question.four;

public class ImageProxyMain {
    public static void main(String[] args) {
        Image image1 = new ImageProxy("photo1.jpg");
        image1.display();
    }
}
