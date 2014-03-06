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
public class Devolucao implements Serializable {

    private int id;
    private Emprestimo emprestimo;
    private Conta atendente;
    private Date dtDevolucao;
    private boolean multado;

    public Devolucao() {
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @param emprestimo the emprestimo to set
     */
    public void setEmprestimo(Emprestimo emprestimo) {
        this.emprestimo = emprestimo;
    }

    /**
     * @param atendente the atendente to set
     */
    public void setAtendente(Conta atendente) {
        this.atendente = atendente;
    }

    /**
     * @param dtDevolucao the dtDevolucao to set
     */
    public void setDtDevolucao(Date dtDevolucao) {
        this.dtDevolucao = dtDevolucao;
    }

    /**
     * @param multado the multado to set
     */
    public void setMultado(boolean multado) {
        this.multado = multado;
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @return the emprestimo
     */
    public Emprestimo getEmprestimo() {
        return emprestimo;
    }

    /**
     * @return the atendente
     */
    public Conta getAtendente() {
        return atendente;
    }

    /**
     * @return the dtDevolucao
     */
    public Date getDtDevolucao() {
        return dtDevolucao;
    }

    /**
     * @return the multado
     */
    public boolean isMultado() {
        return multado;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 47 * hash + this.id;
        hash = 47 * hash + Objects.hashCode(this.emprestimo);
        hash = 47 * hash + Objects.hashCode(this.atendente);
        hash = 47 * hash + Objects.hashCode(this.dtDevolucao);
        hash = 47 * hash + (this.multado ? 1 : 0);
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
        final Devolucao other = (Devolucao) obj;
        if (this.id != other.id) {
            return false;
        }
        if (!Objects.equals(this.emprestimo, other.emprestimo)) {
            return false;
        }
        if (!Objects.equals(this.atendente, other.atendente)) {
            return false;
        }
        if (!Objects.equals(this.dtDevolucao, other.dtDevolucao)) {
            return false;
        }
        return this.multado == other.multado;
    }

    @Override
    public String toString() {
        return String.valueOf(this.getId());
    }

}