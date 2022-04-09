package com.hamitmizrak.teachcareer.alternative;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.inject.Named;

@Named(value = "alternative_cdi")
@ApplicationScoped
public class _04_ProjectCdiBean {

    @Inject
    private _01_ProjeInterface patronInterface;



    public String getData(String data){
        return patronInterface.surum(data);
    }
}
