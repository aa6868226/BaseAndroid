package www.mrchao.com.bean;

import java.util.List;

/**
 * Created by Linfc
 * on 2017/6/23.
 */

public class Mode {

    private int code;
    private String msg;
    private List<DataBean> data;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public List<DataBean> getData() {
        return data;
    }

    public void setData(List<DataBean> data) {
        this.data = data;
    }

    public static class DataBean {
        @Override
        public String toString() {
            return "DataBean{" +
                    "imgUrl='" + imgUrl + '\'' +
                    ", id=" + id +
                    ", queryType=" + queryType +
                    ", price='" + price + '\'' +
                    ", name='" + name + '\'' +
                    ", introduce='" + introduce + '\'' +
                    ", addr='" + addr + '\'' +
                    '}';
        }

        private String imgUrl;
        private int id;
        private int queryType;
        private String price;
        private String name;
        private String introduce;
        private String addr;

        public String getImgUrl() {
            return imgUrl;
        }

        public void setImgUrl(String imgUrl) {
            this.imgUrl = imgUrl;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public int getQueryType() {
            return queryType;
        }

        public void setQueryType(int queryType) {
            this.queryType = queryType;
        }

        public String getPrice() {
            return price;
        }

        public void setPrice(String price) {
            this.price = price;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getIntroduce() {
            return introduce;
        }

        public void setIntroduce(String introduce) {
            this.introduce = introduce;
        }

        public String getAddr() {
            return addr;
        }

        public void setAddr(String addr) {
            this.addr = addr;
        }
    }

    @Override
    public String toString() {
        return "Mode{" +
                "code=" + code +
                ", msg='" + msg + '\'' +
                ", data=" + data +
                '}';
    }
}
