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
public class Cliente extends Pessoa {

    /**
     * @return the Cliente_vip
     */
    public boolean isCliente_vip() {
        return Cliente_vip;
    }

    /**
     * @param Cliente_vip the Cliente_vip to set
     */
    public void setCliente_vip(boolean Cliente_vip) {
        this.Cliente_vip = Cliente_vip;
    }
    private boolean Cliente_vip;
    
}
