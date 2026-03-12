package com.aws.product.util;

import java.net.InetAddress;

public class InstanceUtil {

    public static String getInstanceName() {
        try {
            return InetAddress.getLocalHost().getHostName();
        } catch (Exception e) {
            return "unknown-instance";
        }
    }
}
