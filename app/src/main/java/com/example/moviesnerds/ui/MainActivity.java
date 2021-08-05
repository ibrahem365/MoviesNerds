package com.example.moviesnerds.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.moviesnerds.R;
import com.example.moviesnerds.pojo.MovieModel;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity implements View.OnClickListener , MovieView{

    MoviePresenter presenter;

    @BindView(R.id.button)
    Button getMovieButton;

    @BindView(R.id.textView)
    TextView movieName;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        getMovieButton.setOnClickListener(this);

        //2 MVP..
        // بعمل implement ل interface بتاعتي الاول الي هي MovieView
        presenter = new MoviePresenter(this);

    }

    //1 MVC


    // the first case MVC
//    public void getMovie() {
//        movieName.setText(getMovieFromDataBase().getName());
//    }


    //second case MVC
    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.button){
            presenter.getMovieName();
        }
    }

    @Override
    public void onGetMovieName(String name) {
        movieName.setText(name);
    }
}