package com.single.doubletoggle;

import com.library.doubletoggle.BaseBean;

import java.util.ArrayList;

/**
 * Created by xiangcheng on 16/8/20.
 */
public class Constants {
    private static ArrayList<BaseBean> list1;

    private static ArrayList<ArrayList<BaseBean>> list2;

    static {
        list1 = new ArrayList<>();
        list1.add(new Item("湖北"));
        list1.add(new Item("湖南"));
        list1.add(new Item("广东"));
        list1.add(new Item("江西"));
        list1.add(new Item("河北"));
        list1.add(new Item("河南"));
        list1.add(new Item("山东"));
        list1.add(new Item("山西"));
        list1.add(new Item("安徽"));
        list1.add(new Item("江苏"));
        list1.add(new Item("浙江"));
        list1.add(new Item("广西"));
        list1.add(new Item("云南"));
        list1.add(new Item("陕西"));
        list1.add(new Item("内蒙古"));
        list2 = new ArrayList<>();

        ArrayList<BaseBean> hubeiList = new ArrayList<>();
        hubeiList.add(new Item("武汉"));
        hubeiList.add(new Item("黄冈"));
        hubeiList.add(new Item("黄石"));
        hubeiList.add(new Item("黄梅"));
        hubeiList.add(new Item("武穴"));
        hubeiList.add(new Item("襄樊"));
        hubeiList.add(new Item("鄂州"));
        hubeiList.add(new Item("赤壁"));
        hubeiList.add(new Item("十堰"));
        hubeiList.add(new Item("孝感"));
        hubeiList.add(new Item("黄陂"));
        hubeiList.add(new Item("团陂"));
        hubeiList.add(new Item("浠水"));
        list2.add(hubeiList);

        ArrayList<BaseBean> hunanList = new ArrayList<>();
        hunanList.add(new Item("长沙"));
        hunanList.add(new Item("张家界"));
        hunanList.add(new Item("衡阳"));
        hunanList.add(new Item("株洲"));
        hunanList.add(new Item("湘潭"));
        hunanList.add(new Item("邵阳"));
        hunanList.add(new Item("岳阳"));
        hunanList.add(new Item("常德"));
        hunanList.add(new Item("益阳"));
        hunanList.add(new Item("娄底"));
        hunanList.add(new Item("永州"));
        hunanList.add(new Item("怀化"));
        list2.add(hunanList);

        ArrayList<BaseBean> guangdongList = new ArrayList<>();
        guangdongList.add(new Item("广州"));
        guangdongList.add(new Item("深圳"));
        guangdongList.add(new Item("珠海"));
        guangdongList.add(new Item("汕头"));
        guangdongList.add(new Item("佛山"));
        guangdongList.add(new Item("韶关"));
        guangdongList.add(new Item("湛江"));
        guangdongList.add(new Item("江门"));
        guangdongList.add(new Item("茂名"));
        guangdongList.add(new Item("惠州"));
        guangdongList.add(new Item("梅州"));
        guangdongList.add(new Item("东莞"));
        guangdongList.add(new Item("中山"));
        guangdongList.add(new Item("云浮"));
        list2.add(guangdongList);

        ArrayList<BaseBean> jiangxiList = new ArrayList<>();
        jiangxiList.add(new Item("南昌"));
        jiangxiList.add(new Item("九江"));
        jiangxiList.add(new Item("上饶"));
        jiangxiList.add(new Item("抚州"));
        jiangxiList.add(new Item("宜春"));
        jiangxiList.add(new Item("吉安"));
        jiangxiList.add(new Item("赣州"));
        jiangxiList.add(new Item("景德镇"));
        jiangxiList.add(new Item("萍乡"));
        jiangxiList.add(new Item("新余"));
        jiangxiList.add(new Item("鹰潭"));
        jiangxiList.add(new Item("婺源"));
        jiangxiList.add(new Item("宏村"));
        jiangxiList.add(new Item("三清山"));
        jiangxiList.add(new Item("婺源瀑布"));
        list2.add(jiangxiList);

        ArrayList<BaseBean> hebeiList = new ArrayList<>();
        hebeiList.add(new Item("石家庄"));
        hebeiList.add(new Item("沧州"));
        hebeiList.add(new Item("唐山"));
        hebeiList.add(new Item("秦皇岛"));
        hebeiList.add(new Item("邯郸"));
        hebeiList.add(new Item("邢台"));
        hebeiList.add(new Item("保定"));
        hebeiList.add(new Item("张家口"));
        hebeiList.add(new Item("承德"));
        hebeiList.add(new Item("廊坊"));
        hebeiList.add(new Item("衡水"));
        hebeiList.add(new Item("定州"));
        hebeiList.add(new Item("辛集"));
        list2.add(hebeiList);

        ArrayList<BaseBean> henanList = new ArrayList<>();
        henanList.add(new Item("郑州"));
        henanList.add(new Item("南阳"));
        henanList.add(new Item("南阳"));
        henanList.add(new Item("南阳"));
        henanList.add(new Item("南阳"));
        henanList.add(new Item("南阳"));
        henanList.add(new Item("南阳"));
        henanList.add(new Item("南阳"));
        henanList.add(new Item("南阳"));
        henanList.add(new Item("南阳"));
        henanList.add(new Item("南阳"));
        henanList.add(new Item("南阳"));
        henanList.add(new Item("南阳"));
        henanList.add(new Item("南阳"));
        henanList.add(new Item("南阳"));
        henanList.add(new Item("南阳"));
        henanList.add(new Item("南阳"));
        list2.add(henanList);

        ArrayList<BaseBean> shandongList = new ArrayList<>();
        shandongList.add(new Item("济南"));
        shandongList.add(new Item("青岛"));
        shandongList.add(new Item("青岛"));
        shandongList.add(new Item("青岛"));
        shandongList.add(new Item("青岛"));
        shandongList.add(new Item("青岛"));
        shandongList.add(new Item("青岛"));
        shandongList.add(new Item("青岛"));
        shandongList.add(new Item("青岛"));
        shandongList.add(new Item("青岛"));
        shandongList.add(new Item("青岛"));
        shandongList.add(new Item("青岛"));
        shandongList.add(new Item("青岛"));
        shandongList.add(new Item("青岛"));
        shandongList.add(new Item("青岛"));
        shandongList.add(new Item("青岛"));
        list2.add(shandongList);

        ArrayList<BaseBean> shanxiList = new ArrayList<>();
        shanxiList.add(new Item("太原"));
        shanxiList.add(new Item("大桐"));
        shanxiList.add(new Item("大桐"));
        shanxiList.add(new Item("大桐"));
        shanxiList.add(new Item("大桐"));
        shanxiList.add(new Item("大桐"));
        shanxiList.add(new Item("大桐"));
        shanxiList.add(new Item("大桐"));
        shanxiList.add(new Item("大桐"));
        shanxiList.add(new Item("大桐"));
        shanxiList.add(new Item("大桐"));
        shanxiList.add(new Item("大桐"));
        shanxiList.add(new Item("大桐"));
        shanxiList.add(new Item("大桐"));
        shanxiList.add(new Item("大桐"));
        shanxiList.add(new Item("大桐"));
        shanxiList.add(new Item("大桐"));
        list2.add(shanxiList);

        ArrayList<BaseBean> anhuiList = new ArrayList<>();
        anhuiList.add(new Item("合肥"));
        list2.add(anhuiList);
    }

    public static ArrayList<BaseBean> getSecondDatas(int index) {
        if (index >= list2.size()) {
            return new ArrayList<>();
        }
        return list2.get(index);
    }

    public static ArrayList<BaseBean> getFirstDatas() {
        return list1;
    }
}
