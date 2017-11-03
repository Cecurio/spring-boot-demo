package cn.cecurio.mvc4.domain;

/**
 * @author: Cecurio
 * @create: 2017-11-01 0:12
 * @desc:
 **/
public class DemoObj {
    private Long id;
    private String name;

    public DemoObj() {
    }

    public DemoObj(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
