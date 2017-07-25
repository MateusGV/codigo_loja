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
public class Funcionario extends Pessoa {

    /**
     * @return the cart_trabalho
     */
    public String getCart_trabalho() {
        return cart_trabalho;
    }

    /**
     * @param cart_trabalho the cart_trabalho to set
     */
    public void setCart_trabalho(String cart_trabalho) {
        this.cart_trabalho = cart_trabalho;
    }

    /**
     * @return the plano_saude
     */
    public String getPlano_saude() {
        return plano_saude;
    }

    /**
     * @param plano_saude the plano_saude to set
     */
    public void setPlano_saude(String plano_saude) {
        this.plano_saude = plano_saude;
    }

    /**
     * @return the tp_sangue
     */
    public String getTp_sangue() {
        return tp_sangue;
    }

    /**
     * @param tp_sangue the tp_sangue to set
     */
    public void setTp_sangue(String tp_sangue) {
        this.tp_sangue = tp_sangue;
    }

    /**
     * @return the salario
     */
    public float getSalario() {
        return salario;
    }

    /**
     * @param salario the salario to set
     */
    public void setSalario(float salario) {
        this.salario = salario;
    }

    /**
     * @return the banco
     */
    public Banco getBanco() {
        return banco;
    }

    /**
     * @param banco the banco to set
     */
    public void setBanco(Banco banco) {
        this.banco = banco;
    }
   private String cart_trabalho;
   private String plano_saude;
   private String tp_sangue;
   private float salario;
   private Banco banco;
}
