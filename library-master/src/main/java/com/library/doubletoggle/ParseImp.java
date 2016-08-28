package com.library.doubletoggle;

/**
 * Created by xiangcheng on 16/8/21.
 */
public class ParseImp<T> extends Parse {


    @Override
    public T getValues(BaseBean baseBean) {
        return (T) getValue(baseBean);
    }
}
