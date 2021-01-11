package com.udacity.gradle.builditbigger.backend;

public class JokeFetcher {

    String joke;

    JokeFetcher(){
        joke = " ";
    };

    public String getJoke()
    {return joke;}

    public void setJoke(String mJoke)
    {
        joke = mJoke;
    }
}
