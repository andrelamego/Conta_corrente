package controller;

import java.io.BufferedWriter;
import java.io.IOException;

public class Methods {

    private void gravarContas(ContasCorrentes[] contas, BufferedWriter gravar) throws IOException{
        for (int i = 0; i < contas.length; i++) {
            gravar.write(Integer.toString(contas[i].codContaC)); gravar.newLine();
            gravar.write(contas[i].nomeClientesC); gravar.newLine();
            gravar.write(Double.toString(contas[i].saldoContaC)); gravar.newLine();
            gravar.write(Double.toString(contas[i].LimiteContaC)); gravar.newLine();
            gravar.write(Integer.toString(contas[i].tipoContaC)); gravar.newLine();
        }
    }



    public ContasCorrentes[] carregaContas(ContasCorrentes[] contas, BufferedWriter gravar) throws IOException{
        for (int i = 0; i < contas.length; i++) {
            
        }
        gravarContas(contas, gravar);

        return contas;
    }


    public MovimentosContas[] cadastraMovimento(){
        
    }
    
}
