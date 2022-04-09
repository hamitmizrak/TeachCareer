package com.hamitmizrak.teachcareer.alternative;

import javax.enterprise.inject.Alternative;

@Alternative
public class _02_Proje1 implements _01_ProjeInterface {

    //@Alternative: aynı anda sadece 1 tane proje çalışıyor diğerleri kapalı
    @Override
    public String surum(String data){
        return "proje-1 "+data;
    }
}
