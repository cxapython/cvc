package com.example.cvc;

public interface INetInfoHandler {
    void onNetMobile2None();

    void onNetMobile2Wifi(String str);

    void onNetNone2Mobile(String str);

    void onNetNone2Wifi(String str);

    void onNetWifi2Mobile(String str);

    void onNetWifi2None();
}
