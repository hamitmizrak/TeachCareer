package com.hamitmizrak.teachcareer.alternative;

import javax.enterprise.inject.Alternative;

@Alternative
public class _03_Proje2 implements _01_ProjeInterface {

    @Override
    public String surum(String data){
        return "proje-2  "+data;
    }
}
