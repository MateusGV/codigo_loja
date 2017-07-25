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
public class Banco {

    /**
     * @return the nome_agencia
     */
    public String getNome_agencia() {
        return nome_agencia;
    }

    /**
     * @param nome_agencia the nome_agencia to set
     */
    public void setNome_agencia(String nome_agencia) {
        this.nome_agencia = nome_agencia;
    }

    /**
     * @return the numero_agencia
     */
    public int getNumero_agencia() {
        return numero_agencia;
    }

    /**
     * @param numero_agencia the numero_agencia to set
     */
    public void setNumero_agencia(int numero_agencia) {
        this.numero_agencia = numero_agencia;
    }

    /**
     * @return the conta_corrente
     */
    public int getConta_corrente() {
        return conta_corrente;
    }

    /**
     * @param conta_corrente the conta_corrente to set
     */
    public void setConta_corrente(int conta_corrente) {
        this.conta_corrente = conta_corrente;
    }
   private String nome_agencia;
   private int numero_agencia;
   private int conta_corrente;
}