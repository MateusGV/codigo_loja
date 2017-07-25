/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.loja_do_mateus;

/**
 *
 * @author aluno
 */
public class Venda {

    /**
     * @return the cod_venda
     */
    public int getCod_venda() {
        return cod_venda;
    }

    /**
     * @param cod_venda the cod_venda to set
     */
    public void setCod_venda(int cod_venda) {
        this.cod_venda = cod_venda;
    }

    /**
     * @return the numero_nota_fiscal
     */
    public int getNumero_nota_fiscal() {
        return numero_nota_fiscal;
    }

    /**
     * @param numero_nota_fiscal the numero_nota_fiscal to set
     */
    public void setNumero_nota_fiscal(int numero_nota_fiscal) {
        this.numero_nota_fiscal = numero_nota_fiscal;
    }
    private int cod_venda;
    private int numero_nota_fiscal;
}
