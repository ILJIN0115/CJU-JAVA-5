public class Main5 {
    public Main5() {
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int kor = 0;
        int eng = 40;
        int mat = 90;
        int sci = 85;

        int sum = kor + eng + mat + sci;
        int intAvg = sum / 4;
        double doubleAvg = sum / 4.0;

        System.out.println("합계: " + sum);
        System.out.println("정수 평균: " + intAvg);
        System.out.println("실수 평균: " + doubleAvg);
    }
}