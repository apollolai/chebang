package com.xbl.chebang.car.adapter;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.xbl.chebang.app.R;
import com.xbl.chebang.car.model.BrandsEntity;
import com.xbl.chebang.com.xbl.chebang.adapter.ArrayListAdapter;

/**
 * Created by xbl on 5/29/14.
 */
public class BrandsAdapter extends ArrayListAdapter
{
    static class ViewHolder
    {

        ImageView mImg;
        TextView mName;
        LinearLayout mRootlayout;
        ImageView mSelectSign;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup)
    {
        View v = view;
        ViewHolder vh;
        BrandsEntity brandsentity = (BrandsEntity)mList.get(i);

        if(v == null)
        {
            v = mContext.getLayoutInflater().inflate(R.layout.car_brands_row, null);
            vh = new ViewHolder();
            vh.mRootlayout = (LinearLayout)v.findViewById(R.id.brandrowlayout);
            vh.mImg = (ImageView)v.findViewById(R.id.imagetitle);
            vh.mName = (TextView)v.findViewById(R.id.mytitle);
            vh.mSelectSign = (ImageView)v.findViewById(R.id.spinner_dropdown_item_selectsign);
            v.setTag(vh);
        }
        else
        {
            vh = (ViewHolder)v.getTag();
        }
        vh.mName.setTextColor(mContext.getResources().getColor(R.id.))
            viewholder.name.setTextColor(mContext.getResources().getColor());
            if(selectedBrandId.equals(brandsentity.getBrandId()))
            {
                viewholder.select_sign.setVisibility(0);
                viewholder.rootlayout.setBackgroundDrawable(mContext.getResources().getDrawable(0x7f090033));
            } else
            {
                viewholder.select_sign.setVisibility(4);
                viewholder.rootlayout.setBackgroundResource(0x7f020065);
            }

        viewholder.name.setText(brandsentity.getBrandName());
        if("-1000".equals(brandsentity.getBrandId()))
        {
            viewholder.img.setVisibility(8);
            return view1;
        }
        if("0".equals(brandsentity.getBrandId()))
        {
            viewholder.img.setVisibility(0);
            viewholder.img.setDefaultImage(Integer.valueOf(0x7f0201d3));
            viewholder.img.setImageUrl("");
            return view1;
        } else
        {
            viewholder.img.setVisibility(0);
            viewholder.img.setImageUrl(brandsentity.getBrandIcon());
            return view1;
        }

    }
}
