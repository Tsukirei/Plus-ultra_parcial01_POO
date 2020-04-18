package com.RHFA_00118519.x;

import com.JJCF.x00049419.Empleado;

public class ServicioProfesional extends Empleado {
    private int extension;

    public ServicioProfesional(String nombre, String puesto, double salario, int extension) {
        super(nombre, puesto, salario);
        this.extension = extension;
    }

    public int getExtension() {
        return extension;
    }

    public void setExtension(int extension) {
        this.extension = extension;
    }
}