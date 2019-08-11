/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Operaciones.DAO;

import java.io.IOException;
import java.util.List;

/**
 *
 * @author Samuel Barberena
 * @param <T>
 */
public interface IDaoModel<T> {

    void Save(T t) throws IOException;

    void Update(T t) throws IOException;

    List<T> Find() throws IOException;

    List<T> Show() throws IOException;
}
