/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manageproduk;

/**
 *
 * @author thero
 * 
 *   /*
   // supplier 1
    int Angklung;
    int besokap;
    int blankon;
    int bros;
    int bukubBlajar;
    int bukuCerita;
    int bumbu;
    
  //  supplier 2
    int celengan;
    int iket;
    int kamus;
    int kaos;
    int kecapi;
    int kopi;
    int liwet;
    
 //   supplier 3
    int mahkota;
    int pangrumat;
    int pangsi;
    int perang;
    int pisang;
    int pustaka;
    int rumah;
    
  //  supplier 4
    int sasakala;
    int siger;
    int simpay;
    int suling;
    int tales;
    int totopong;
    int udeng;
*/

public class produk {
    
    private static int hargaangklung = 25000;
    private static int hargabesokap = 115000;
    private static int hargablankon = 90000;
    private static int hargabros = 50000;
    private static int hargabukuBelajar = 25000;
    private static int hargabukuCerita = 25000;
    private static int hargabumbu = 30000;
    
    private static int hargacelengan = 1600;
    private static int hargaiket = 60000;
    private static int hargakamus = 20000;
    private static int hargakaos = 65000;
    private static int hargakecapi = 350000;
    private static int hargakopi = 85000;
    private static int hargaliwet = 19000;
    
    private static int hargamahkota = 190000;
    private static int hargapangrumat = 20000;
    private static int hargapangsi = 80000;
    private static int hargaperang = 13000;
    private static int hargapisang = 28000;
    private static int hargapustaka = 25000;
    private static int hargarumah = 60000;
   
    private static int hargasasakala = 17000;
    private static int hargasiger = 55000;
    private static int hargasimpay = 98000;
    private static int hargasuling = 10000;
    private static int hargatales = 15000;
    private static int hargatotopong = 12000;
    private static int hargaudeng = 75000;
    
    // supplier 1
    private static int stockangklung = 7;
    private static int stockbesokap = 5;
    private static int stockblankon = 5;
    private static int stockbros = 5;
    private static int stockbukuBelajar = 5;
    private static int stockbukuCerita = 5;
    private static int stockbumbu = 5;
    
  //  supplier 2
   private static int stockcelengan = 5;
   private static int stockiket = 5;
   private static int stockkamus= 5;
   private static int stockkaos= 5;
   private static int stockkecapi= 5;
   private static int stockkopi= 5;
   private static int stockliwet= 5;
    
 //   supplier 3
   private static int stockmahkota= 5;
   private static int stockpangrumat= 5;
   private static int stockpangsi= 5;
   private static int stockperang= 5;
   private static int stockpisang= 5;
   private static int stockpustaka= 5;
   private static int stockrumah= 5;
    
  //  supplier 4
   private static int stocksasakala= 5;
   private static int stocksiger= 5;
   private static int stocksimpay= 5;
   private static int stocksuling= 5;
   private static int stocktales = 5;
   private static int stocktotopong = 5;
   private static int stockudeng = 5;
    
    /* supplier 1
   public int stockangklung = 5;
   public int stockbesokap = 5;
   public int stockblankon = 5;
   public int stockbros = 5;
   public int stockbukuBelajar = 5;
   public int stockbukuCerita = 5;
   public int stockbumbu = 5;
    
  //  supplier 2
   public int stockcelengan = 5;
   public int stockiket = 5;
   public int stockkamus= 5;
   public int stockkaos= 5;
   public int stockkecapi= 5;
   public int stockkopi= 5;
   public int stockliwet= 5;
    
 //   supplier 3
   public int stockmahkota= 5;
   public int stockpangrumat= 5;
   public int stockpangsi= 5;
   public int stockperang= 5;
   public int stockpisang= 5;
   public int stockpustaka= 5;
   public int stockrumah= 5;
    
  //  supplier 4
   public int stocksasakala= 5;
   public int stocksiger= 5;
   public int stocksimpay= 5;
   public int stocksuling= 5;
   public int stocktales = 5;
   public int stocktotopong = 5;
   public int stockudeng = 5;
    */
   // 1 Produk  4 method 
    public int getHargaAngklung() {
        return hargaangklung;
    }

    public void setHargaAngklung(int hargaangklung) {
       this.hargaangklung = hargaangklung;
    }
    
    public int getStockAngklung(){
        return stockangklung;
    }
    
    public void setStockAngklung(int stockangklung){
       this.stockangklung = stockangklung;
    }
 // getHarga dan setHarga ----- getStock dan setStock  
    
    
    
    public int getHargaBesokap() {
        return hargabesokap;
    }

    public void setHargaBesokap(int hargabesokap) {
       this.hargabesokap = hargabesokap;
    }
    
    public int getStockBesokap(){
        return stockbesokap;
    }
    
    public void setStockBesokap(int stockbesokap){
       this.stockbesokap = stockbesokap;
    }
    
    
    
    
    
