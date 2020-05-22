
public class Q05 {

    public static void main(String[] args) {

    	Q05_ p1 = new Q05_("Ad");
    	Q05_ p2 = new Q05_("Soyad");

        System.out.println("----------main----------");
        System.out.println(p1);
        System.out.println(p2);

        swap(p1, p2);

        System.out.println("----------main2----------");
        System.out.println(p1);
        System.out.println(p2);
    }

    private static void swap(Q05_ p1Param, Q05_ p2Param) {

    	Q05_ temp = p1Param;
        p1Param = p2Param;
        p2Param = temp;

        System.out.println("----------swap----------");
        System.out.println(p1Param);
        System.out.println(p2Param);
    }
}
//pass by value. p1 deðeri deðiþmedi

