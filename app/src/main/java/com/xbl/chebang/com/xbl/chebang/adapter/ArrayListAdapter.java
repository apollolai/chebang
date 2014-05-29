package com.xbl.chebang.com.xbl.chebang.adapter;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by xbl on 5/29/14.
 */
public abstract class ArrayListAdapter extends BaseAdapter
{
    public Activity mContext;
    protected String mKey;
    public ArrayList mList;
    public ListView mListView;

    public ArrayListAdapter(Activity activity)
    {
        mList = new ArrayList();
        mContext = activity;
    }

    @Override
    public int getCount()
    {
        if(mList != null)
            return mList.size();
        else
            return 0;
    }

    @Override
    public Object getItem(int i)
    {
        if(mList == null)
            return null;
        else
            return mList.get(i);
    }

    @Override
    public long getItemId(int i)
    {
        return (long)i;
    }

    @Override
    public abstract  View getView(int i, View view, ViewGroup viewGroup);

    public ArrayList getList()
    {
        return mList;
    }

    public ListView getListView()
    {
        return mListView;
    }

    public String getKey()
    {
        return mKey;
    }

    public void setList(ArrayList arraylist)
    {
        mList = arraylist;
        notifyDataSetChanged();
    }

    public void setList(Object objs[])
    {
        ArrayList arraylist = new ArrayList(objs.length);
        int i = objs.length;
        int j = 0;
        do
        {
            if(j >= i)
            {
                setList(arraylist);
                return;
            }
            arraylist.add(objs[j]);
            j++;
        } while(true);
    }

    public void setListView(ListView listview)
    {
        mListView = listview;
    }

    public void setKey(String s)
    {
        mKey = s;
    }
}
