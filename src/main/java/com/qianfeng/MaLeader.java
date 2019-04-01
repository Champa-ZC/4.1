package com.qianfeng;

public class MaLeader {

    private GreenTeaWater water;

    public GreenTeaWater getWater() {
        return water;
    }

    //xml的SpringIoC配置文件一定要有xxxset方法
    public void setWater(GreenTeaWater water) {
        this.water = water;
    }
}
