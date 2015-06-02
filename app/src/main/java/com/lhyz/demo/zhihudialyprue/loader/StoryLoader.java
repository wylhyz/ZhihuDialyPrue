package com.lhyz.demo.zhihudialyprue.loader;

import android.content.Context;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.lhyz.demo.zhihudialyprue.bean.StoryDetail;
import com.lhyz.demo.zhihudialyprue.datebase.DataSource;
import com.lhyz.demo.zhihudialyprue.network.BaseHttp;

import java.io.IOException;

public class StoryLoader extends DataLoader<StoryDetail> {

    private String url;
    private Gson mGson = new Gson();
    private Context mContext;

    public StoryLoader(Context context,String url) {
        super(context);
        mContext = context;
        this.url = url;
    }

    @Override
    protected StoryDetail loadData() {
        String raw = null;
        StoryDetail detail;
        try{
            raw = BaseHttp.get(url);
        }catch (IOException e){
            e.printStackTrace();
        }
        if(raw == null){
            return null;
        }

        detail = mGson.fromJson(raw, new TypeToken<StoryDetail>() {
        }.getType());
        DataSource.getInstance(mContext).insertNewDetail(detail);
        return detail;
    }

    @Override
    public StoryDetail loadInBackground() {
        return loadData();
    }
}
