package com.library.doubletoggle;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.LinearLayout;

import java.util.ArrayList;

/**
 * Created by xiangcheng on 16/8/20.
 */
public class DoubleToggleView extends LinearLayout {
    private float mFirstToggleWidth = 100;
    private float mSecondToggleWidth = 80;
    private int mFirstToggleSelectBack;
    private ArrayList<BaseBean> firstDatas;
    private ArrayList<BaseBean> secondDatas;
    private int mFirstToggleSelector;

    public DoubleToggleView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        getAttrs(context, attrs);
        initViews();
    }

    public DoubleToggleView(Context context) {
        this(context, null);
    }

    public DoubleToggleView(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    private void getAttrs(Context context, AttributeSet attrs) {
        TypedArray arrays = context.obtainStyledAttributes(attrs, R.styleable.DoubleToggleView);
        mFirstToggleWidth = arrays.getDimension(R.styleable.DoubleToggleView_first_toggle_width,
                Utils.dpTpPx(getContext(), mFirstToggleWidth));
        mSecondToggleWidth = arrays.getDimension(R.styleable.DoubleToggleView_second_toggle_width,
                Utils.dpTpPx(getContext(), mSecondToggleWidth));
        mFirstToggleSelectBack = arrays.getColor(R.styleable.DoubleToggleView_first_toggle_select_item_back,
                getResources().getColor(R.color.first_toggle_select_item_back));
        mFirstToggleSelector = arrays.getResourceId(R.styleable.DoubleToggleView_first_toggle_select_item_selector,
                getResources().getColor(R.color.toggle_item_selector));

    }

    public void setSecondDatas(ArrayList<BaseBean> secondDatas) {
        this.secondDatas = secondDatas;
    }

    public void setFirstDatas(ArrayList<BaseBean> firstDatas) {
        this.firstDatas = firstDatas;
    }

    ToggleItem firstToggle;
    ToggleItem secondToggle;

    public void initListData() {
        firstToggle.refresList(firstDatas);
        secondToggle.refresList(secondDatas);
    }


    private void initViews() {
        setOrientation(HORIZONTAL);
        firstToggle = new ToggleItem(getContext(), (int) mFirstToggleWidth,
                getResources().getColor(R.color.first_toggle_back), mFirstToggleSelector, mFirstToggleSelectBack);
        secondToggle = new ToggleItem(getContext(), (int) mSecondToggleWidth,
                getResources().getColor(R.color.first_toggle_select_item_back));
        addView(firstToggle);
        addView(secondToggle);
        firstToggle.setListener(new ToggleItem.OnItemSelectListener() {
            @Override
            public void selectItem(int index) {
                if (listener != null) {
                    listener.firstClick(index);
                }
            }
        });
        secondToggle.setListener(new ToggleItem.OnItemSelectListener() {
            @Override
            public void selectItem(int index) {
                if (listener != null) {
                    listener.secondClick(index);
                }
            }
        });
    }

    public void refreshList(ArrayList<BaseBean> list) {
        secondToggle.refresList(list);
    }

    public interface ToggleClick {
        void firstClick(int index);

        void secondClick(int index);
    }

    public void setListener(ToggleClick listener) {
        this.listener = listener;
    }

    private ToggleClick listener;

}


