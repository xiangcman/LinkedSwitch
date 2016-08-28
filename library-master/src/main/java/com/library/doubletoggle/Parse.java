package com.library.doubletoggle;

import java.lang.reflect.Field;

/**
 * Created by xiangcheng on 16/8/21.
 * 第一个泛型是要用来显示的实体，第二个泛型是用来表示要显示字段的类型
 */
public abstract class Parse<VH extends BaseBean, T> {
    //获取要显示字段的值
    public abstract T getValues(VH vh);

    public T getValue(VH v) {

        Class<VH> vhClass = (Class<VH>) v.getClass();
        String name = v.getName();
        try {
            Field field = vhClass.getDeclaredField(name);
            field.setAccessible(true);
            try {
                return (T) field.get(v);
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }
        return null;
    }

}
