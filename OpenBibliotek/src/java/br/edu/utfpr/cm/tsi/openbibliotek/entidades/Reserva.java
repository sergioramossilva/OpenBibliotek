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
public class Reserva implements Serializable {

    private int id;
    private Conta usuario;
    private List<Exemplar> exemplares;
    private Date dtReserva;
    private Date dtValidade;

    public Reserva() {
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
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
     * @param dtReserva the dtReserva to set
     */
    public void setDtReserva(Date dtReserva) {
        this.dtReserva = dtReserva;
    }

    /**
     * @param dtValidade the dtValidade to set
     */
    public void setDtValidade(Date dtValidade) {
        this.dtValidade = dtValidade;
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
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
     * @return the dtReserva
     */
    public Date getDtReserva() {
        return dtReserva;
    }

    /**
     * @return the dtValidade
     */
    public Date getDtValidade() {
        return dtValidade;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 47 * hash + this.id;
        hash = 47 * hash + Objects.hashCode(this.usuario);
        hash = 47 * hash + Objects.hashCode(this.exemplares);
        hash = 47 * hash + Objects.hashCode(this.dtReserva);
        hash = 47 * hash + Objects.hashCode(this.dtValidade);
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
        final Reserva other = (Reserva) obj;
        if (this.id != other.id) {
            return false;
        }
        if (!Objects.equals(this.usuario, other.usuario)) {
            return false;
        }
        if (!Objects.equals(this.exemplares, other.exemplares)) {
            return false;
        }
        if (!Objects.equals(this.dtReserva, other.dtReserva)) {
            return false;
        }
        return Objects.equals(this.dtValidade, other.dtValidade);
    }

    @Override
    public String toString() {
        return String.valueOf(this.getId());
    }
}
