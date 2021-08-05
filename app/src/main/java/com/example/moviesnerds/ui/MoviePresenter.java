package com.example.moviesnerds.ui;

import com.example.moviesnerds.pojo.MovieModel;

public class MoviePresenter {
    //2 MVP ...
    //Bind this class to MainActivity by Interface
    // هنا المفروض اجيب اسم الفيلم من الداتا موديل واقدمه للأكتيفيتي علي طبق من دهب

    MovieView view;

    public MoviePresenter(MovieView view) {
        this.view = view;
    }


    public MovieModel getMovieFromDataBase (){
        return new MovieModel("cast away","1999","very sad",1);
    }

    public void getMovieName(){
        view.onGetMovieName(getMovieFromDataBase().getName());
    }
}
