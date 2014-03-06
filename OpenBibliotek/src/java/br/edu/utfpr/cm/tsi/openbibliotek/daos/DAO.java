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
package br.edu.utfpr.cm.tsi.openbibliotek.daos;

import java.util.List;

/**
 *
 * @author Sérgio Ramos da Silva
 * @param <E>
 */
public interface DAO<E> {

    /**
     *
     * Persiste o objeto na base de dados.
     *
     * @param entidade Objeto a ser persistido na base.
     */
    public abstract void persistir(E entidade);

    /**
     *
     * Remove o objeto da base de dados
     *
     * @param entidade objeto a ser removido da base
     */
    public abstract void remover(E entidade);

    /**
     * Obtém uma lista de elementos da base de dados
     *
     * @param filtro Faz a filtratem dos elementos a serem obtidos
     * @return Uma lista com todos os elementos obtidos
     */
    public abstract List<E> listar(String filtro);

}
