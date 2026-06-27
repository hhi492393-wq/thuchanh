
class SolveEquation {
    public String linearEquation(double number1, double number2) {
        if (number1 == 0) {
            if (number2 == 0) {
                return "Multi roots";
            } else {
                return "No root";
            }
        } else {
            return "One root";
        }
    }
}
 Compiler
public class Main {

    public static void main(String[] args) {
        System.out.println("--- BẮT ĐẦU CHẠY KIỂM THỬ (TEST CASES) --- \n");
        testMultiRoots();
        testNoRoot();
        testOneRoot();
        
        System.out.println("\n--- HOÀN THÀNH KIỂM THỬ ---");
    }
    public static void testMultiRoots() {
        SolveEquation solver = new SolveEquation();
        String result = solver.linearEquation(0, 0);
        
        if ("Multi roots".equals(result)) {
            System.out.println("[PASS] testMultiRoots: Trả về chính xác 'Multi roots'");
        } else {
            System.out.println("[FAIL] testMultiRoots: Sai! Kết quả thực tế là: " + result);
        }
    }

    public static void testNoRoot() {
        SolveEquation solver = new SolveEquation();
        String result = solver.linearEquation(0, 5);
        
        if ("No root".equals(result)) {
            System.out.println("[PASS] testNoRoot: Trả về chính xác 'No root'");
        } else {
            System.out.println("[FAIL] testNoRoot: Sai! Kết quả thực tế là: " + result);
        }
    }

    public static void testOneRoot() {
        SolveEquation solver = new SolveEquation();
        String result = solver.linearEquation(3, 7);
        
        if ("One root".equals(result)) {
            System.out.println("[PASS] testOneRoot: Trả về chính xác 'One root'");
        } else {
            System.out.println("[FAIL] testOneRoot: Sai! Kết quả thực tế là: " + result);
        }
    }
}