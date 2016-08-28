package com.single.doubletoggle;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.library.doubletoggle.DoubleToggleView;
import com.library.doubletoggle.DoubleToggleView.ToggleClick;

public class MainActivity extends AppCompatActivity implements ToggleClick {

    private static final String TAG = MainActivity.class.getSimpleName();
    private int firstIndex;
    DoubleToggleView doubleToggleView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        doubleToggleView = (DoubleToggleView) findViewById(R.id.toggle);
        doubleToggleView.setFirstDatas(Constants.getFirstDatas());
        doubleToggleView.setSecondDatas(Constants.getSecondDatas(0));
        doubleToggleView.initListData();
        doubleToggleView.setListener(this);

    }

    @Override
    public void firstClick(int index) {
        Log.d(TAG, "index:" + index);
        firstIndex = index;
        doubleToggleView.refreshList(Constants.getSecondDatas(index));
    }

    @Override
    public void secondClick(int index) {
        ToastUtil.makeToast(this, Constants.getSecondDatas(firstIndex).get(index).getValue() + "");
    }
}

