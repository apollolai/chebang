package com.xbl.chebang.com.xbl.chebang.util;

import android.content.Context;

/**
 * Created by xbl on 5/29/14.
 */
public class SysUtil
{
    public static int dip2px(Context context, float f)
    {
        return (int)(0.5F + f * context.getResources().getDisplayMetrics().density);
    }

}
