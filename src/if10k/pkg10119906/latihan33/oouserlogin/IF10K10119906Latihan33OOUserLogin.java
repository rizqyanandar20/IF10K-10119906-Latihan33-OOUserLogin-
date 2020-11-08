/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if10k.pkg10119906.latihan33.oouserlogin;
import java.util.Scanner;

/**
 *
 * @author senenngahenen
 * Nama     : RizqyAnandaRusmana
 * NIM      : 10119906
 * Kelas    : IF-10K
 */
public class IF10K10119906Latihan33OOUserLogin {

    /**
     * @param args the command line arguments
     */
    private static String usName, passWord;
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan Username : ");
        usName = scanner.nextLine();
        System.out.print("Masukkan Password : ");
        passWord = scanner.nextLine();
        user user1 = new user();
        user1.pengecekkanLogin(usName,passWord);
    }
    
}
