package cifradocesar;

import java.awt.Color;
import java.awt.HeadlessException;
import java.awt.Label;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author israelpsiu7
 */
public class Ventana extends JFrame {

    private JTextArea cuadroTexto;
    private JTextArea resultado;
    private JTextField numeroDesplazamiento;
    private JButton boton;
    private JLabel textoUno;
    private JLabel textoDos;
    private JLabel textoTres;
    private JPanel panelUno;
    private JPanel panelDos;
    private JTextField numeroDesplazamientoDos;
    private JTextArea cuadroTextoDos;
    private JTextArea resultadoDos;
    private JButton botonDos;
    private JTabbedPane pestañas;

    public Ventana() throws HeadlessException {

        setTitle("Cifrado Cesar");
        setSize(600, 400);
        setLocationRelativeTo(null);
        
        pestañas = new JTabbedPane();
        
        panelUno = new JPanel();
        panelUno.setLayout(null);
        this.getContentPane().add(panelUno);

        textoUno = new JLabel("¿Cuantos lugares va a desplazar?");
        textoUno.setBounds(10, 10, 390, 50);
        panelUno.add(textoUno);

        textoDos = new JLabel("Ingresa algun mensaje");
        textoDos.setBounds(10, 40, 300, 50);
        panelUno.add(textoDos);

        textoTres = new JLabel("Mensaje Cifrado");
        textoTres.setBounds(10, 180, 300, 50);
        panelUno.add(textoTres);

        cuadroTexto = new JTextArea();
        cuadroTexto.setBounds(10, 80, 280, 100);
        panelUno.add(cuadroTexto);

        numeroDesplazamiento = new JTextField();
        numeroDesplazamiento.setBounds(255, 35, 80, 30);
        panelUno.add(numeroDesplazamiento);

        resultado = new JTextArea();
        resultado.setBounds(10, 220, 280, 100);
        panelUno.add(resultado);

        boton = new JButton("Cifrar");
        boton.setBounds(300, 160, 75, 20);
        boton.setBackground(Color.ORANGE);
        panelUno.add(boton);
        
        //Para el descifrado
        
        panelDos = new JPanel();
        panelDos.setLayout(null);
        this.getContentPane().add(panelDos);

        textoDos = new JLabel("¿Cuantos lugares va a desplazar?");
        textoDos.setBounds(10, 10, 390, 50);
        panelDos.add(textoDos);
        
        textoDos = new JLabel("Ingrese un mensaje cifrado:");
        textoDos.setBounds(10, 40, 300, 50);
        panelDos.add(textoDos);

        textoTres = new JLabel("Mensaje descifrado:");
        textoTres.setBounds(10, 180, 300, 50);
        panelDos.add(textoTres);

        cuadroTextoDos = new JTextArea();
        cuadroTextoDos.setBounds(10, 80, 280, 100);
        panelDos.add(cuadroTextoDos);
        
        numeroDesplazamientoDos = new JTextField();
        numeroDesplazamientoDos.setBounds(255, 35, 80, 30);
        panelDos.add(numeroDesplazamientoDos);

        resultadoDos = new JTextArea();
        resultadoDos.setBounds(10, 220, 280, 100);
        panelDos.add(resultadoDos);

        botonDos = new JButton("Descifrar");
        botonDos.setBounds(300, 160, 135, 20);
        botonDos.setBackground(Color.red);
        panelDos.add(botonDos);

        pestañas.add("Cifrado", panelUno);
        pestañas.add("Descifrado", panelDos);

        add(pestañas);

        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        this.boton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                String letras = "abcdefghijklmnñopqrstuvwxyzABCDEFGHIJKLMNÑOPQRSTUVWXYZ";
                String textoCodificado = "";
                char caracter;
                try {
                    int nnumeroDesplazamiento = Integer.parseInt(numeroDesplazamiento.getText());

                    for (int i = 0; i < cuadroTexto.getText().length(); i++) {
                        caracter = cuadroTexto.getText().charAt(i);
                        int posicion = letras.indexOf(caracter);

                        if (posicion == -1) {
                            textoCodificado += caracter;
                        } else {
                            textoCodificado += letras.charAt((posicion + nnumeroDesplazamiento)
                                    % letras.length());

                        }
                    }

                    resultado.setText(textoCodificado);
                } catch (NumberFormatException ie) {
                    JOptionPane.showMessageDialog(null, "Escribe un número " + "válido para poder desplazar", "Error de captura", JOptionPane.ERROR_MESSAGE);
                }
            }

        });
        
        this.botonDos.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                String letras = "abcdefghijklmnñopqrstuvwxyzABCDEFGHIJKLMNÑOPQRSTUVWXYZ";
                String textoDecodificado = "";
                char caracter;
                try {
                    int nnumeroDesplazamiento = Integer.parseInt(numeroDesplazamientoDos.getText());
                    

                    for (int i = 0; i < cuadroTextoDos.getText().length(); i++) {
                        caracter = textoDos.getText().charAt(i);
                        int posicion = letras.indexOf(caracter);

                        if (posicion == -1) {
                            textoDecodificado += caracter;
                        } else {
                            if ((posicion - nnumeroDesplazamiento)< 0 ){
                            textoDecodificado += letras.charAt(letras.length()+(posicion - nnumeroDesplazamiento));
                            }else{
                                textoDecodificado += letras.charAt((posicion-nnumeroDesplazamiento) % letras.length());
                            }

                        }
                    }

                    resultadoDos.setText(textoDecodificado);
                } catch (NumberFormatException ie) {
                    JOptionPane.showMessageDialog(null, "Escribe un número " + "válido para poder desplazar", "Error de captura", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        
        setVisible(true);
    }
}
     
        