package br.com.celulao.bean;

import br.com.celulao.constants.TipoPessoa;

/**
 * Created by SYSTEM on 19/11/2016.
 */
public final class ClientePF extends PessoaFisica implements Cliente{
    private static int tipo = TipoPessoa.ClientePF.getTipo();

    public ClientePF(String estado, String cidade, String endereço, String[] telefone, String nome, String RG, String CPF) {
        super(estado, cidade, endereço, telefone, nome, RG, CPF);
    }

    public String getNomeReferencia(){
        return getNome();
    }

    public int getTipo() { return tipo; }
}
