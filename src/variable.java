public class variable {
    public static void main (String[] args) {
        int age = 27;
        System.out.println(age + "입니다.");
        //비교연산자를 이용한 예시
        boolean adult = age > 19;
        if (adult == true)
            System.out.println(age + "살은 성인");
        else
            System.out.println(age + "살은 미성년자");
    }
}
