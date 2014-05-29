package com.xbl.chebang.car.model;

import com.xbl.chebang.base.BaseEntity;

/**
 * Created by xbl on 5/29/14.
 */
public class BrandsEntity extends BaseEntity
{
    private String mBrandIcon;
    private String mBrandId;
    private String mBrandName;

    public BrandsEntity()
    {
    }

    public String getBrandIcon()
    {
        return mBrandIcon;
    }

    public String getBrandId()
    {
        return mBrandId;
    }

    public String getBrandName()
    {
        return mBrandName;
    }

    public void setBrandIcon(String s)
    {
        mBrandIcon = s;
    }

    public void setBrandId(String s)
    {
        mBrandId = s;
    }

    public void setBrandName(String s)
    {
        mBrandName = s;
    }

}
