/*
 * Copyright 2020 Alejandro Alberca Gallardo - alejandro.alberca.alum@iescamp.es.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.japo.java.entities;

import java.io.Serializable;
import org.japo.java.interfaces.ICosa;

/**
 *
 * @author Alejandro Alberca Gallardo - alejandro.alberca.alum@iescamp.es
 */
public class Cosa implements ICosa, Serializable {

    public static final boolean DEF_COMESTIBLEOK = false;
    private static final long serialVersionUID = 1589291902437733893L;

    private boolean comestibleOK;

    public Cosa() {
        comestibleOK = DEF_COMESTIBLEOK;
    }

    public Cosa(boolean comestibleOK) {
        this.comestibleOK = comestibleOK;
    }

    public boolean isComestibleOK() {
        return comestibleOK;
    }

    public void setComestibleOK(boolean comestibleOK) {
        this.comestibleOK = comestibleOK;
    }

    @Override
    public boolean equals(Object o) {
        boolean testOK;
        if (o == null) {
            testOK = false;
        } else if (!(o instanceof Cosa)) {
            testOK = false;
        } else {
            testOK = comestibleOK == ((Cosa) o).isComestibleOK();
        }
        return testOK;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 29 * hash + (this.comestibleOK ? 1 : 0);
        return hash;
    }

    @Override
    public String toString() {
        return String.format("%s comestible", getClass().getSimpleName(),
                comestibleOK ? "SI" : "NO");
    }

    @Override
    public void mostrarInfo() {
        System.out.println(toString());
    }

}
