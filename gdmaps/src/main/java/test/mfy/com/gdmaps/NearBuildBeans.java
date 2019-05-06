package test.mfy.com.gdmaps;

import java.io.Serializable;
import java.util.List;

/**
 *
 */

public class NearBuildBeans {

    /**
     * data : [{"code":"12121","city":"市辖区","remark":"666","type":"120030","allCount":100,"province":"北京市","parkingFee":6,"ableCount":0,"closeTime":"23:00","logo":"http://intest.towatt.cn:16023/photo/1.png","id":42,"openTime":"00:00","longitude":116.292088,"area":"西城区","buildImgStr":"http://intest.towatt.cn:16023/photo/1521450828815.png","address":"[地上]建明苑","currentPrice":2,"banner":"http://intest.towatt.cn:16023/photo/1.png","sort":"120042","elecType":"2","phone":"18156251232","latiude":39.840876,"name":"liuhecai","position":"120050","status":"120011"},{"code":"b00000001","city":"市辖区","remark":null,"type":"120030","allCount":101,"province":"北京市","parkingFee":0,"ableCount":101,"closeTime":"23:59","logo":"http://intest.towatt.cn:16023/photo/1496978241207.png","id":1,"openTime":"00:00","longitude":116.291211,"area":"丰台区","buildImgStr":"","address":"五圈路东街69号诺德大厦","currentPrice":1.8044,"banner":"http://intest.towatt.cn:16023/photo/1.png","sort":"120041","elecType":"1","phone":"010-8332333","latiude":39.622111,"name":"诺德充电中心","position":"120050","status":"120010"},{"code":"b00000002","city":"市辖区","remark":"新郑大案例","type":"120032,120030,120031","allCount":103,"province":"北京市","parkingFee":0,"ableCount":103,"closeTime":"23:59","logo":"http://intest.towatt.cn:16023/photo/1519888386709.jpg","id":2,"openTime":"00:00","longitude":116.309695,"area":"海淀区","buildImgStr":"","address":"长春桥路欣政大厦","currentPrice":2,"banner":"http://intest.towatt.cn:16023/photo/1519888408605.jpg","sort":"120041","elecType":"1","phone":"0108332333","latiude":39.962429,"name":"欣政充电中心","position":"120050","status":"120010"},{"code":"b00000003","city":"市辖区","remark":null,"type":"120030","allCount":101,"province":"北京市","parkingFee":0,"ableCount":101,"closeTime":"23:59","logo":"http://intest.towatt.cn:16023/photo/1493791711520.png","id":3,"openTime":"00:00","longitude":116.442285,"area":"东城区","buildImgStr":"http://intest.towatt.cn:16023/photo/1521454642941.png","address":"京通快速公路天辰大厦","currentPrice":2,"banner":"http://intest.towatt.cn:16023/photo/1493791711583.jpg","sort":"120041","elecType":"2","phone":"010-8332333","latiude":39.934053,"name":"天辰充电中心","position":"120050","status":"120010"},{"code":"testthh","city":"市辖区","remark":"测试券","type":"120030","allCount":0,"province":"北京市","parkingFee":0,"ableCount":0,"closeTime":"23:59","logo":"http://intest.towatt.cn:16023\\photo\\1519976663458.jpg","id":113,"openTime":"00:00","longitude":116.309695,"area":"丰台区","buildImgStr":"http://intest.towatt.cn:16023/photo/1521452482341.png","address":"长春桥路欣政大厦","currentPrice":2,"banner":"http://intest.towatt.cn:16023/photo/1.png","sort":"120041","elecType":"2","phone":"0108332333","latiude":39.962429,"name":"测试卷","position":"120051","status":"120010"}]
     * status : 1
     */

    private int status;
    private List<DataBean> data;

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public List<DataBean> getData() {
        return data;
    }

    public void setData(List<DataBean> data) {
        this.data = data;
    }

