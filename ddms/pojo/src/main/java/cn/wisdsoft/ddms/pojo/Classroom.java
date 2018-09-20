package cn.wisdsoft.ddms.pojo;

public class Classroom {
    private Integer crId;

    private String crLocation;

    private Integer crRoomnum;

    private Integer crMaxstunum;

    private String crType;

    private String remark;

    public Integer getCrId() {
        return crId;
    }

    public void setCrId(Integer crId) {
        this.crId = crId;
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