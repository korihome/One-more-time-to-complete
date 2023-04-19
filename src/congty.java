import java.util.Scanner;

public class congty {
    public static void main(String[] args) {
        float S;
        float n = 0;
        float m = 0;
        Scanner s = new Scanner(System.in);
        congnhan[] a = new congnhan[3];
        //nhap thong tin
        
        for (int i = 0; i < 3; i++) {
            System.out.println("Nguoi thu " + (i+1));
            a[i] = getinfor();
        }
        System.out.println("-------------------------------------------------");
        //hien lai danh sach
        for (int i = 0; i < 3; i++) {
            System.out.println(a[i]);
        }
        System.out.println("-------------------------------------------------");
        //Nhap S, so sanh voi S
        System.out.print("Nhap S: ");
        S = s.nextFloat();
        for (int i = 0; i < 3; i++) {
            if (a[i].getHsl()>S) {
                System.out.println(a[i]);
            }
        }
        System.out.println("-------------------------------------------------");
        for (int i = 0; i < 3; i++) {
            n+=a[i].getLuongS();
            m+=a[i].getLuongT();
        }

        System.out.println("Tong luong chenh lech: " + (n - m));
    }

    public static congnhan getinfor(){
        congnhan a = new congnhan();
        System.out.print("Nhap ten: ");
        a.setName(new Scanner(System.in).nextLine());
        System.out.print("Nhap hsl: ");
        a.setHsl(new Scanner(System.in).nextFloat());
        System.out.print("Nhap phu cap: ");
        a.setPc(new Scanner(System.in).nextFloat());
        return a;
    }
}