    public static class DataBean implements Serializable{
        /**
         * code : 12121
         * city : 市辖区
         * remark : 666
         * type : 120030
         * allCount : 100
         * province : 北京市
         * parkingFee : 6.0
         * ableCount : 0
         * closeTime : 23:00
         * logo : http://intest.towatt.cn:16023/photo/1.png
         * id : 42
         * openTime : 00:00
         * longitude : 116.292088
         * area : 西城区
         * buildImgStr : http://intest.towatt.cn:16023/photo/1521450828815.png
         * address : [地上]建明苑
         * currentPrice : 2.0
         * banner: http://intest.towatt.cn:16023/photo/1.png
         * sort : 120042
         * elecType : 2
         * phone : 18156251232
         * latiude : 39.840876
         * name : liuhecai
         * position : 120050
         * status : 120011
         * dis：12.9km
         */

        private String code;
        private String city;
        private String remark;
        private String type;
        private int allCount;
        private String province;
        private double parkingFee;
        private int ableCount;
        private String closeTime;
        private String logo;
        private int id;
        private String openTime;
        private double longitude;
        private String area;
        private String buildImgStr;
        private String address;
        private String currentPrice;
        private String banner;
        private String sort;
        private String elecType;
        private String phone;
        private double latiude;
        private String name;
        private String position;
        private String status;
        private Boolean isonlyone;//自己构建的字段：用于判断是否只有一条数据
        private Double distance;//自己构建的字段：用于查看电站距离自己多远
        private Double servicePrice=0.00;

        public Double getServicePrice() {
            return servicePrice;
        }

        public void setServicePrice(Double servicePrice) {
            this.servicePrice = servicePrice;
        }

        public String getCode() {
            return code;
        }

        public void setCode(String code) {
            this.code = code;
        }

        public String getCity() {
            return city;
        }

        public void setCity(String city) {
            this.city = city;
        }

        public String getRemark() {
            return remark;
        }

        public void setRemark(String remark) {
            this.remark = remark;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public int getAllCount() {
            return allCount;
        }

        public void setAllCount(int allCount) {
            this.allCount = allCount;
        }

        public String getProvince() {
            return province;
        }

        public void setProvince(String province) {
            this.province = province;
        }

        public double getParkingFee() {
            return parkingFee;
        }

        public void setParkingFee(double parkingFee) {
            this.parkingFee = parkingFee;
        }

        public int getAbleCount() {
            return ableCount;
        }

        public void setAbleCount(int ableCount) {
            this.ableCount = ableCount;
        }

        public String getCloseTime() {
            return closeTime;
        }

        public void setCloseTime(String closeTime) {
            this.closeTime = closeTime;
        }

        public String getLogo() {
            return logo;
        }

        public void setLogo(String logo) {
            this.logo = logo;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getOpenTime() {
            return openTime;
        }

        public void setOpenTime(String openTime) {
            this.openTime = openTime;
        }

        public double getLongitude() {
            return longitude;
        }

        public void setLongitude(double longitude) {
            this.longitude = longitude;
        }

        public String getArea() {
            return area;
        }

        public void setArea(String area) {
            this.area = area;
        }

        public String getBuildImgStr() {
            return buildImgStr;
        }

        public void setBuildImgStr(String buildImgStr) {
            this.buildImgStr = buildImgStr;
        }

        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
        }

        public String getCurrentPrice() {
            return currentPrice;
        }

        public void setCurrentPrice(String currentPrice) {
            this.currentPrice = currentPrice;
        }

        public String getBanner() {
            return banner;
        }

        public void setBanner(String banner) {
            this.banner = banner;
        }

        public String getSort() {
            return sort;
        }

        public void setSort(String sort) {
            this.sort = sort;
        }

        public String getElecType() {
            return elecType;
        }

        public void setElecType(String elecType) {
            this.elecType = elecType;
        }

        public String getPhone() {
            return phone;
        }

        public void setPhone(String phone) {
            this.phone = phone;
        }

        public double getLatiude() {
            return latiude;
        }

        public void setLatiude(double latiude) {
            this.latiude = latiude;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getPosition() {
            return position;
        }

        public void setPosition(String position) {
            this.position = position;
        }

        public String getStatus() {
            return status;
        }

        public void setStatus(String status) {
            this.status = status;
        }
        public Boolean getIsonlyone() {
            return isonlyone;
        }

        public void setIsonlyone(Boolean isonlyone) {
            this.isonlyone = isonlyone;
        }

        public Double getDistance() {
            return MapGeographicUtil.GetDistance(MConstant.latitude, MConstant.longitude, getLatiude(),getLongitude());
        }

        public void setDistance(Double distance) {
            this.distance = distance;
        }
    }

}
