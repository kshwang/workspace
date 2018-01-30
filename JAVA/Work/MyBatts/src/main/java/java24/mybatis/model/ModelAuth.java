package java24.mybatis.model;


public class ModelAuth {
    
    private Integer authid = null; // `authid` INT(11) NOT NULL,
    private String  name   = ""; // `name` VARCHAR(50) NULL DEFAULT NULL,
    private String  birth  = ""; // `birth` VARCHAR(10) NULL DEFAULT NULL,

    // getter,setter
    public Integer getAuthid() {
        return authid;
    }
    public void setAuthid(Integer authid) {
        this.authid = authid;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getBirth() {
        return birth;
    }
    public void setBirth(String birth) {
        this.birth = birth;
    }

    // toString
    @Override
    public String toString() {
        return "ModelAuth [authid=" + authid + ", name=" + name + ", birth="
                + birth + "]";
    }

    // 생성자
    public ModelAuth() {
        super();
    }
    public ModelAuth(Integer authid, String name, String birth) {
        super();
        this.authid = authid;
        this.name = name;
        this.birth = birth;
    }
    
}
