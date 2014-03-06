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
import java.util.List;
import java.util.Objects;

/**
 *
 * @author Sérgio Ramos da Silva
 */
public class Emprestimo implements Serializable {
    
    private int id;
    private Conta atendente;
    private Conta usuario;
    private List<Exemplar> exemplares;
    private Date dtEmprestimo;
    private Date dtPrevDevolucao;
    private int qntRenovacaoes;
    private boolean devolvido;
    
    public Emprestimo() {
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @param atendente the atendente to set
     */
    public void setAtendente(Conta atendente) {
        this.atendente = atendente;
    }

    /**
     * @param usuario the usuario to set
     */
    public void setUsuario(Conta usuario) {
        this.usuario = usuario;
    }

    /**
     * @param exemplares the exemplares to set
     */
    public void setExemplares(List<Exemplar> exemplares) {
        this.exemplares = exemplares;
    }

    /**
     * @param dtEmprestimo the dtEmprestimo to set
     */
    public void setDtEmprestimo(Date dtEmprestimo) {
        this.dtEmprestimo = dtEmprestimo;
    }

    /**
     * @param dtPrevDevolucao the dtPrevDevolucao to set
     */
    public void setDtPrevDevolucao(Date dtPrevDevolucao) {
        this.dtPrevDevolucao = dtPrevDevolucao;
    }

    /**
     * @param qntRenovacaoes the qntRenovacaoes to set
     */
    public void setQntRenovacaoes(int qntRenovacaoes) {
        this.qntRenovacaoes = qntRenovacaoes;
    }

    /**
     * @param devolvido the devolvido to set
     */
    public void setDevolvido(boolean devolvido) {
        this.devolvido = devolvido;
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @return the atendente
     */
    public Conta getAtendente() {
        return atendente;
    }

    /**
     * @return the usuario
     */
    public Conta getUsuario() {
        return usuario;
    }

    /**
     * @return the exemplares
     */
    public List<Exemplar> getExemplares() {
        return exemplares;
    }

    /**
     * @return the dtEmprestimo
     */
    public Date getDtEmprestimo() {
        return dtEmprestimo;
    }

    /**
     * @return the dtPrevDevolucao
     */
    public Date getDtPrevDevolucao() {
        return dtPrevDevolucao;
    }

    /**
     * @return the qntRenovacaoes
     */
    public int getQntRenovacaoes() {
        return qntRenovacaoes;
    }

    /**
     * @return the devolvido
     */
    public boolean isDevolvido() {
        return devolvido;
    }
    
    @Override
    public int hashCode() {
        int hash = 5;
        hash = 47 * hash + this.id;
        hash = 47 * hash + Objects.hashCode(this.atendente);
        hash = 47 * hash + Objects.hashCode(this.usuario);
        hash = 47 * hash + Objects.hashCode(this.exemplares);
        hash = 47 * hash + Objects.hashCode(this.dtEmprestimo);
        hash = 47 * hash + Objects.hashCode(this.dtPrevDevolucao);
        hash = 47 * hash + this.qntRenovacaoes;
        hash = 47 * hash + (this.devolvido ? 1 : 0);
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
        final Emprestimo other = (Emprestimo) obj;
        if (this.id != other.id) {
            return false;
        }
        if (!Objects.equals(this.atendente, other.atendente)) {
            return false;
        }
        if (!Objects.equals(this.usuario, other.usuario)) {
            return false;
        }
        if (!Objects.equals(this.exemplares, other.exemplares)) {
            return false;
        }
        if (!Objects.equals(this.dtEmprestimo, other.dtEmprestimo)) {
            return false;
        }
        if (!Objects.equals(this.dtPrevDevolucao, other.dtPrevDevolucao)) {
            return false;
        }
        if (this.qntRenovacaoes != other.qntRenovacaoes) {
            return false;
        }
        return this.devolvido == other.devolvido;
    }
    
    @Override
    public String toString() {
        return String.valueOf(this.getId());
    }
    
}
