**这是一个二级联动菜单的自定义view，使用的时候只需要指定一级菜单和二级菜单的数据源。用到的场合有省份城市列表中，商城中产品展示的列表中等。**
##效果图如下:
   ![](http://upload-images.jianshu.io/upload_images/2528336-d832be2e96986f6a.gif?imageMogr2/auto-orient/strip)
   
##使用说明:  
   <pre><code>```<resources>
          <declare-styleable name="DoubleToggleView">
              <attr name="first_toggle_width" format="dimension" />
              <attr name="second_toggle_width" format="dimension" />
              <attr name="first_toggle_select_item_back" format="color" />
              <attr name="first_toggle_select_item_selector" format="reference" />
          </declare-styleable>
      </resources>```
   </code></pre>
   
   **first_toggle_width:第一个联动开关的宽度**
   
   **second_toggle_width:第二个联动开关的宽度**
   
   **first_toggle_select_item_back:第一个联动开关选中状态下的背景**
   
   **first_toggle_select_item_selector:第一个联动开关选中状态下字的选择器**
   
   ##后续改动: 
   - 在数据源方面可能需要多种属性的显示，让数据源更加地灵活。
   - 通过网络数据进行加载，实现数据的真实化。
   - 增加二级菜单展示效果的多样性。
   
   ##关于我:
     - 邮箱:a1002326270@163.com
     - 简书:[enter](http://www.jianshu.com/users/7b186b7247c1)
   
   
   
