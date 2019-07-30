/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;
import dao.AtorDao;
import javax.swing.JOptionPane;
import modelo.Ator;
import tela.manutencao.ManutencaoAtor;


/**
 *
 * @author Administrador
 */
public class ControladorAtor {

    public static void inserir(ManutencaoAtor man){
        Ator objeto = new Ator();
        objeto.setNomeArtistico(man.jtfNomeArtistico.getText());
        objeto.setNomeReal(man.jtfNomeReal.getText());
        
        boolean resultado = AtorDao.inserir(objeto);
        if (resultado) {
            JOptionPane.showMessageDialog(null, "Inserido com sucesso!");
        } else {
            JOptionPane.showMessageDialog(null, "Erro!");
        }
}
    
}
