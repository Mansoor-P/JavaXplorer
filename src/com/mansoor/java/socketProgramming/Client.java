package com.mansoor.java.socketProgramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public
class Client {
    public static
    void main(String[] args) throws IOException {
        Socket s=new Socket("localhost",4999);

        PrintWriter pr=new PrintWriter(s.getOutputStream());
        pr.println("How are you");
        pr.flush();

        InputStreamReader in=new InputStreamReader(s.getInputStream());
        BufferedReader br=new BufferedReader(in);

        String str=br.readLine();
        System.out.println("Server : "+ str);

    }
}
