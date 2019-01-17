package com.qmulux.development;

import java.net.URLEncoder.*;

public class MyUtilTool {

    //this function is used to demonstrate how to use the base64 encode and decode method provided by java.net;
    public void SayHello(){
        System.out.println("hello world pavel han");
        //System.out.println(java.net.URLEncoder.encode("韩俊鹏","UTF-8"));
        String myBase64EncString = java.net.URLEncoder.encode("韩俊鹏，你好");//encode
        System.out.println(myBase64EncString);
        System.out.println(java.net.URLDecoder.decode(myBase64EncString));
        return;
    }

}