     public int getHargaBlankon() {
        return hargablankon;
    }

    public void setHargaBlankon(int hargablankon) {
       this.hargablankon = hargablankon;
    }
    
    public int getStockBlankon(){
        return stockblankon;
    }
    
    public void setStockBlankon(int stockblankon){
       this.stockblankon = stockblankon;
    }
    
    
    
    
    public int getHargaBros() {
        return hargabros;
    }

    public void setHargaBros(int hargabros) {
       this.hargabros = hargabros;
    }
    
    public int getStockBros(){
        return stockbros;
    }
    
    public void setStockBros(int stockbros){
       this.stockbros = stockbros;
    }
    
    
    
    
    
    public int getHargaBukuBelajar() {
        return hargabukuBelajar;
    }

    public void setHargaBukuBelajar(int hargabukuBelajar) {
       this.hargabukuBelajar = hargabukuBelajar;
    }
    
    public int getStockBukuBelajar(){
        return stockbukuBelajar;
    }
    
    public void setStockBukuBelajar(int stockbukuBelajar){
       this.stockbukuBelajar = stockbukuBelajar;
    }
    
    
    
    
  
    public int getHargaBukuCerita() {
        return hargabukuCerita;
    }

    public void setHargaBukuCerita(int hargabukuCerita) {
       this.hargabukuCerita = hargabukuCerita;
    }
    
    public int getStockBukuCerita(){
        return stockbukuCerita;
    }
    
    public void setStockBukuCerita(int stockbukuCerita){
       this.stockbukuCerita = stockbukuCerita;
    }
    
    
    
    
    
    public int getHargaBumbu() {
        return hargabumbu;
    }

    public void setHargaBumbu(int hargabumbu) {
       this.hargabumbu = hargabumbu;
    }
    
    public int getStockBumbu(){
        return stockbumbu;
    }
    
    public void setStockBumbu(int stockbumbu){
       this.stockbumbu = stockbumbu;
    }
    
    
      
    
    public int getHargaCelengan() {
        return hargacelengan;
    }

    public void setHargaCelengan(int hargacelengan) {
       this.hargacelengan = hargacelengan;
    }
    
    public int getStockCelengan(){
        return stockcelengan;
    }
    
    public void setStockCelengan(int stockcelengan){
       this.stockcelengan = stockcelengan;
    }
    
    
    
    
    
    public int getHargaIket() {
        return hargaiket;
    }

    public void setHargaIket(int hargaiket) {
       this.hargaiket = hargaiket;
    }
    
    public int getStockIket(){
        return stockiket;
    }
    
    public void setStockIket(int stockiket){
       this.stockiket = stockiket;
    }
    
    
    
    
    
    public int getHargaKamus() {
        return hargakamus;
    }

    public void setHargaKamus(int hargakamus) {
       this.hargakamus = hargakamus;
    }
    
    public int getStockKamus(){
        return stockkamus;
    }
    
    public void setStockKamus(int stockkamus){
       this.stockkamus = stockkamus;
    }
    
    
    
    
    public int getHargaKaos() {
        return hargakaos;
    }

    public void setHargaKaos(int hargakaos) {
       this.hargakaos = hargakaos;
    }
    
    public int getStockKaos(){
        return stockkaos;
    }
    
    public void setStockKaos(int stockkaos){
       this.stockkaos = stockkaos;
    }
    
    
    
    
      
    public int getHargaKecapi() {
        return hargakecapi;
    }

    public void setHargaKecapi(int hargakecapi) {
       this.hargakecapi = hargakecapi;
    }
    
    public int getStockKecapi(){
        return stockkecapi;
    }
    
    public void setStockKecapi(int stockkecapi){
       this.stockkecapi = stockkecapi;
    }
    
    
    
    
    
    public int getHargaKopi() {
        return hargakopi;
    }

    public void setHargaKopi(int hargakopi) {
       this.hargakopi = hargakopi;
    }
    
    public int getStockKopi(){
        return stockkopi;
    }
    
    public void setStockKopi(int stockkopi){
       this.stockkopi = stockkopi;
    }
    
    
    
    
    
     public int getHargaLiwet() {
        return hargaliwet;
    }

    public void setHargaLiwet (int hargaliwet) {
       this.hargaliwet = hargaliwet;
    }
    
    public int getStockLiwet(){
        return stockliwet;
    }
    
    public void setStockLiwet(int stockliwet){
       this.stockliwet = stockliwet;
    }
    
    
    
    
    
    
     public int getHargaMahkota() {
        return hargamahkota;
    }

    public void setHargaMahkota (int hargamahkota) {
       this.hargamahkota = hargamahkota;
    }
    
    public int getStockMahkota(){
        return stockmahkota;
    }
    
