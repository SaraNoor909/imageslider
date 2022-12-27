package com.example.imageslider2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import org.imaginativeworld.whynotimagecarousel.ImageCarousel;
import org.imaginativeworld.whynotimagecarousel.model.CarouselItem;

public class MainActivity extends AppCompatActivity {

    ImageCarousel imageCarousel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageCarousel = findViewById(R.id.carousel);

        imageCarousel.addData(new CarouselItem("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSJD983uNsKYCLe99xaVXEan4uqFlMFktv7uw&usqp=CAU","The goal of life is to live in agreement with nature."));
        imageCarousel.addData(new CarouselItem("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSOGhFcE5D2gUFkuOesvKNRteKGiC5N-CjfWg&usqp=CAU","Colours are the smiles of nature."));
        imageCarousel.addData(new CarouselItem("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQQpKEt7OWTa1Gb5AbOP88TQsZSHnLKzKxazg&usqp=CAU","Time spent among the trees is never wasted."));
        imageCarousel.addData(new CarouselItem("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSi7lgVQuRT5L4D360qxX-jc9CaB4_AM51pTA&usqp=CAU","The earth laughs in flowers."));
        imageCarousel.addData(new CarouselItem("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQy1ZwDkJ2RSlaK-9N9867-sxslTx5e4T3W8Q&usqp=CAU","Life is bliss if spent close to nature."));
        imageCarousel.addData(new CarouselItem("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcShspfrsO_3__103DQUK2NAg7FcA4Bmmex5wQ&usqp=CAU","One touch of nature makes the whole world kin."));


    }
}