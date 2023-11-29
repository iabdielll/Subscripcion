package com.example.subscripcion;
public class dataClase {
    private String dataNombre;
    private String dataDesc;
    private String dataPrec;
    private String dataImg;
    private String key;

    public dataClase(String title, String desc, String pres, String imageURL) {
    }

    public String getDataNombre() {
        return dataNombre;
    }

    public void setDataNombre(String dataNombre) {
        this.dataNombre = dataNombre;
    }

    public String getDataDesc() {
        return dataDesc;
    }

    public void setDataDesc(String dataDesc) {
        this.dataDesc = dataDesc;
    }

    public String getDataPrec() {
        return dataPrec;
    }

    public void setDataPrec(String dataPrec) {
        this.dataPrec = dataPrec;
    }

    public String getDataImg() {
        return dataImg;
    }

    public void setDataImg(String dataImg) {
        this.dataImg = dataImg;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }
}