    public void setStockMahkota(int stockmahkota){
       this.stockmahkota = stockmahkota;
    }
    
    
    
    
    
     public int getHargaPangrumat() {
        return hargapangrumat;
    }

    public void setHargaPangrumat(int hargapangrumat) {
       this.hargapangrumat = hargapangrumat;
    }
    
    public int getStockPangrumat(){
        return stockpangrumat;
    }
    
    public void setStockPangrumat(int stockpangrumat){
       this.stockpangrumat = stockpangrumat;
    }
    
    
    
    
    
    
     public int getHargaPangsi() {
        return hargapangsi;
    }

    public void setHargaPangsi(int hargapangsi) {
       this.hargapangsi = hargapangsi;
    }
    
    public int getStockPangsi(){
        return stockpangsi;
    }
    
    public void setStockPangsi(int stockpangsi){
       this.stockpangsi = stockpangsi;
    }
    
    
    
    
    
     public int getHargaPerang() {
        return hargaperang;
    }

    public void setHargaPerang(int hargapangsi) {
       this.hargaperang = hargaperang;
    }
    
    public int getStockPerang(){
        return stockperang;
    }
    
    public void setStockPerang(int stockpangsi){
       this.stockperang = stockperang;
    }
    
    
    
    
    
     
     public int getHargaPisang() {
        return hargapisang;
    }

    public void setHargaPisang(int hargapisang) {
       this.hargapisang = hargapisang;
    }
    
    public int getStockPisang(){
        return stockpisang;
    }
    
    public void setStockPisang(int stockpangsi){
       this.stockpisang = stockpisang;
    }
    
    
    
    
    
    
     public int getHargaPustaka() {
        return hargapustaka;
    }

    public void setHargaPustaka(int hargapustaka) {
       this.hargapustaka = hargapustaka;
    }
    
    public int getStockPustaka(){
        return stockpustaka;
    }
    
    public void setStockPustaka(int stockpustaka){
       this.stockpustaka = stockpustaka;
    }
    
    
    
    
    
     public int getHargaRumah() {
        return hargarumah;
    }

    public void setHargaRumah(int hargapustaka) {
       this.hargarumah = hargarumah;
    }
    
    public int getStockRumah(){
        return stockrumah;
    }
    
    public void setStockRumah (int stockpustaka){
       this.stockrumah = stockrumah;
    }
    
    
    
    
    
     public int getHargaSasakala() {
        return hargasasakala;
    }

    public void setHargaSasakala(int hargasasakala) {
       this.hargasasakala = hargasasakala;
    }
    
    public int getStockSasakala(){
        return stocksasakala;
    }
    
    public void setStockSasakala (int stocksasakala){
       this.stocksasakala = stocksasakala;
    }
    
    
    
    
    
    
     public int getHargaSiger() {
        return hargasiger;
    }

    public void setHargaSiger(int hargasiger) {
       this.hargasiger = hargasiger;
    }
    
    public int getStockSiger(){
        return stocksiger;
    }
    
    public void setStockSiger(int stocksiger){
       this.stocksiger = stocksiger;
    }
    
    
    
    
    
    
     public int getHargaSimpay() {
        return hargasimpay;
    }

    public void setHargaSimpay(int hargasimpay) {
       this.hargasimpay = hargasimpay;
    }
    
    public int getStockSimpay(){
        return stocksimpay;
    }
    
    public void setStockSimpay(int stocksimpay){
       this.stocksimpay= stocksimpay;
    }
    
    
    
    
    
    
       public int getHargaSuling() {
        return hargasuling;
    }

    public void setHargaSuling(int hargasuling) {
       this.hargasuling= hargasuling;
    }
    
    public int getStockSuling(){
        return stocksuling;
    }
    
    public void setStockSuling(int stocksuling){
       this.stocksuling= stocksuling;
    }
    
    
    
    
    
    
    public int getHargaTales() {
        return hargatales;
    }

    public void setHargaTales(int hargatales) {
       this.hargatales= hargatales;
    }
    
    public int getStockTales(){
        return stocktales;
    }
    
    public void setStockTales(int stocktales){
       this.stocktales= stocktales;
    }
    
    
    
    
    
     public int getHargaTotopong() {
        return hargatotopong;
    }

    public void setHargaTotopong(int hargatotopong) {
       this.hargatotopong= hargatotopong;
    }
    
    public int getStockTotopong(){
        return stocktotopong;
    }
    
    public void setStockTotopong(int stocktotopong){
       this.stocktotopong = stocktotopong;
    }
    
    
    
    
    
    
    public int getHargaUdeng() {
        return hargaudeng;
    }

    public void setHargaUdeng(int hargaudeng) {
       this.hargaudeng= hargaudeng;
    }
    
    public int getStockUdeng(){
        return stockudeng;
    }
    
    public void setStockUdeng(int stockudeng){
       this.stockudeng = stockudeng;
    }
}
