package tast;

public class T011 {
    public static void main(String[] args) {
        
        // task1
        class Task1 {
            byte byteValue = 10;
            char charValue = 'A';
            
            int intValue1 = byteValue; // OK
            int intValue2 = charValue; // 변수 이름을 다르게 설정해야 함
            short shortValue = charValue; // OK, char를 short로 변환 가능
            double doubleValue = byteValue; // OK
        }

        // task2
        class Task2 {
            int intValue = 10;
            char charValue = 'A';
            double doubleValue = 5.7;
            String strValue = "A";

            double var1 = (double) intValue; // 가능
            byte var2 = (byte) intValue;     // 가능
            int var3 = (int) doubleValue;    // 가능
            // char var4 = (char) strValue;   // 컴파일 에러
            // String 타입을 char 타입으로 직접 변환은 불가능
            // 이유: char는 단일 문자를 포함하지만 String은 여러 문자를 포함하기 때문이다
        }

        // task3
        class Task3 {
            byte byteValue = 10;
            float floatValue = 2.5F;
            double doubleValue = 2.5;

            // byte result = byteValue + byteValue;  // 컴파일 에러 (결과가 int 타입)
            int result1 = byteValue + byteValue;   // 가능
            float result2 = 5 + floatValue;        // 가능
            double result3 = 5 + doubleValue;      // 가능
        }

        // task4
        class Task4 {
            short s1 = 1;
            short s2 = 2;
            int i1 = 3;
            int i2 = 4;

            // short result = s1 + s2;  // 컴파일 에러 (결과가 int 타입)
            int result1 = i1 + 12;     // OK
            // short result2 = (short)(s1 + s2); // 강제 변환 필요하다
        }
    }
}
