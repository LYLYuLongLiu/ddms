package cn.wisdsoft.pojo;

import java.util.List;

/**
 * <p>ClassName: PageResult</p>
 * <p>Description:</p>
 *
 * @author 刘玉龙
 * @version 1.0
 * @date 2018/9/19 20:56
 */
public class PageResult<T> {

    private String msg;
    private Integer code;
    private long count;
    private List<T> data;


    public PageResult() {
        this.code = 0;
        this.msg = "OK";
        this.data = null;
        this.count = 0;
    }

    public PageResult(List<T> data, long count) {
        this.code = 0;
        this.msg = "OK";
        this.data = data;
        this.count = count;
    }

    public String getMsg() {
        return msg;
    }

    public static PageResult ok(List data, long count) {
        return new PageResult(data, count);
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public long getCount() {
        return count;
    }

    public void setCount(long count) {
        this.count = count;
    }

    public List<T> getData() {
        return data;
    }

    public void setData(List<T> data) {
        this.data = data;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }
}
