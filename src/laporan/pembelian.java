/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laporan;

import java.util.ArrayList;

/**
 *
 * @author thero
 */
public class pembelian {
   public static int totalPengeluaran;
   
   
   public static ArrayList<String> listPembelianDistributorA = new ArrayList<String>();
   public static ArrayList<String> listRecordBarangDistributorA = new ArrayList<String>();
   
   public static int recordAngklung = 0;
   public static int recordBesokap = 0;
   public static int recordBlankon = 0;
   public static int recordBros = 0;
   public static int recordBukuBelajar = 0;
   public static int recordBukuCerita = 0;
   public static int recordBumbu = 0; 
      //celengan,iket,kamus,kaos,kecapi,kopi,liwet
   
   public static int recordCelengan = 0;
   public static int recordIket = 0;
   public static int recordKamus= 0;
   public static int recordKaos = 0;
   public static int recordKecapi = 0;
   public static int recordKopi = 0;
   public static int recordLiwet = 0;        
           

           
   public static ArrayList<String> listPembelianDistributorB = new ArrayList<String>();
   
   
   public static ArrayList<String> listPembelianDistributorC = new ArrayList<String>();
   public static ArrayList<String> listPembelianDistributorD = new ArrayList<String>();
    
   public int getTotalPengeluaran(){
       return totalPengeluaran;
   }
  
   public void setTotalPengeluaran(int totalPengeluaran){
       this.totalPengeluaran = totalPengeluaran;
   }
   
   public boolean addDistA(String v) {
    listPembelianDistributorA.add(v);
    return true;
}
   
   
}
