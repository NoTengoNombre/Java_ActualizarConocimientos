/**
 * @created on : 24-sep-2017, 17:37:12
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_GUI;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.JComponent;

/**
 *
 * @author Yacoobs Cort. Mart. miercoles 10 de mayo de 2017 Esto es el comienzo
 * de lo que podria ser un eculizador Grafico es muy sencillo de hacer pero
 * podriamos complicar el codigo y llegar a darle un aspecto mas profesional
 * todo depende de que estes buscando
 *
 * Esta clase de por si sola no hace nada, es necesiario llamar a la clase y
 * pasar le los datos de las variables E1....E14 mediante sus metodos setters...
 */
public class Ecualizador_Graphics extends javax.swing.JFrame {

    public Ecualizador_Graphics() {

        setTitle("Ecualizador Grafico V.0.1");
        initComponents();
        jPanel1.add(new Ecualizador());
        try {
            img = ImageIO.read(new URL(getClass().getResource("imagen/f1.jpg").toString()));
        } catch (IOException ex) {
            Logger.getLogger(Ecualizador_Graphics.class.getName()).log(Level.SEVERE, null, ex);
        }
        setVisible(true);

    }

    public class Ecualizador extends JComponent {

        @Override
        public void paint(Graphics g) {

            super.paint(g); //To change body of generated methods, choose Tools | Templates.

            Graphics2D g2 = (Graphics2D) g;

            //Dibujamos un fondo para nuestro Ecualizador obteniendo la Dimension de jPanel
            g2.drawImage(img, 0, 0, jPanel1.getWidth(), jPanel1.getHeight(), null);

            //Dato importante las variables E ..... tienen que estar comprendidad entre valores de 0 a 130...
            //Los bubles for dibujaran nuestros pequeños cuadrados llamando al metodo cuando este prodeda
            //El metodo Math.abs() transforma el numero obtenido por E1 en positivo siempre...
            for (int x = 0; x < 130; x = x + 3) {
                if (Math.abs(E1) > x) {
                    Dibujar_Grafico(30, x, g2);
                }
            }
            for (int x = 0; x < 130; x = x + 3) {
                if (Math.abs(E2) > x) {
                    Dibujar_Grafico(60, x, g2);
                }
            }
            for (int x = 0; x < 130; x = x + 3) {
                if (Math.abs(E3) > x) {
                    Dibujar_Grafico(90, x, g2);
                }
            }
            for (int x = 0; x < 130; x = x + 3) {
                if (Math.abs(E4) > x) {
                    Dibujar_Grafico(120, x, g2);
                }
            }
            for (int x = 0; x < 130; x = x + 3) {
                if (Math.abs(E5) > x) {
                    Dibujar_Grafico(150, x, g2);
                }
            }
            for (int x = 0; x < 130; x = x + 3) {
                if (Math.abs(E6) > x) {
                    Dibujar_Grafico(180, x, g2);
                }
            }
            for (int x = 0; x < 130; x = x + 3) {
                if (Math.abs(E7) > x) {
                    Dibujar_Grafico(210, x, g2);
                }
            }
            for (int x = 0; x < 130; x = x + 3) {
                if (Math.abs(E8) > x) {
                    Dibujar_Grafico(240, x, g2);
                }
            }
            for (int x = 0; x < 130; x = x + 3) {
                if (Math.abs(E9) > x) {
                    Dibujar_Grafico(270, x, g2);
                }
            }

            for (int x = 0; x < 130; x = x + 3) {
                if (Math.abs(E10) > x) {
                    Dibujar_Grafico(300, x, g2);
                }
            }
            for (int x = 0; x < 130; x = x + 3) {
                if (Math.abs(E11) > x) {
                    Dibujar_Grafico(330, x, g2);
                }
            }
            for (int x = 0; x < 130; x = x + 3) {
                if (Math.abs(E12) > x) {
                    Dibujar_Grafico(360, x, g2);
                }
            }
            for (int x = 0; x < 130; x = x + 3) {
                if (Math.abs(E13) > x) {
                    Dibujar_Grafico(390, x, g2);
                }
            }
            for (int x = 0; x < 130; x = x + 3) {
                if (Math.abs(E14) > x) {
                    Dibujar_Grafico(420, x, g2);
                }
            }

        }
    }

    public void Dibujar_Grafico(int cordenada, int x, Graphics2D g2) {

        g2.setColor(Color.GREEN);

        if (x > 100) {
            g2.setColor(Color.RED);
        } else if (x > 80) {
            g2.setColor(Color.ORANGE);
        }
        g2.fillRoundRect(cordenada, 200 - x, 25, 2, 5, 5);

        g2.setColor(Color.BLACK);

        g2.drawRoundRect(cordenada, 200 - x, 25, 2, 5, 5);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(486, 246));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));
        jPanel1.setMaximumSize(new java.awt.Dimension(486, 486));
        jPanel1.setLayout(new java.awt.BorderLayout());

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 486, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>                        

    private BufferedImage img;
    private int E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14;

    public void setE1(int E1) {
        this.E1 = E1;
    }

    public void setE2(int E2) {
        this.E2 = E2;
    }

    public void setE3(int E3) {
        this.E3 = E3;
    }

    public void setE4(int E4) {
        this.E4 = E4;
    }

    public void setE5(int E5) {
        this.E5 = E5;
    }

    public void setE6(int E6) {
        this.E6 = E6;
    }

    public void setE7(int E7) {
        this.E7 = E7;
    }

    public void setE8(int E8) {
        this.E8 = E8;
    }

    public void setE9(int E9) {
        this.E9 = E9;
    }

    public void setE10(int E10) {
        this.E10 = E10;
    }

    public void setE11(int E11) {
        this.E11 = E11;
    }

    public void setE12(int E12) {
        this.E12 = E12;
    }

    public void setE13(int E13) {
        this.E13 = E13;
    }

    public void setE14(int E14) {
        this.E14 = E14;
    }
    // Variables declaration - do not modify                     
    private javax.swing.JPanel jPanel1;
    // End of variables declaration                   
}
