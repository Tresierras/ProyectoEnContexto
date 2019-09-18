package com.example.musicaencontexto.ui.reproductor;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class ReproductorViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public ReproductorViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Aqui ira el reproductor");
    }

    public LiveData<String> getText() {
        return mText;
    }
}