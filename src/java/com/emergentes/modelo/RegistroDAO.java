
package com.emergentes.modelo;

import java.util.ArrayList;

public class RegistroDAO {
     private int correlativo;
    private ArrayList<Registro> registros;

    public RegistroDAO() {
        registros =new ArrayList<Registro>();
    }

    public int getCorrelativo() {
        return correlativo;
    }

    public void setCorrelativo(int correlativo) {
        this.correlativo = correlativo;
    }

    public ArrayList<Registro> getRegistros() {
        return registros;
    }

    public void setRegistros(ArrayList<Registro> registros) {
        this.registros = registros;
    }
    public void insertar(Registro item){
        registros.add(item);
    }
    public void modificar(int id, Registro item){
        int pos = posicion(id);
        registros.set(pos, item);
    }
    public void eliminar(int id){
        int pos=posicion(id);
        registros.remove(pos);
    }
    public int posicion(int id){
        int i=-1;
        if(registros.size()>0){
            for(Registro item : registros){
                ++i;
                if(item.getId() == id){
                    break;
                }
            }
        }
        return i;
    } 
}
