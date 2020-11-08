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
 * Nama     : Rizqy Ananda Rusmana
 * NIM      : 10119906
 * Kelas    : IF-10K
 */
public class user {
    private String username = "RizkiAdam";
    private String password = "terbaikselalu";
    private boolean statusAkun;

    private boolean cekAkun (String parUserName, String parPassword) {
        if ((parUserName.equals(username)) && (parPassword.equals(password))) {
            return statusAkun =true;
        }
        else {
            return statusAkun = false;
        }
    }

    private void hasilLogin (boolean status, String parUserName) {
        status = statusAkun;
        if (status) {
            System.out.printf("%n******HALO %s******%n",parUserName.toUpperCase());
            System.out.println("Selamat Datang di Aplikasi ini");
        }
        else {
            System.out.println("Ooops, Username atau Password anda salah");
        }
    }

    public void pengecekkanLogin (String parUserName, String parPassword) {
        cekAkun(parUserName, parPassword);
        hasilLogin(statusAkun,parUserName);
    }
    
}
