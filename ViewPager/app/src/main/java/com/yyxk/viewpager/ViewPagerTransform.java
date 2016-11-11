package com.yyxk.viewpager;

import android.support.v4.view.ViewPager;
import android.view.View;

/**
 * ----------Dragon be here!----------/
 * 　　　┏┓　　　┏┓
 * 　　┏┛┻━━━┛┻┓
 * 　　┃　　　　　　　┃
 * 　　┃　　　━　　　┃
 * 　　┃　┳┛　┗┳　┃
 * 　　┃　　　　　　　┃
 * 　　┃　　　┻　　　┃
 * 　　┃　　　　　　　┃
 * 　　┗━┓　　　┏━┛
 * 　　　　┃　　　┃神兽保佑
 * 　　　　┃　　　┃代码无BUG！
 * 　　　　┃　　　┗━━━┓
 * 　　　　┃　　　　　　　┣┓
 * 　　　　┃　　　　　　　┏┛
 * 　　　　┗┓┓┏━┳┓┏┛
 * 　　　　　┃┫┫　┃┫┫
 * 　　　　　┗┻┛　┗┻┛
 * ━━━━━━神兽出没━━━━━━
 * 项目名称：ViewPager
 * 包名:com.yyxk.viewpager
 * 类描述：
 * 创建人：Random
 * 创建时间：18:25
 * 修改人：Random
 * 修改时间：18:25
 * 修改备注：
 */
public class ViewPagerTransform implements ViewPager.PageTransformer {
    @Override
    public void transformPage(View page, float position) {
        page.setTranslationX(-1*page.getWidth()*position);

        if(position >= -.5 && position <= .5)
            page.setAlpha(1);
        else
            page.setAlpha(0);

        page.setRotationY(position*180);
    }
}
