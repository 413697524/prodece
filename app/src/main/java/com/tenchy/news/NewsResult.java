package com.tenchy.news;

import java.util.Objects;

/**
 * Created by Administrator on 2017/7/28.
 */

public class NewsResult {
    private int status;
    private String msg;
    private String messageNum;
    private Objects data;

    public NewsResult() {
    }


    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getMessageNum() {
        return messageNum;
    }

    public void setMessageNum(String messageNum) {
        this.messageNum = messageNum;
    }

    public Objects getData() {
        return data;
    }

    public void setData(Objects data) {
        this.data = data;
    }
}
