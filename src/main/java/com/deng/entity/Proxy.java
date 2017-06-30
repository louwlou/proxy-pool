package com.deng.entity;

import java.util.Date;

/**
 * Created by hcdeng on 2017/6/30.
 */
public abstract class Proxy {
    //ip	端口号	代理位置	代理类型	验证时间
    private String ip;
    private int port;
    private String location;
    private String agentType;
    private Date lastValidateTime;

    public Proxy() {}

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getAgentType() {
        return agentType;
    }

    public void setAgentType(String agentType) {
        this.agentType = agentType;
    }

    public Date getLastValidateTime() {
        return lastValidateTime;
    }

    public void setLastValidateTime(Date lastValidateTime) {
        this.lastValidateTime = lastValidateTime;
    }

    @Override
    public String toString() {
        return "RawProxy{" + "ip='" + ip + '\'' + ", port=" + port + ", location='" + location + '\'' +
                ", agentType='" + agentType + '\'' + ", lastValidateTime='" + lastValidateTime + '\'' + '}';
    }
}