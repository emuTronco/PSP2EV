package Sockets1;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class Cliente {
    public static void main(String[] args) throws IOException {

        Socket skt = new Socket("localhost", 80);
        Scanner sc = new Scanner(System.in);
        int num = -1;
        int num2 = -1;
        System.out.println(skt.getPort() + " | " + skt.getLocalPort() + " | " + skt.getInetAddress());
        try (DataInputStream dis = new DataInputStream(skt.getInputStream());
             DataOutputStream dos = new DataOutputStream(skt.getOutputStream())) {

            while (true) {
                System.out.print("Introduce un número: ");
                num = sc.nextInt();
                dos.writeInt(num);


            }

        }
    }
}
