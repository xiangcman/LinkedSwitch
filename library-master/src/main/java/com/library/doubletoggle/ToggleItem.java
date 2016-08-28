package com.library.doubletoggle;

import android.content.Context;
import android.graphics.Color;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by xiangcheng on 16/8/20.
 */
public class ToggleItem extends ScrollView {
    //联动开关的宽度
    private int mWidth;
    //用到的数据源
    private ArrayList<BaseBean> datas;
    //当前选中的位置
    private int mPosition;
    //监听选中的位置，方便回调
    private OnItemSelectListener mListener;
    //条目的选中状态,
    private int mItemSelector;
    //整个滑动组件的背景
    private int mBack;
    private int mItemSelectBack;
    //每一个条目的高度
    private int itemHeight = 140;
    int index;
    private LinearLayout main;
    LinearLayout.LayoutParams textparams;
    LinearLayout.LayoutParams lineParams;
    //用于记录所有显示的item
    private List<TextView> textViews;

    /**
     * 二级联动菜单的初始化
     * @param context
     * @param width
     * @param back
     */
    public ToggleItem(Context context, int width, int back) {
        this(context, width, back, 0, 0);
    }

    /**
     * 一级联动菜单的初始化
     * @param context
     * @param width
     * @param back
     * @param itemSelector
     * @param itemSelectBack
     */
    public ToggleItem(Context context, int width, int back, int itemSelector, int itemSelectBack) {
        super(context);
        this.mWidth = width;
        this.mBack = back;
        this.mItemSelector = itemSelector;
        this.mItemSelectBack = itemSelectBack;
        initViews();
    }

    private void initViews() {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(mWidth, ViewGroup.LayoutParams.MATCH_PARENT);
        setLayoutParams(layoutParams);
        setBackgroundColor(mBack);
        //由于scrollview的直接孩子只有一个所以这里创建一个根布局
        main = new LinearLayout(getContext());
        FrameLayout.LayoutParams mainParams = new FrameLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.MATCH_PARENT);
        main.setLayoutParams(mainParams);
        main.setOrientation(LinearLayout.VERTICAL);
        addView(main);
        textparams = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, itemHeight);
        lineParams = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, 1);
    }

    private void refreshList() {
        main.removeAllViews();
        addLine();
        textViews = new ArrayList<>();
        //添加文本内容
        for (int i = 0; i < datas.size(); i++) {
            index = i;
            final TextView text = new TextView(getContext());
            textViews.add(text);
            if (mItemSelectBack != 0 && mItemSelector != 0) {
                if (mPosition == i) {
//                    text.setSelected(true);
                    text.setBackgroundColor(mItemSelectBack);
                    text.setTextColor(Color.parseColor("#0288d1"));
                } else {
//                    text.setSelected(false);
                    text.setTextColor(Color.parseColor("#666666"));
                }

            } else {
                text.setBackgroundColor(Color.WHITE);
                text.setTextColor(Color.parseColor("#66000000"));
            }
            text.setText(datas.get(i).getValue() + "");
            text.setTextSize(15);
            text.setGravity(Gravity.CENTER);
            text.setLayoutParams(textparams);
            text.setTag(index);
            main.addView(text);
            text.setOnClickListener(new OnClickListener() {
                @Override
                public void onClick(View v) {
                    int tag = (int) text.getTag();
//                    if (mPosition != tag) {
                    mPosition = tag;
                    changeStates(tag);
                    if (mListener != null) {
                        mListener.selectItem(tag);
                    }
//                    }
                }
            });
            //添加个横线
            addLine();
        }

    }

    private void changeStates(int tag) {
        if (mItemSelectBack != 0 && mItemSelector != 0) {
            for (int i = 0; i < textViews.size(); i++) {
                if (i == tag) {
                    textViews.get(i).setBackgroundColor(mItemSelectBack);
                    textViews.get(i).setTextColor(Color.parseColor("#0288d1"));
                } else {
                    textViews.get(i).setBackground(null);
                    textViews.get(i).setTextColor(Color.parseColor("#666666"));
                }
            }
        }

    }

    private void addLine() {
        View view = new View(getContext());
        view.setLayoutParams(lineParams);
        view.setBackgroundColor(Color.parseColor("#f3f3f3"));
        main.addView(view);
    }

    public interface OnItemSelectListener {
        void selectItem(int index);
    }

    public void setListener(OnItemSelectListener mListener) {
        this.mListener = mListener;
    }

    public void refresList(ArrayList<BaseBean> list) {
        this.datas = list;
        this.refreshList();
    }
}
