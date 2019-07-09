/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package node_util;

import java.io.File;
import static node_util.FormMain._getPathDefult64;
import static node_util.FormMain.escreverArquivoConfiguracao;

/**
 *
 * @author Taffrel Xavier <taffarel_deus@hotmail.com>
 */
public class FormInicializacao {

    public void iniciar() {

        String dir = _getPathDefult64();

        File dirMain = new File(dir);
        
        //SE NÃO EXISTIR
        if (!dirMain.exists()) {

            dirMain.mkdir();

            escreverArquivoConfiguracao("");

            new FormJDialogSettings(null, true).setVisible(true);

        } else {
            new FormMain().setVisible(true);
        }
    }

    public static void main(String[] args) {
        FormInicializacao f = new FormInicializacao();
        f.iniciar();
    }
}
