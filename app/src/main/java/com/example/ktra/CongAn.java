package com.example.ktra;

public class CongAn {
    String Ten, capBac, noiCongTac, quocGia;
    int Hinh;

    public CongAn() {
    }

    public CongAn(String ten, String capBac, String noiCongTac, String quocGia, int hinh) {
        Ten = ten;
        this.capBac = capBac;
        this.noiCongTac = noiCongTac;
        this.quocGia = quocGia;
        Hinh = hinh;
    }

    public String getTen() {
        return Ten;
    }

    public void setTen(String ten) {
        Ten = ten;
    }

    public String getCapBac() {
        return capBac;
    }

    public void setCapBac(String capBac) {
        this.capBac = capBac;
    }

    public String getNoiCongTac() {
        return noiCongTac;
    }

    public void setNoiCongTac(String noiCongTac) {
        this.noiCongTac = noiCongTac;
    }

    public String getQuocGia() {
        return quocGia;
    }

    public void setQuocGia(String quocGia) {
        this.quocGia = quocGia;
    }

    public int getHinh() {
        return Hinh;
    }

    public void setHinh(int hinh) {
        Hinh = hinh;
    }
}
