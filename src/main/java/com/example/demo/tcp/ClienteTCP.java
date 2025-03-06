package com.example.demo.tcp;

import java.io.*;
import java.net.*;

/**
 * @author Edidelson
 */
public class ClienteTCP {
    public static void main(String[] args) {
        String servidor = "localhost"; // IP ou hostname do servidor
        int porta = 12345; // Porta do servidor

        try (Socket socket = new Socket(servidor, porta)) {
            PrintWriter saida = new PrintWriter(socket.getOutputStream(), true);
            BufferedReader entrada = new BufferedReader(new InputStreamReader(socket.getInputStream()));

            saida.println("Olá, servidor!"); // Envia mensagem ao servidor

            String resposta = entrada.readLine(); // Aguarda resposta
            System.out.println("Resposta do servidor: " + resposta);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
