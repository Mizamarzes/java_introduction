package com.proyectodatabase;

import com.proyectodatabase.controller.GameController;
import com.proyectodatabase.model.GameDao;
import com.proyectodatabase.view.GameView;

public class Main {
    public static void main(String[] args) {
        GameView view = new GameView();
        GameDao dao = new GameDao();
        clearConsole();
        GameController controller = new GameController(view, dao);
        controller.start();
    }
    public static void clearConsole() {
        // Secuencia de escape ANSI para limpiar la consola
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}