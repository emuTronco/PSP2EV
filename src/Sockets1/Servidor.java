package Sockets1;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Servidor {
    public static void main(String[] args) throws IOException {

        ServerSocket s_skt = new ServerSocket(80);
        Socket skt = s_skt.accept();
        int num;
        try (DataInputStream dis = new DataInputStream(skt.getInputStream());
             DataOutputStream dos = new DataOutputStream(skt.getOutputStream())) {
            while (true) {
                num = dis.readInt() * 2;
                dos.writeInt(num);
            }

        }
    }
}