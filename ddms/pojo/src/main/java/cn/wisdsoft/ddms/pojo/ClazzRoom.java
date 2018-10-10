package cn.wisdsoft.ddms.pojo;

import java.io.Serializable;

public class ClazzRoom implements Serializable {
    private static final long serialVersionUID = -873324107599830815L;
    private String id;

    private String crLocation;

    private Integer crRoomnum;

    private Integer crMaxstunum;

    private String crType;

    private String remark;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getCrLocation() {
        return crLocation;
    }

    public void setCrLocation(String crLocation) {
        this.crLocation = crLocation == null ? null : crLocation.trim();
    }

    public Integer getCrRoomnum() {
        return crRoomnum;
    }

    public void setCrRoomnum(Integer crRoomnum) {
        this.crRoomnum = crRoomnum;
    }

    public Integer getCrMaxstunum() {
        return crMaxstunum;
    }

    public void setCrMaxstunum(Integer crMaxstunum) {
        this.crMaxstunum = crMaxstunum;
    }

    public String getCrType() {
        return crType;
    }

    public void setCrType(String crType) {
        this.crType = crType == null ? null : crType.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}