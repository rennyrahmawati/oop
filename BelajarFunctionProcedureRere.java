package belajarfunctionprocedure;

public class BelajarFunctionProcedureRere {
    public static void main(String[] args) {
        BelajarFunctionProcedure Belajar = new BelajarFunctionProcedure();
        Belajar.kurang(100,20);
        Belajar.kalkulator(50,30);
    }
    private void kalkulator(int a, int b){
        int hasiltambah, hasilkurang;
        hasiltambah = a + b;
        hasilkurang = a - b;
        System.out.println("hasil tambah : " + hasiltambah);
        System.out.println("hasil kurang : " + hasilkurang);    
    }
    private void kurang (int a, int b) {
        int hasil;
        hasil = a - b;
        System.out.println(hasil);
    }
    
}

