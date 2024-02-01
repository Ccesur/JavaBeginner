package property;


import lombok.Data;

    @Data
    public class Product {

        private int pid;
        private String title;
        private String detail;
        private int price;
        private boolean status;

    }

/*
    private int pid;
    private String title;
    private String detail;
    private int price;

    public Product() {
    }

    public void setPrice(int price) {
        if (price > 0) {
            this.price = price;
        } else {
            this.price = 0;
        }
    }

    public int getPrice() {
        return this.price;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
*/