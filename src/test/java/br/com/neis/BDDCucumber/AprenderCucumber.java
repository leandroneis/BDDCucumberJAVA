package br.com.neis.BDDCucumber;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;

public class AprenderCucumber {
    @Dado("^que criei o arquivo corretamente$")
    public void queCrieiOArquivoCorretamente() throws Throwable {
        System.out.println("qualquer coisa");

    }

    @Quando("^executá-lo$")
    public void executáLo() throws Throwable {

    }

    @Entao("^a especificação deve finalizar com sucesso$")
    public void AEspecificaçãoDeveFinalizarComSucesso() throws Throwable {

    }

}