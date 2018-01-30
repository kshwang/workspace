package java13.st4emp;

public class Emp {
    private String name;
    private String addr;
    private int    saly;
    private int    bday;
    
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getAddr() {
        return addr;
    }
    public void setAddr(String addr) {
        this.addr = addr;
    }
    public int getSaly() {
        return saly;
    }
    public void setSaly(int saly) {
        this.saly = saly;
    }
    public int getBday() {
        return bday;
    }
    public void setBday(int bday) {
        this.bday = bday;
    }
    
    public Emp() {
        super();
    }
    public Emp(String name, String addr, int saly, int bday) {
        super();
        this.name = name;
        this.addr = addr;
        this.saly = saly;
        this.bday = bday;
    }
    @Override
    public String toString() {
        return "Emp [name=" + name + ", addr=" + addr + ", saly=" + saly
                + ", bday=" + bday + "]";
    }
    
}
