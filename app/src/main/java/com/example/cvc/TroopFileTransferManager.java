package com.example.cvc;

import java.util.Map;

public class TroopFileTransferManager implements INetInfoHandler {
    private static Map<Long, TroopFileTransferManager> J;
    private volatile long C;

    @Override
    public void onNetMobile2None() {

    }

    @Override
    public void onNetMobile2Wifi(String str) {

    }

    @Override
    public void onNetNone2Mobile(String str) {

    }

    @Override
    public void onNetNone2Wifi(String str) {

    }

    @Override
    public void onNetWifi2Mobile(String str) {

    }

    @Override
    public void onNetWifi2None() {

    }

    public static class Item extends TroopFileTansferItemEntity {
        public static final String ThumbnailFilePrefix = "[Thumb]";
        public static final int W2M_PAUSE_CAN_RESUME = 2;
        public static final int W2M_PAUSE_NONE = 0;
        public static final int W2M_PAUSE_NO_RESUME = 1;
        public transient byte[] CheckKey;
        public transient String DownloadDNS;
        public transient String DownloadIp;
        public transient String DownloadUrl;
        public transient boolean IsNewStatus;

        public Item(s ss) {
            ((TroopFileTansferItemEntity) this).FileName = ss.a;
            this.DownloadUrl = "这个值不会改变才对";
            ((TroopFileTansferItemEntity) this).FilePath = ss.b;
        }

    }
}