/*
 * Copyright (C) 2014 Sérgio Ramos da Silva
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package br.edu.utfpr.cm.tsi.openbibliotek.entidades;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

/**
 *
 * @author Sérgio Ramos da Silva
 */
public class Multa implements Serializable {
    
    private int id;
    private Devolucao devolucao;
    private Conta Atendente;
    private Conta usuario;
    private double valor;
    private boolean pago;
    private Date dtPagamento;
    
    public Multa() {
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @param devolucao the devolucao to set
     */
    public void setDevolucao(Devolucao devolucao) {
        this.devolucao = devolucao;
    }

    /**
     * @param Atendente the Atendente to set
     */
    public void setAtendente(Conta Atendente) {
        this.Atendente = Atendente;
    }

    /**
     * @param usuario the usuario to set
     */
    public void setUsuario(Conta usuario) {
        this.usuario = usuario;
    }

    /**
     * @param valor the valor to set
     */
    public void setValor(double valor) {
        this.valor = valor;
    }

    /**
     * @param pago the pago to set
     */
    public void setPago(boolean pago) {
        this.pago = pago;
    }

    /**
     * @param dtPagamento the dtPagamento to set
     */
    public void setDtPagamento(Date dtPagamento) {
        this.dtPagamento = dtPagamento;
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @return the devolucao
     */
    public Devolucao getDevolucao() {
        return devolucao;
    }

    /**
     * @return the Atendente
     */
    public Conta getAtendente() {
        return Atendente;
    }

    /**
     * @return the usuario
     */
    public Conta getUsuario() {
        return usuario;
    }

    /**
     * @return the valor
     */
    public double getValor() {
        return valor;
    }

    /**
     * @return the pago
     */
    public boolean isPago() {
        return pago;
    }

    /**
     * @return the dtPagamento
     */
    public Date getDtPagamento() {
        return dtPagamento;
    }
    
    @Override
    public int hashCode() {
        int hash = 5;
        hash = 59 * hash + this.id;
        hash = 59 * hash + Objects.hashCode(this.devolucao);
        hash = 59 * hash + Objects.hashCode(this.Atendente);
        hash = 59 * hash + Objects.hashCode(this.usuario);
        hash = 59 * hash + (int) (Double.doubleToLongBits(this.valor) ^ (Double.doubleToLongBits(this.valor) >>> 32));
        hash = 59 * hash + (this.pago ? 1 : 0);
        hash = 59 * hash + Objects.hashCode(this.dtPagamento);
        return hash;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Multa other = (Multa) obj;
        if (this.id != other.id) {
            return false;
        }
        if (!Objects.equals(this.devolucao, other.devolucao)) {
            return false;
        }
        if (!Objects.equals(this.Atendente, other.Atendente)) {
            return false;
        }
        if (!Objects.equals(this.usuario, other.usuario)) {
            return false;
        }
        if (Double.doubleToLongBits(this.valor) != Double.doubleToLongBits(other.valor)) {
            return false;
        }
        if (this.pago != other.pago) {
            return false;
        }
        return Objects.equals(this.dtPagamento, other.dtPagamento);
    }
    
    @Override
    public String toString() {
        return String.valueOf(this.getId());
    }
    
}
