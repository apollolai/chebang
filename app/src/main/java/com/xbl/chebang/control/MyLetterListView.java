package com.xbl.chebang.control;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.view.MotionEvent;
import android.widget.ListView;

import com.xbl.chebang.com.xbl.chebang.util.SysUtil;

import java.util.ArrayList;

/**
 * Created by xbl on 5/29/14.
 */
public class MyLetterListView extends ListView
{
    private ArrayList mPy;
    private int mChoose;
    private Context mContext;
    private Paint mPaint;
    private boolean mShowBg;
    IOnTouchingLetterChangedListener mOnTouchingLetterChangedListener;
    ILetterIndexHeightChangedListener mLetterIndexHeightChangedListener;

    public static interface ILetterIndexHeightChangedListener
    {
        public abstract void longerThenOld();
        public abstract void shorterThenOld();
    }

    public static interface IOnTouchingLetterChangedListener
    {
        public abstract void onTouchingLetterChanged(String s);
    }

    public MyLetterListView(Context context)
    {
        super(context);
        mChoose = -1;
        mPaint = new Paint();
        mShowBg = false;
        mContext = context;
    }

    public boolean dispatchTouchEvent(MotionEvent motionevent)
    {
        int i = motionevent.getAction();
        float f = motionevent.getY();
        int j = mChoose;
        if (mPy == null)
            return false;
        int k = (int)((f / (float)getHeight()) * (float)mPy.size());
        switch (i)
        {
            case MotionEvent.ACTION_DOWN:
            case MotionEvent.ACTION_MOVE:
                if(j != k
                        && mOnTouchingLetterChangedListener != null
                        && k < py.size()
                        && k >= 0)
                {
                    mOnTouchingLetterChangedListener.onTouchingLetterChanged((String)mPy.get(k));
                    mChoose = k;
                    invalidate();
                }
                break;
            default:

                break;
        }
        return true;
    }

    public ArrayList getPy()
    {
        return mPy;
    }

    protected void onDraw(Canvas canvas)
    {
        super.onDraw(canvas);
        if(mShowBg)
            canvas.drawColor(Color.parseColor("#40000000"));
        if(mPy != null && mPy.size() != 0)
        {
            int i = getHeight();
            int j = getWidth();
            int k = i / py.size();
            int l = 0;
            while(l < mPy.size())
            {
                mPaint.setTextSize(SysUtil.dip2px(mContext, 12F));
                float f;
                float f1;
                if(mShowBg)
                    mPaint.setColor(-1);
                else
                    mPaint.setColor(0xff888888);
                mPaint.setTypeface(Typeface.DEFAULT_BOLD);
                mPaint.setAntiAlias(true);
                if(l == mChoose)
                {
                    mPaint.setColor(Color.parseColor("#3399ff"));
                    mPaint.setFakeBoldText(true);
                }
                f = (float)(j / 2) - mPaint.measureText((String)mPy.get(l)) / 2.0F;
                f1 = k + k * l;
                canvas.drawText((String)mPy.get(l), f, f1, paint);
                mPaint.reset();
                l++;
            }
        }
    }

    public void setLetterIndexHeightChangedListener(ILetterIndexHeightChangedListener l)
    {
        mLetterIndexHeightChangedListener = l;
    }

    public void setOnTouchingLetterChangedListener(IOnTouchingLetterChangedListener l)
    {
        mOnTouchingLetterChangedListener = l;
    }

    public void setPy(ArrayList list)
    {
        mPy = list;
        postInvalidate();
    }

}
