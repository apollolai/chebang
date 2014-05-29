package com.xbl.chebang.base;

import java.io.Serializable;

/**
 * Created by xbl on 5/29/14.
 */
public class BaseEntity implements Serializable
{
    private int mId;
    private int mType;

    public BaseEntity()
    {
    }

    public int getId()
    {
        return mId;
    }

    public int getType()
    {
        return mType;
    }

    public void setId(int i)
    {
        mId = i;
    }

    public void setType(int i)
    {
        mType = i;
    }

}
