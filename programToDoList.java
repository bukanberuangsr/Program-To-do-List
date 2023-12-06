/*
 * Author: Akhtar Hafiz Puliwarna
 * Teknologi Informasi (A) | 235150707111013
 * Program To-do List
 */
import java.util.ArrayList;
import java.util.Scanner;

public class programToDoList {
    private static ArrayList<String> tugas = new ArrayList<>();
    private static ArrayList<String> tugasSelesai = new ArrayList<>();
    public static void main(String[] args) throws Exception {
        int input;
        do {
            Scanner scanner = new Scanner(System.in);
            System.out.println("\n||==========||Program To-do List||==========||");
            menuUtama();
            System.out.print("   Masukkan input anda: ");
            input = scanner.nextInt();
            switch (input) {
                case 1 -> {
                    menuInputTugas();
                    break;
                }
                case 2 -> {
                    menuTandaSelesai();
                    break;
                }
                case 3 -> {
                    menuHapusTugas();
                    break;
                }
                case 4 -> {
                    menuTampilanTugas();
                    break;
                }
                case 0 -> {
                    System.out.println("\nKeluar dari program...");
                    break;
                }
                default -> {
                    System.out.println("\nInput tidak valid! Silahkan coba lagi");
                }
            }
        } while (input != 0);
    }
    private static void menuUtama(){
        System.out.println("   Menu Utama: ");
        System.out.println("1. Masukkan Tugas");
        System.out.println("2. Tandai selesai");
        System.out.println("3. Hapus tugas");
        System.out.println("4. Cek to-do list");
        System.out.println("0. Keluar program");
    }
    private static void menuInputTugas(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n==========Masukkan Tugas Anda==========");
        System.out.print("Tugasmu adalah: ");
        String input = scanner.nextLine();
        tugas.add(input);
        System.out.println("Tugas telah ditambahkan!");
    }
    private static void menuTandaSelesai(){ 
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n==========||Menu Tandai Selesai||==========");
        System.out.print("Masukkan indeks tugas tersebut: ");
        int index = scanner.nextInt();
        
        if (index >= 0 && index < tugas.size()){
            String sementara = tugas.remove(index);
            tugasSelesai.add(sementara);
            System.out.println("Tugas ini dinyatakan dinyatakan selesai!\n");      
        } else {
            System.out.println("Index tidak valid\n");
        }
    }
    private static void menuHapusTugas(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n==========||Hapus Tugas||==========");
        System.out.print("Masukkan indeks tugas: ");
        int index = scanner.nextInt();
        
        if (index >= 0 && index < tugas.size()){
            tugas.remove(index);
            System.out.println("Tugas telah dihapus!\n");
        } else {
            System.out.println("Index tidak valid!\n");
        }
    }
    private static void menuTampilanTugas(){
        System.out.println("\n==========||Daftar Tugas||==========");
        for (int i = 0; i < tugas.size(); i++) {
            System.out.println(i  + ". " + tugas.get(i));
        }
        System.out.println("\n==========||Daftar Tugas yang Selesai||==========");
        for (int i = 0; i < tugasSelesai.size(); i++) {
            System.out.println(i  + ". " + tugasSelesai.get(i));
        }
        System.out.println();
    }
}