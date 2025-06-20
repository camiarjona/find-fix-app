package com.findfix.find_fix_app.oficio.service;

import com.findfix.find_fix_app.utils.exception.exceptions.OficioException;
import com.findfix.find_fix_app.utils.exception.exceptions.OficioNotFoundException;
import com.findfix.find_fix_app.oficio.model.Oficio;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface OficioService {

    Oficio crearOficio(Oficio oficio) throws OficioException;
    List<Oficio> buscarTodos();
    Optional<Oficio> buscarPorId(Long id);
    void modificarOficio(Long id, Oficio nuevo) throws OficioNotFoundException;
    void borrarOficioPorId(Long id) throws OficioNotFoundException;
    Oficio filtrarPorNombre(String nombre) throws OficioNotFoundException;
}
