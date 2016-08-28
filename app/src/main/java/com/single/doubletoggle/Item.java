package com.single.doubletoggle;

import com.library.doubletoggle.BaseBean;

/**
 * Created by xiangcheng on 16/8/21.
 */
public class Item extends BaseBean<String> {
    private String name;
    private String postCode;

    public Item(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return "name";
    }
}
