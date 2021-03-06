/*
 * Copyright (c) 2016 lhyz Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.lhyz.android.zhihu.daily.data.bean;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * hello,android
 * Created by lhyz on 2016/8/19.
 */
public class Latest {
    private String date;
    private List<Normal> stories;
    @SerializedName("top_stories")
    private List<Top> topStories;

    public String getDate() {
        return date;
    }

    public List<Normal> getStories() {
        return stories;
    }

    public List<Top> getTopStories() {
        return topStories;
    }
}
