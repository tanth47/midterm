import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class SubClass extends PhanTu<Integer> {

    public static List<Integer> list = new ArrayList<>();

    public SubClass() {
    }

    @Override
    public static boolean isGreaterThan(Integer a) {
        return super.value.compareTo(a) > 0;
    }

    public static void exportToFile() {
        try {
            String s;
            Scanner sc = new Scanner(System.in);
            s = sc.nextLine();
            FileOutputStream fos = new FileOutputStream(s);
            Writer dos = new BufferedWriter(new OutputStreamWriter(fos);
            for (Integer i : list) {
                dos.write(i + "\n");
            }
            dos.close();
            fos.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }


    public static void getData() {
        try {
            String s;
            Scanner sc = new Scanner(System.in);
            s = sc.nextLine();
            File file = new File(s);
            Scanner sc = new Scanner(file);
            int n = sc.nextInt();
            for(int i = 1; i<=n;i++){
                int x=sc.nextInt();
                list.add(x);
            }
        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        }
    }


    public static void main(String[] args) {
        getData();
        Collections.sort(list);
        exportToFile();
    }
}
