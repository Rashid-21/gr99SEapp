package arrayspack;

public class ArrayCls1 {
    public static void main(String[] args) {

        String[] names = new String[6];
        names[0] = "Rahman";
        names[1] = "Tarlan";
        names[2] = "Mahammad";
        names[3] = "Najmaddin";
        names[4] = "Vafa";
        names[5] = "Rafael";


        for (int i = 0; i <= names.length - 1; i++) {
            System.out.println(names[i]);
        }
//        for (String a:names){
//            System.out.println(a);
//        }
    }
}
