package com.dsapractice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class PingWebsite {
    public static void main(String[] args) throws IOException {

        List<String> pingUri = new ArrayList<>();
        pingUri.add("ping");
        pingUri.add("www.google.com");
        ProcessBuilder pb = new ProcessBuilder(pingUri);
        Process process = pb.start();
        BufferedReader input = new BufferedReader(new InputStreamReader(process.getInputStream()));
        BufferedReader error = new BufferedReader(new InputStreamReader(process.getErrorStream()));
        String s = null;
        System.out.println("Standard output --->");
        while ((s = input.readLine()) != null)
            System.out.println("s -->" + s);

        System.out.println("Error if Any ");
        while ((s = error.readLine()) != null) System.out.println("s -->" + s);
    }
}
