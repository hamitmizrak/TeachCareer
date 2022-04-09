package com.hamitmizrak.teachcareer.cdi;

import lombok.*;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder

//cdi ==> bean
@Named(value = "namedtuto")
@ApplicationScoped
public class _01_Named {

    private Long namedId=44L;
    private String namedData="Merhabalar Named Cdi Bean";
}
