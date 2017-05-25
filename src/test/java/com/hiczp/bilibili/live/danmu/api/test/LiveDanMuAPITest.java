package com.hiczp.bilibili.live.danmu.api.test;

import com.hiczp.bilibili.live.danmu.api.LiveDanMuAPI;

/**
 * Created by czp on 17-5-24.
 */
class LiveDanMuAPITest {
    public static void main(String[] args) {
        try {
            LiveDanMuAPI liveDanMuAPI = new LiveDanMuAPI("http://live.bilibili.com/545342")
                    .setPrintDebugInfo(true)
                    .addCallback(new LiveDanMuCallback())
                    .connect();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}