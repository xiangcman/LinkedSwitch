package com.library.doubletoggle;

/**
 * Created by xiangcheng on 16/8/21.
 */
public abstract class BaseBean<T> {
    //要显示的字段的名字
    public abstract String getName();

    private static Parse parse;

    /**
     * 返回要显示字段的值
     *
     * @return
     */
    public T getValue() {
        if (parse == null) {
            parse = new ParseImp<T>();
        }
        return (T) parse.getValues(this);
    }

}
