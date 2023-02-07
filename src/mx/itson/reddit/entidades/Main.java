/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.reddit.entidades;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

/**
 *
 * @author lm
 */
public class Main {
    public static void main(String[] args) {
        
        // --- Usuarios ---
        Usuario pepito = new Usuario("Pepito", 230, "pepito@gmail.com", "contrasena123");        
        Usuario juanito = new Usuario("Juanito", 2500, "juanito@gmail.com", "juan321");
        Usuario panchita = new Usuario("Panchita", 700, "panchita@hotmail.com", "miau789");
        Usuario raccoonwithabowtie = new Usuario("raccoonwithabowtie", 3100, "raccoon@gmail.com", "safdl");
        Usuario thesamstorm = new Usuario("thesamstorm", 2500, "thesamstorm@gmail.com", "lkfadsj");

        List<Usuario> usuarios = new ArrayList<>(Arrays.asList(pepito, juanito, panchita, raccoonwithabowtie, thesamstorm));

        // --- Publicacion 1 ---
        List<Comentario> comentarios1 = new ArrayList<>();

        Publicacion publicacion1 = new Publicacion(
                pepito,
                LocalTime.now(),
                "I took a photo of my cat Daisy with cheburek today",
                "",
                comentarios1,
                197
        );

        Comentario comentario1 = new Comentario(juanito, LocalTime.now(), 13, "She's so adorable");
        Comentario comentario2 = new Comentario(panchita, LocalTime.now(), 5, "Aww, she's a sweet lady 🥹💜");
        Comentario comentario3 = new Comentario(raccoonwithabowtie, LocalTime.now(), 4, "how much i love to eat😂");
        Comentario comentario4 = new Comentario(thesamstorm, LocalTime.now(), 3, "Sweet lil thing");

        comentarios1.addAll(Arrays.asList(comentario1, comentario2, comentario3, comentario4));

        // --- Publicacion 2 ---
        List<Comentario> comentarios2 = new ArrayList<>();

        Publicacion publicacion2 = new Publicacion(
                juanito,
                LocalTime.now(),
                "Sebastian just turned 23!",
                "",
                comentarios2,
                6900
        );

        Comentario comentario5 = new Comentario(pepito, LocalTime.now(), 107, "Happy birthday sweet boy :)");
        Comentario comentario6 = new Comentario(panchita, LocalTime.now(), 147, "Happy birthday sweet boy! What’s his secret?! What do you feed him if you don’t mind me asking? :)");
        Comentario comentario7 = new Comentario(raccoonwithabowtie, LocalTime.now(), 34, "What a party animal!!");
        Comentario comentario8 = new Comentario(thesamstorm, LocalTime.now(), 324, "Happy birthday kitty");

        comentarios2.addAll(Arrays.asList(comentario5, comentario6, comentario7, comentario8));

        // --- Publicacion 3 ---
        List<Comentario> comentarios3 = new ArrayList<>();

        Publicacion publicacion3 = new Publicacion(
                panchita,
                LocalTime.now(),
                "I Saw This Stunning Cat On My Walk",
                "",
                comentarios3,
                651
        );

        Comentario comentario9 = new Comentario(pepito, LocalTime.now(), 7, "So pretty");
        Comentario comentario10 = new Comentario(pepito, LocalTime.now(), 6, "She should be a model.");
        Comentario comentario11 = new Comentario(pepito, LocalTime.now(), 2, "Stunning while sunning.");
        Comentario comentario12 = new Comentario(pepito, LocalTime.now(), 2, "She is too darn beautiful");

        comentarios3.addAll(Arrays.asList(comentario9, comentario10, comentario11, comentario12));

        List<Publicacion> publicaciones = new ArrayList<>(Arrays.asList(publicacion1, publicacion2, publicacion3));

        Sub gatitos = new Sub("Gatitos", usuarios, publicaciones);

    }
}
