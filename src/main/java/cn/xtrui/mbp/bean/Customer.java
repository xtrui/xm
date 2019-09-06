package cn.xtrui.mbp.bean;

import com.baomidou.mybatisplus.extension.activerecord.Model;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author tianrui
 * @since 2019-07-11
 */
public class Customer extends Model<Customer> {

    private static final long serialVersionUID=1L;

    private String cid;

    private String cname;

    private String phone;

    private String address;


    public String getCid() {
        return cid;
    }

    public void setCid(String cid) {
        this.cid = cid;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    protected Serializable pkVal() {
        return this.cid;
    }

    @Override
    public String toString() {
        return "Customer{" +
        "cid=" + cid +
        ", cname=" + cname +
        ", phone=" + phone +
        ", address=" + address +
        "}";
    }
}
