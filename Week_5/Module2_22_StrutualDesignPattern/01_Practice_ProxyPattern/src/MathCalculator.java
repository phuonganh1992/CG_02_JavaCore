import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class MathCalculator implements Calculator {
    @Override
    public double add(double first, double second) {
        return first+second;
    }

    @Override
    public double sub(double first, double second) {
        return first-second;
    }

    @Override
    public double mul(double first, double second) {
        return first*second;
    }

    @Override
    public double div(double first, double second) {
        return first/second;
    }
}
