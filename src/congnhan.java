
public class congnhan {
    private String name;
    private float hsl;
    private float luongT;
    private float luongS;
    private float pc;
    public static float lcb = 1150;

    public congnhan(){
    }

    public congnhan(String name, float hsl, float pc){
        this.name = name;
        this.hsl = hsl;
        this.pc = pc;
    }

    public float getLuongS() {
        return lcb * hsl * (1 + pc);
    }

    public float getLuongT() {
        return lcb * hsl;
    }

    public float getHsl() {
        return hsl;
    }

    public String getName() {
        return name;
    }

    public void setHsl(float hsl) {
        this.hsl = hsl;
    }

    public float getPc() {
        return pc;
    }

    public void setName(String name) {
        if (name == null || name =="") {
            this.name = "noname";
        }
        this.name = name;
    }

    public void setPc(float pc) {
        this.pc = pc;
    }

    

    @Override
    public String toString() {
        return name +"    "+ hsl +"    "+ getLuongT() + "     "+ getLuongS();
    }

    public void nhap() {
    }
}