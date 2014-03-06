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
import java.util.List;
import java.util.Objects;

/**
 *
 * @author Sérgio Ramos da Silva
 */
public class Item implements Serializable {

    private int id;
    private String titulo;
    private Genero genero;
    private int ano;
    private Classificacao classificacao;
    private Estante estante;
    private int quantidade;
    private List<Exemplar> exemplares;
    private List<PalavrasChaves> palavrasChaves;

    public Item() {
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @param titulo the titulo to set
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    /**
     * @param genero the genero to set
     */
    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    /**
     * @param ano the ano to set
     */
    public void setAno(int ano) {
        this.ano = ano;
    }

    /**
     * @param classificacao the classificacao to set
     */
    public void setClassificacao(Classificacao classificacao) {
        this.classificacao = classificacao;
    }

    /**
     * @param estante the estante to set
     */
    public void setEstante(Estante estante) {
        this.estante = estante;
    }

    /**
     * @param quantidade the quantidade to set
     */
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    /**
     * @param exemplares the exemplares to set
     */
    public void setExemplares(List<Exemplar> exemplares) {
        this.exemplares = exemplares;
    }

    /**
     * @param palavrasChaves the palavrasChaves to set
     */
    public void setPalavrasChaves(List<PalavrasChaves> palavrasChaves) {
        this.palavrasChaves = palavrasChaves;
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @return the titulo
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * @return the genero
     */
    public Genero getGenero() {
        return genero;
    }

    /**
     * @return the ano
     */
    public int getAno() {
        return ano;
    }

    /**
     * @return the classificacao
     */
    public Classificacao getClassificacao() {
        return classificacao;
    }

    /**
     * @return the estante
     */
    public Estante getEstante() {
        return estante;
    }

    /**
     * @return the quantidade
     */
    public int getQuantidade() {
        return quantidade;
    }

    /**
     * @return the exemplares
     */
    public List<Exemplar> getExemplares() {
        return exemplares;
    }

    /**
     * @return the palavrasChaves
     */
    public List<PalavrasChaves> getPalavrasChaves() {
        return palavrasChaves;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 97 * hash + this.id;
        hash = 97 * hash + Objects.hashCode(this.titulo);
        hash = 97 * hash + Objects.hashCode(this.genero);
        hash = 97 * hash + this.ano;
        hash = 97 * hash + Objects.hashCode(this.classificacao);
        hash = 97 * hash + Objects.hashCode(this.estante);
        hash = 97 * hash + this.quantidade;
        hash = 97 * hash + Objects.hashCode(this.exemplares);
        hash = 97 * hash + Objects.hashCode(this.palavrasChaves);
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
        final Item other = (Item) obj;
        if (this.id != other.id) {
            return false;
        }
        if (!Objects.equals(this.titulo, other.titulo)) {
            return false;
        }
        if (!Objects.equals(this.genero, other.genero)) {
            return false;
        }
        if (this.ano != other.ano) {
            return false;
        }
        if (this.classificacao != other.classificacao) {
            return false;
        }
        if (!Objects.equals(this.estante, other.estante)) {
            return false;
        }
        if (this.quantidade != other.quantidade) {
            return false;
        }
        if (!Objects.equals(this.exemplares, other.exemplares)) {
            return false;
        }
        return Objects.equals(this.palavrasChaves, other.palavrasChaves);
    }

    @Override
    public String toString() {
        return this.getTitulo();
    }

}
