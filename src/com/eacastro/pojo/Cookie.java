package com.eacastro.pojo;

// Sintaxis definicion clase:
// Nivel-acceso - class - Identificador { }
public class Cookie {

    private String flavor;
    private String smell;
    private String shape;
    
//    public Cookie() {
//        
//    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    public String getFlavor() {
        return flavor;
    }

    public String getSmell() {
        return smell;
    }

    public void setSmell(String smell) {
        this.smell = smell;
    }

    public String getShape() {
        return shape;
    }

    public void setShape(String shape) {
        this.shape = shape;
    }

}
