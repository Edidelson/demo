package com.example.demo.tcp;

import java.io.*;
import java.net.*;

/**
 * Exempo da camada de transporte TCP do modelo TCP/IP
 */
public class ServidorTCP {

    public static void main(String[] args) {
        int porta = 12345; // Porta do servidor

        try (ServerSocket serverSocket = new ServerSocket(porta)) {
            System.out.println("Servidor TCP aguardando conexões...");

            while (true) {
                Socket socket = serverSocket.accept(); // Aguarda conexão do cliente
                System.out.println("Cliente conectado: " + socket.getInetAddress());

                BufferedReader entrada = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                PrintWriter saida = new PrintWriter(socket.getOutputStream(), true);

                String mensagemRecebida = entrada.readLine();
                System.out.println("Mensagem do cliente: " + mensagemRecebida);

                saida.println("Mensagem recebida com sucesso!"); // Resposta ao cliente

                socket.close(); // Fecha conexão com o cliente
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
