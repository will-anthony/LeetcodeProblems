package com.company.strings;

public class DefangingAnIPAddress {
//    Runtime: 0 ms, faster than 100.00%
//    Memory Usage: 37.4 MB, less than 28.69%
    public String defangIPaddr(String address) {
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < address.length(); i++){
            char curr = address.charAt(i);
            if(curr != '.') {
                sb.append(curr);
            } else {
                sb.append("[.]");
            }
        }
        return sb.toString();
    }
}
